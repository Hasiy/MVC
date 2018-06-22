/**
 * Created by Administrator on 2017/4/17.
 */
app.controller('homeController', ['$rootScope', '$scope', '$http', function ($rootScope, $scope, $http) {
    $scope.name= window.sessionStorage.getItem('UName');
    $scope.Priority= window.sessionStorage.getItem('UPriority');
    if($scope.Priority==1){
        $scope.judgment=true;
        console.log("true");
    }
}]);