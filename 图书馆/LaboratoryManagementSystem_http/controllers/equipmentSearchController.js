/**
 * Created by Administrator on 2017/5/5.
 */
app.controller('equipmentSearchController', ['$rootScope', '$scope', '$http', function ($rootScope, $scope, $http) {
    $scope.Search = "";

    $scope.equipmentSearch=function(){
        if($scope.Search == ""){
            $scope.Search = "SearchALL";
            console.log($scope.Search);
            var postData = "?Search=" + $scope.Search;
            var url = "http://localhost:8080/LaboratoryManagementSystem/EquipmentSearch" + postData;
            console.log("aaaa"+postData);
            $http.post(url).success(function (data) {
                $scope.dataSearch=data;

                var i;
                var list="";
                for(i=0;i<$scope.dataSearch.length;i++){
                    list+=
                        "<tr>"+
                        "<td>"+(i+1)+ "</td>"+
                        "<td>"+$scope.dataSearch[i].TID+ "</td>"+
                        "<td>"+$scope.dataSearch[i].TName+ "</td>"+
                        "<td>"+($scope.dataSearch[i].TType==1?"设备":"消耗品")+ "</td>"+
                        "<td>"+$scope.dataSearch[i].TCount+ "</td>"+
                        "<td>"+($scope.dataSearch[i].TClass==0?"库房":$scope.dataSearch[i].TClass)+ "</td>"+
                        "<td>"+($scope.dataSearch[i].TStatus==1?"可使用":"损坏")+ "</td>"+
                        "<td>"+$scope.dataSearch[i].TSpec+ "</td>"+
                        "<td>"+$scope.dataSearch[i].TUnit+ "</td>"+
                        "<td>"+$scope.dataSearch[i].TUse+ "</td>"+
                        "<td>"+$scope.dataSearch[i].TConfiguration+ "</td>"+
                        "<td>"+$scope.dataSearch[i].TCreatData+ "</td>"+
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
            var url = "http://localhost:8080/LaboratoryManagementSystem/EquipmentSearch"+postData;
            console.log("ccc"+postData);
            $http.post(url).success(function (data) {
                $scope.dataSearch=data;
                console.log(data);
                $scope.look = function (){
                    $scope.DpdateTID=this.d.TID;
                    $scope.DpdateTName=this.d.TName;
                    $scope.DpdateTType=this.d.TType;
                    $scope.DpdateTCount=this.d.TCount;
                    $scope.DpdateTClass= this.d.TClass;
                    $scope.DpdateTStatus= this.d.TStatus;
                    $scope.DpdateTSpec= this.d.TSpec;
                    $scope.DpdateTUnit= this.d.TUnit;
                    $scope.DpdateTUse= this.d.TUse;
                    $scope.DpdateTConfiguration= this.d.TConfiguration;
                    $scope.DpdateTCreatData= this.d.TCreatData;
                    console.log($scope.DpdateUName);
                }
            })
        }
    }
    $scope.reload=function(){
        /*window.location.replace('#url');*///
        window.self.location.reload();

    }
}]);

