/**
 * Created by Administrator on 2017/4/17.
 */
app.controller('userManagementController', ['$rootScope', '$scope', '$http', function ($rootScope, $scope, $http) {
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
            })
        }else {
            var postData = "?Search=" + $scope.Search;
            var url = "http://localhost:8080/LaboratoryManagementSystem/UserSearch"+postData;
            console.log(postData);
            $http.post(url).success(function (data) {
                $scope.dataSearch=data;
                console.log(data);
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
            })
        }

    }

    $scope.userSearchSex=function(){
        if( $scope.UPriority==""){
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
            })
        }
    }

    $scope.addUID= "";//用户id
    $scope.addUPwd= "";//密码
    $scope.addUName= "";//用户姓名
    $scope.addUPriority= "";//权限(管理员1，普通用户2)
    $scope.addUSex= "";//性别（男为1、女为2）
    $scope.addUIDcard= "";//身份证号
    $scope.addUPosition= "";//职位
    $scope.addUMajor= "";//专业系别

    $scope.resetact=function(){
        $scope.addUID= "";
        $scope.addUPwd= "";
        $scope.addUName= "";
        $scope.addUPriority= "";
        $scope.addUSex= "";
        $scope.addUIDcard= "";
        $scope.addUPosition= "";
        $scope.addUMajor= "";
    };
    $scope.adduesr = function (){
        if($scope.addUID==""||$scope.addUPwd==""||$scope.addUName==""||$scope.addUPriority==""||$scope.addUSex==""||$scope.addUIDcard==""||$scope.addUPosition==""||$scope.addUMajor==""){
            console.log("不能为空");
            return false;
        }else{
        var postData = "?addUID=" + $scope.addUID
            + "&" + "addUPwd=" + $scope.addUPwd
            + "&" + "addUName=" + $scope.addUName
            + "&" + "addUPriority=" + $scope.addUPriority
            + "&" + "addUSex=" + $scope.addUSex
            + "&" + "addUIDcard=" + $scope.addUIDcard
            + "&" + "addUPosition=" + $scope.addUPosition
            + "&" + "addUMajor=" + $scope.addUMajor;
            var addurl = "http://localhost:8080/LaboratoryManagementSystem/UserADD" + postData;
            $http.post(addurl).success(function (data) {
                window.location.reload();
                console.log(postData);
                console.log(data);
            });
        }
    }
    $scope.deleteuser = function (){
        var postDataDelete = "?DeleteUID=" + this.d.UID;
        var urlSearch = "http://localhost:8080/LaboratoryManagementSystem/UserDelete" + postDataDelete;
        console.log(postDataDelete);
        $http.post(urlSearch).success(function (data) {
            window.location.reload();
            console.log(postDataDelete);
            console.log(data);
        })
    }

    $scope.updateuser = function (){
        $scope.DpdateUID=this.d.UID;
        $scope.DpdateUPwd=this.d.UPwd;
        $scope.DpdateUName=this.d.UName;
        $scope.DpdateUPriority=this.d.UPriority;
        $scope.DpdateUSex= this.d.USex;
        $scope.DpdateUIDcard= this.d.UIDcard;
        $scope.DpdateUPosition= this.d.UPosition;
        $scope.DpdateUMajor= this.d.UMajor;
        console.log($scope.DpdateUName);
    }

    $scope.updateuserpass = function (){
        if($scope.DpdateUID==""||$scope.DpdateUPwd==""||$scope.DpdateUName==""||$scope.DpdateUPriority==""
            ||$scope.DpdateUSex==""||$scope.DpdateUIDcard==""||$scope.DpdateUPosition==""||$scope.DpdateUMajor==""){
            console.log("不能为空");
            return false;
        }else{
            var postData = "?DpdateUID=" + $scope.DpdateUID
                + "&" + "DpdateUPwd=" + $scope.DpdateUPwd
                + "&" + "DpdateUName=" + $scope.DpdateUName
                + "&" + "DpdateUPriority=" + $scope.DpdateUPriority
                + "&" + "DpdateUSex=" + $scope.DpdateUSex
                + "&" + "DpdateUIDcard=" + $scope.DpdateUIDcard
                + "&" + "DpdateUPosition=" + $scope.DpdateUPosition
                + "&" + "DpdateUMajor=" + $scope.DpdateUMajor;
            console.log(postData);
            var updateurl = "http://localhost:8080/LaboratoryManagementSystem/UserUpdate" + postData;
            $http.post(updateurl).success(function (data) {
                console.log(postData);
                console.log(data);
                /*window.location.reload();*/
            });
        }
    }

}]);