/**
 * Created by Administrator on 2017/4/17.
 */
app.controller('userSearchController', [ '$rootScope', '$scope', '$http', function ($rootScope, $scope, $http) {
    $scope.Search = "";
    $scope.UPriority= "";
    $scope.Usex= "";
    $scope.userSearch=function(){
        if($scope.Search == ""){
            $scope.Search = "SearchALL";
            var postData = "?Search=" + $scope.Search;
            var url = "http://localhost:8080/LaboratoryManagementSystem/UserSearch"+postData;
            console.log(postData);
            $http.post(url).success(function (data) {
                $scope.dataSearch=data;
                console.log(data);

                var i;
                var list="";
                for(i=0;i<$scope.dataSearch.length;i++){
                    list+=
                            "<tr>"+
                                "<td>"+(i+1)+ "</td>"+
                                "<td>"+$scope.dataSearch[i].UName+ "</td>"+
                                "<td>"+($scope.dataSearch[i].UPriority==1?'管理员':'实验员')+ "</td>"+
                                "<td>"+($scope.dataSearch[i].USex==1?"男":"女")+ "</td>"+
                                "<td>"+$scope.dataSearch[i].UIDcard+ "</td>"+
                                "<td>"+$scope.dataSearch[i].UPosition+ "</td>"+
                                "<td>"+$scope.dataSearch[i].UMajor+ "</td>"+
                            "</tr>"
                }
                $('tbody').append(list);
                console.log("list===="+list);

                $(document).ready(function(){
                    $("#dt").DataTable();
                });

            })
        }else {
            var postData = "?Search=" + $scope.Search;
            var url = "http://localhost:8080/LaboratoryManagementSystem/UserSearch"+postData;
            console.log(postData);
            $http.post(url).success(function (data) {
                $scope.dataSearch=data;
                console.log(data);

                var i;
                var list="";
                for(i=0;i<$scope.dataSearch.length;i++){
                    list+=
                        "<tr>"+
                        "<td>"+(i+1)+ "</td>"+
                        "<td>"+$scope.dataSearch[i].UName+ "</td>"+
                        "<td>"+($scope.dataSearch[i].UPriority==1?'管理员':'实验员')+ "</td>"+
                        "<td>"+($scope.dataSearch[i].USex==1?"男":"女")+ "</td>"+
                        "<td>"+$scope.dataSearch[i].UIDcard+ "</td>"+
                        "<td>"+$scope.dataSearch[i].UPosition+ "</td>"+
                        "<td>"+$scope.dataSearch[i].UMajor+ "</td>"+
                        "</tr>"
                }
                $('tbody').append(list);
                console.log("list===="+list);

                $(document).ready(function(){
                    $("#dt").DataTable();
                });

            })
        }
    }

    $scope.userSearchUPriority=function(){
        if( $scope.UPriority==""){
            console.log("请选择")
            return false;
        }else{
            $scope.Search = "SearchUPriority";
            var postData = "?Search=" + $scope.Search+ "&" + "UPriority=" + $scope.UPriority;
            var url = "http://localhost:8080/LaboratoryManagementSystem/UserSearch"+postData;
            console.log(postData);
            $http.post(url).success(function (data) {
                $scope.dataSearch=data;
                console.log(data);

                var i;
                var list="";
                for(i=0;i<$scope.dataSearch.length;i++){
                    list+=
                        "<tr>"+
                        "<td>"+(i+1)+ "</td>"+
                        "<td>"+$scope.dataSearch[i].UName+ "</td>"+
                        "<td>"+($scope.dataSearch[i].UPriority==1?'管理员':'实验员')+ "</td>"+
                        "<td>"+($scope.dataSearch[i].USex==1?"男":"女")+ "</td>"+
                        "<td>"+$scope.dataSearch[i].UIDcard+ "</td>"+
                        "<td>"+$scope.dataSearch[i].UPosition+ "</td>"+
                        "<td>"+$scope.dataSearch[i].UMajor+ "</td>"+
                        "</tr>"
                }
                $('tbody').append(list);
                console.log("list===="+list);

                $(document).ready(function(){
                    $("#dt").DataTable();
                });

            })
        }

    }

    $scope.userSearchSex=function(){
        if( $scope.Usex==""){
            console.log("请选择")
            return false;
        }else {
            $scope.Search = "Searchsex";
            var postData = "?Search=" + $scope.Search + "&" + "Usex=" + $scope.Usex;
            var url = "http://localhost:8080/LaboratoryManagementSystem/UserSearch" + postData;
            console.log(postData);
            $http.post(url).success(function (data) {
                $scope.dataSearch = data;
                console.log(data);

                var i;
                var list="";
                for(i=0;i<$scope.dataSearch.length;i++){
                    list+=
                        "<tr>"+
                        "<td>"+(i+1)+ "</td>"+
                        "<td>"+$scope.dataSearch[i].UName+ "</td>"+
                        "<td>"+($scope.dataSearch[i].UPriority==1?'管理员':'实验员')+ "</td>"+
                        "<td>"+($scope.dataSearch[i].USex==1?"男":"女")+ "</td>"+
                        "<td>"+$scope.dataSearch[i].UIDcard+ "</td>"+
                        "<td>"+$scope.dataSearch[i].UPosition+ "</td>"+
                        "<td>"+$scope.dataSearch[i].UMajor+ "</td>"+
                        "</tr>"
                }
                $('tbody').append(list);
                console.log("list===="+list);

                $(document).ready(function(){
                    $("#dt").DataTable();
                });

            })
        }
    }
    $scope.reload=function(){
        /*window.location.replace('#url');*///
        window.self.location.reload();

    }
}]);