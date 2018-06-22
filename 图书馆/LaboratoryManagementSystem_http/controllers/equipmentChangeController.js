
/**
 * Created by Administrator on 2017/5/5.
 */
app.controller('equipmentChangeController', ['$rootScope', '$scope', '$http', function ($rootScope, $scope, $http) {

    $scope.Search= "";

    $scope.equipmentSearch=function(){
        if($scope.Search == ""){
            $scope.Search = "";
            var postData = "?Search=" + $scope.Search;
            var url = "http://localhost:8080/LaboratoryManagementSystem/EquipmentChange" + postData;
            $http.post(url).success(function (data) {
                $scope.dataSearch=data;
                console.log("bbbb"+postData);
                console.log(data);
            })
        }else {
            var postData = "?Search=" + $scope.Search;
            var url = "http://localhost:8080/LaboratoryManagementSystem/EquipmentChange"+postData;
            $http.post(url).success(function (data) {
                $scope.dataSearch=data;
                console.log(data);
            })
        }
    }

    $scope.updateequipment = function (){
        $scope.DpdateTID= this.d.TID; //物品编号（物品专有编号，参照实验室物品编号规则）
        $scope.DpdateTName= this.d.TName; //物品名称（设备、物品名称）
        $scope.DpdateTType= this.d.TType; //物品类型（设备为1、消耗品为2）
        $scope.DpdateTCount= this.d.TCount; //物品数量
        $scope.DpdateTClass= this.d.TClass; //物品归属教室（没有归属为0，表示在库房）
        $scope.DpdateTStatus= this.d.TStatus; //物品状态（可使用为1、损坏为2）
        $scope.DpdateTSpec= this.d.TSpec; //物品规格（毫升等等）
        $scope.DpdateTUnit= this.d.TUnit; //单位（台、件等等）
        $scope.DpdateTUse= this.d.TUse; //用途说明（设备或物品使用说明）
        $scope.DpdateTConfiguration= this.d.TConfiguration; //器材配置
        $scope.DpdateTRecord= this.d.TRecord; //使用记录（自动生成，用户无法填写）

        var postData = "?DpdateTID=" + $scope.DpdateTID
            + "&" + "DpdateTName=" + $scope.DpdateTName
            + "&" + "DpdateTType=" + $scope.DpdateTType
            + "&" + "DpdateTCount=" + $scope.DpdateTCount
            + "&" + "DpdateTClass=" + $scope.DpdateTClass
            + "&" + "DpdateTStatus=" + $scope.DpdateTStatus
            + "&" + "DpdateTSpec=" + $scope.DpdateTSpec
            + "&" + "DpdateTUnit=" + $scope.DpdateTUnit
            + "&" + "DpdateTUse=" + $scope.DpdateTUse
            + "&" + "DpdateTConfiguration=" + $scope.DpdateTConfiguration
            + "&" + "DpdateTRecord=" + $scope.DpdateTRecord;
        console.log(postData);
        var url = "http://localhost:8080/LaboratoryManagementSystem/EquipmentChange"+postData;
        $http.post(url).success(function (data) {
           /* window.location.reload();*/
            $scope.dataSearch=data;
            console.log(data);

            $scope.RecordingUID= window.sessionStorage.getItem('UID');
            $scope.RecordingUname= window.sessionStorage.getItem('UName');

            $scope.RecordingNote= "分配到"+$scope.DpdateTClass+"实验室";

            $scope.SearchRecording = "SearchALL";

            var RecordingpostData = "?RecordingUID=" + $scope.RecordingUID
                + "&" + "RecordingUname=" + $scope.RecordingUname
                + "&" + "DpdateTID=" + $scope.DpdateTID
                + "&" + "DpdateTName=" + $scope.DpdateTName
                + "&" + "RecordingNote=" + $scope.RecordingNote
                + "&" + "SearchRecording=" + $scope.SearchRecording;
            console.log( RecordingpostData);


            var Recordingurl = "http://localhost:8080/LaboratoryManagementSystem/RecordingADD" + RecordingpostData;
            $http.post(Recordingurl).success(function (data) {
                console.log("RecordingpostData:"+RecordingpostData);
                window.location.reload();
            });
        })
    }



}]);