/**
 * Created by Administrator on 2017/4/11..
 */
app.controller('welcomeController', ['$rootScope', '$scope', '$location', function ($rootScope, $scope, $location) {
    $scope.jump = function (url) {
        $location.path(url);
    }
}]);