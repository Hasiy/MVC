//定义全局模块
var app = angular.module('app', ['ui.router', 'ngFileUpload']);
var logApp = angular.module('logApp', ['logApp.services']);
//定义服务模块
var services = angular.module('logApp.services', []);

//CORS跨域配置
/*app.config(function($httpProvider) {
 $httpProvider.defaults.useXDomain = true;
 delete $httpProvider.defaults.headers.common['X-Requested-With'];
 });*/

//根作用域参数设置
/*app.run(function($rootScope) {
 $rootScope.dataSource = 'http://localhost:8080/LaboratoryManagementSystem/';
 });*/

