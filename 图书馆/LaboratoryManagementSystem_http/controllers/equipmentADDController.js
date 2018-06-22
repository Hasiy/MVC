/**
 * Created by Administrator on 2017/5/5.
 */
app.controller('equipmentADDController', ['$rootScope', '$scope', '$http', function ($rootScope, $scope, $http) {

    $scope.addTID= ""; //物品编号（物品专有编号，参照实验室物品编号规则）
    $scope.addTName= ""; //物品名称（设备、物品名称）
    $scope.addTType= ""; //物品类型（设备为1、消耗品为2）
    $scope.addTCount= ""; //物品数量
    $scope.addTClass= ""; //物品归属教室（没有归属为0，表示在库房）
    $scope.addTStatus= 1; //物品状态（可使用为1、损坏为2）
    $scope.addTSpec= ""; //物品规格（毫升等等）
    $scope.addTUnit= ""; //单位（台、件等等）
    $scope.addTUse= ""; //用途说明（设备或物品使用说明）
    $scope.addTConfiguration= ""; //器材配置
    $scope.addTRecord= ""; //使用记录（自动生成，用户无法填写）

    $scope.resetact=function(){
        $scope.addTID= ""; //物品编号（物品专有编号，参照实验室物品编号规则）
        $scope.addTName= ""; //物品名称（设备、物品名称）
        $scope.addTType= ""; //物品类型（设备为1、消耗品为2）
        $scope.addTCount= ""; //物品数量
        $scope.addTClass= ""; //物品归属教室（没有归属为0，表示在库房）
        $scope.addTStatus= 1; //物品状态（可使用为1、损坏为2）
        $scope.addTSpec= ""; //物品规格（毫升等等）
        $scope.addTUnit= ""; //单位（台、件等等）
        $scope.addTUse= ""; //用途说明（设备或物品使用说明）
        $scope.addTConfiguration= ""; //器材配置
        $scope.addTRecord= ""; //使用记录（自动生成，用户无法填写）
    };
    $scope.addequipment = function (){
        if($scope.addTID==""||$scope.addTName==""||$scope.addTType==""||$scope.addTCount==""||$scope.addTClass==""||$scope.addTStatus==""||$scope.addTSpec==""||$scope.addTUnit==""||$scope.addTUse==""||$scope.addTConfiguration==""){
            console.log("null");
            return false;
        }else{
            var postData = "?addTID=" + $scope.addTID
                + "&" + "addTName=" + $scope.addTName
                + "&" + "addTType=" + $scope.addTType
                + "&" + "addTCount=" + $scope.addTCount
                + "&" + "addTClass=" + $scope.addTClass
                + "&" + "addTStatus=" + $scope.addTStatus
                + "&" + "addTSpec=" + $scope.addTSpec
                + "&" + "addTUnit=" + $scope.addTUnit
                + "&" + "addTUse=" + $scope.addTUse
                + "&" + "addTRecord=" + $scope.addTRecord
                + "&" + "addTConfiguration=" + $scope.addTConfiguration;
            var addurl = "http://localhost:8080/LaboratoryManagementSystem/EquipmentADD" + postData;
            console.log(postData);
            $http.post(addurl).success(function (data) {
                alert("添加成功");
               /* window.location.reload();*/
                console.log(postData);
                console.log(data);

                $scope.RecordingUID= window.sessionStorage.getItem('UID');
                $scope.RecordingUname= window.sessionStorage.getItem('UName');

                $scope.SearchRecording = "SearchALL";
                $scope.RecordingNote= "添加本设备";

                var RecordingpostData = "?RecordingUID=" + $scope.RecordingUID
                    + "&" + "RecordingUname=" + $scope.RecordingUname
                    + "&" + "DpdateTID=" + $scope.addTID
                    + "&" + "DpdateTName=" + $scope.addTName
                    + "&" + "RecordingNote=" + $scope.RecordingNote
                    + "&" + "SearchRecording=" + $scope.SearchRecording;

                var Recordingurl = "http://localhost:8080/LaboratoryManagementSystem/RecordingADD" + RecordingpostData;
                $http.post(Recordingurl).success(function (data) {
                    console.log("RecordingpostData:"+RecordingpostData);
                    window.location.reload();
                });
            });
        }
    }
}]);