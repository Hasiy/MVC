//����ȫ��ģ��
var app = angular.module('app', ['ui.router', 'ngFileUpload']);
var logApp = angular.module('logApp', ['logApp.services']);
//�������ģ��
var services = angular.module('logApp.services', []);

//CORS��������
/*app.config(function($httpProvider) {
 $httpProvider.defaults.useXDomain = true;
 delete $httpProvider.defaults.headers.common['X-Requested-With'];
 });*/

//���������������
/*app.run(function($rootScope) {
 $rootScope.dataSource = 'http://localhost:8080/LaboratoryManagementSystem/';
 });*/

