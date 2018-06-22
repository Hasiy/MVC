/**
 * Created by Administrator on 2017/5/14.
 */

app.controller('equipmentRepairController', ['$rootScope', '$scope', '$http', function ($rootScope, $scope, $http) {
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
        })
    }

    $scope.equipmentRepair=function(){
        $scope.RepairTID = this.d.TID;
        $scope.RepairTName = this.d.TName;
        console.log($scope.RepairTID);
        var postData = "?RepairTID=" + $scope.RepairTID ;
        console.log(postData);
        var url = "http://localhost:8080/LaboratoryManagementSystem/EquipmentRepair" + postData;
        $http.post(url).success(function (data) {
            $scope.dataSearch=data;
            console.log(postData);
            console.log(data);

            $scope.RecordingUID= window.sessionStorage.getItem('UID');
            $scope.RecordingUname= window.sessionStorage.getItem('UName');
            $scope.SearchRecording = "SearchALL";
            $scope.RecordingNote= "报修";


            var RecordingpostData = "?RecordingUID=" + $scope.RecordingUID
                + "&" + "RecordingUname=" + $scope.RecordingUname
                + "&" + "DpdateTID=" + $scope.RepairTID
                + "&" + "DpdateTName=" + $scope.RepairTName
                + "&" + "RecordingNote=" + $scope.RecordingNote
                + "&" + "SearchRecording=" + $scope.SearchRecording;
            console.log("RecordingpostData111111:"+RecordingpostData);
            var Recordingurl = "http://localhost:8080/LaboratoryManagementSystem/RecordingADD" + RecordingpostData;
            $http.post(Recordingurl).success(function (data) {
                console.log("RecordingpostData:"+RecordingpostData);
                window.location.reload();
            });
        })
    }
}]);