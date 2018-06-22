/**
 * Created by Administrator on 2017/4/20..
 */
app.controller('userInfoController', ['$rootScope', '$scope', '$http', function ($rootScope, $scope, $http) {

    $scope.UID = window.sessionStorage.getItem('UID');//用户id
    $scope.UPwd = window.sessionStorage.getItem('UPwd');//密码
    $scope.UName = window.sessionStorage.getItem('UName');//用户姓名
    $scope.UPriority = window.sessionStorage.getItem('UPriority');//权限(管理员1，普通用户2)
    $scope.USex = window.sessionStorage.getItem('USex');//性别（男为1、女为2）
    $scope.UIDcard = window.sessionStorage.getItem('UIDcard');//身份证号
    $scope.UPosition = window.sessionStorage.getItem('UPosition');//职位
    $scope.UMajor = window.sessionStorage.getItem('UMajor');//专业系别

    console.log($scope.UID);


}]);