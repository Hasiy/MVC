/**
 * Created by Administrator on 2017/5/5.
 */
app.controller('equipmentClassSearchController', ['$rootScope', '$scope', '$http', function ($rootScope, $scope, $http) {

    var dataClassSearchurl = "http://localhost:8080/LaboratoryManagementSystem/ClassSearchAll";
    $http.post(dataClassSearchurl).success(function (data) {
        $scope.dataClassSearch=data;
        console.log("dataClassSearch="+$scope.dataClassSearch);
        console.log(data);
    })


    $scope.TClass = "";
    $scope.TClassSearch=function(){
        $scope.Search = "SearchClass";

        var postData = "?Search=" + $scope.Search + "&" + "TClass=" + $scope.TClass;
        console.log(postData);
        var url = "http://localhost:8080/LaboratoryManagementSystem/EquipmentSearch" + postData;
         $http.post(url).success(function (data) {
             $scope.dataSearch=data;
             console.log(postData);
             console.log(data);

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
                     "<td>"+$scope.dataSearch[i].TClass+ "</td>"+
                     "<td>"+($scope.dataSearch[i].TStatus==1?"可使用":"损坏")+ "</td>"+
                     "<td>"+$scope.dataSearch[i].TSpec+ "</td>"+
                     "<td>"+$scope.dataSearch[i].TUnit+ "</td>"+
                     "<td>"+$scope.dataSearch[i].TConfiguration+ "</td>"+
                     "</tr>"
             }
             $('tbody').append(list);
             console.log("list===="+list);

             $(document).ready(function(){
                 $("#dt").DataTable();
             });

         })
    }

    $scope.reload=function(){
        /*window.location.replace('#url');*///
        window.self.location.reload();

    }
}]);