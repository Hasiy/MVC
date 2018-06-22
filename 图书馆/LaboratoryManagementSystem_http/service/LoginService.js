/**
 * Created by Administrator on 2017/4/11.
 */
var app = angular.module("loginApp", []);
app.controller("Login", function ($scope, $http, $rootScope) {

    $scope.resetInfo = function () {
        $scope.uidlogin = "";
        $scope.upwdlogin = "";
    }
    $scope.submit = function () {
        if ($scope.uidlogin == "" || $scope.upwdlogin == "") {
           /* alert("用户或密码不能为空");*/
            console.log("用户或密码不能为空");
            return false;
        } else {
            var postData = "?uidlogin=" + $scope.uidlogin + "&" + "upwdlogin=" + $scope.upwdlogin;
            var url = "http://localhost:8080/LaboratoryManagementSystem/LoginAction" + postData;
            $http.post(url).success(function (data) {
                console.log(postData);
                console.log(data);
                window.sessionStorage.setItem('UID', data[0].UID);//用户id
                window.sessionStorage.setItem('UPwd', data[0].UPwd);//密码
                window.sessionStorage.setItem('UName', data[0].UName);//用户姓名
                window.sessionStorage.setItem('UPriority', data[0].UPriority);//权限(管理员1，普通用户2)
                window.sessionStorage.setItem('USex', data[0].USex);//性别（男为1、女为2）
                window.sessionStorage.setItem('UIDcard', data[0].UIDcard);//身份证号
                window.sessionStorage.setItem('UPosition', data[0].UPosition);//职位
                window.sessionStorage.setItem('UMajor', data[0].UMajor);//专业系别
               /* $scope.asd= window.sessionStorage.getItem('UName');
                 console.log($scope.asd);*/
                window.location.href = 'home.html';
            });
        };
    }
});