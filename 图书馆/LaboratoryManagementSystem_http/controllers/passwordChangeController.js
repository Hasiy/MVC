/**
 * Created by Administrator on 2017-04-30.
 */
app.controller('passwordChangeController',['$rootScope','$scope','$http',function($rootScope,$scope,$http) {

    $scope.UID = window.sessionStorage.getItem('UID');//用户id
    $scope.UPwd = window.sessionStorage.getItem('UPwd');//密码

    $scope.orgPassword = "";
    $scope.newPassword = "";
    $scope.againNewPassword = "";

    $scope.i="";//(0为空 1为旧密码输入错误 2为新旧密码一样 3为两次新密码不一致)

    $scope.passChange=function(){
        if( $scope.orgPassword== ""|| $scope.newPassword == ""|| $scope.againNewPassword == ""){
            console.log("不能为空");
            return false;
        }else if($scope.newPassword.length<6|| $scope.againNewPassword.length<6 || $scope.newPassword.length>19|| $scope.againNewPassword.length>19){
            console.log("密码长度不能小于6位或者大于18位");
            return false;
        }else{
            if( $scope.orgPassword===$scope.UPwd){
                if($scope.UPwd!=$scope.newPassword||$scope.UPwd!=$scope.againNewPassword){
                    if($scope.newPassword===$scope.againNewPassword){
                        var postData = "?UID=" + $scope.UID + "&" + "newPassword=" + $scope.newPassword;
                        var url = "http://localhost:8080/LaboratoryManagementSystem/PwdChange" + postData;
                        $http.post(url).success(function (data) {
                            console.log(postData);
                            console.log(data);
                            alert("修改成功 请重新登录");
                            window.location.href = 'login.html';
                        })
                    }else{
                        $scope.i=3;
                        console.log($scope.i);
                        console.log("两次新密码不一致");
                    }
                }else{
                    $scope.i=2;
                    console.log($scope.i);
                    console.log("新旧密码一样");
                }
            }else{
                $scope.i=1;
                console.log($scope.i);
                console.log("旧密码输入错误");
            }
        }
    }
}]);












