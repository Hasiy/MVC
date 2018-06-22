/**
 * Created by Administrator on 2017/5/5.
 */

app.controller('equipmentStatusSearchController', ['$rootScope', '$scope', '$http', function ($rootScope, $scope, $http) {

    $scope.Search = "";
    $scope.TStatus =  "";
    $scope.equipmentSearch=function(){
        if($scope.Search == ""){
            $scope.Search = "SearchALL";
            $scope.TStatus =  "";
            console.log($scope.Search);
            var postData = "?Search=" + $scope.Search;
            var url = "http://localhost:8080/LaboratoryManagementSystem/EquipmentSearch" + postData;
            console.log("aaaa"+postData);
            $http.post(url).success(function (data) {
                $scope.dataSearch=data;
            })
        }else {
            $scope.TStatus =  "";
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




    $scope.TStatusSearch=function(){
        $scope.Search = "SearchTStatus";
        var postData = "?Search=" + $scope.Search + "&" + "TStatus=" + $scope.TStatus;
        console.log(postData);
        var url = "http://localhost:8080/LaboratoryManagementSystem/EquipmentSearch" + postData;
        $http.post(url).success(function (data) {
            $scope.dataSearch=data;
            console.log(postData);
            console.log(data);
        })
    }

    $scope.TID= ""; //物品编号（物品专有编号，参照实验室物品编号规则）
    $scope.TName= ""; //物品名称（设备、物品名称）
    $scope.TType= ""; //物品类型（设备为1、消耗品为2）
    $scope.TCount= ""; //物品数量
    $scope.TClass= ""; //物品归属教室（没有归属为0，表示在库房）
    $scope.TStatus= 1; //物品状态（可使用为1、损坏为2）
    $scope.TSpec= ""; //物品规格（毫升等等）
    $scope.TUnit= ""; //单位（台、件等等）
    $scope.TUse= ""; //用途说明（设备或物品使用说明）
    $scope.TConfiguration= ""; //器材配置
    $scope.TRecord= ""; //使用记录（自动生成，用户无法填写）

    $scope.updateequipment = function (){
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
        $scope.DpdateTRecord= this.d.TRecord;
        console.log($scope.DpdateUName);
    }

    $scope.updateequipmentpass = function (){
        if($scope.DpdateTID==""||$scope.DpdateTName==""||$scope.DpdateTType==""||$scope.DpdateTCount==""
            ||$scope.DpdateTClass==""||$scope.DpdateTStatus==""||$scope.DpdateTSpec==""
            ||$scope.DpdateTUnit==""||$scope.DpdateTUse==""||$scope.DpdateTConfiguration==""){
            console.log("不能为空");
            return false;
        }else{
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
            var updateurl = "http://localhost:8080/LaboratoryManagementSystem/EquipmentUpdate" + postData;
             $http.post(updateurl).success(function (data) {
               /*  window.location.reload();*/
                 console.log(postData);
                 console.log(data);



                 $scope.RecordingUID= window.sessionStorage.getItem('UID');
                 $scope.RecordingUname= window.sessionStorage.getItem('UName');
                 if( $scope.DpdateTStatus== 1){
                     $scope.RecordingNote= "状态更改为可以使用";
                 }else {
                     $scope.RecordingNote= "状态更改为损坏";
                     if($scope.DpdateTClass==0){
                         $scope.RecordingNote= "状态更改为损坏并存入库房";
                     }
                 }
                 $scope.SearchRecording = "SearchALL";

                 var RecordingpostData = "?RecordingUID=" + $scope.RecordingUID
                     + "&" + "RecordingUname=" + $scope.RecordingUname
                     + "&" + "DpdateTID=" + $scope.DpdateTID
                     + "&" + "DpdateTName=" + $scope.DpdateTName
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