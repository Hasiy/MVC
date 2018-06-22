var app = angular.module('app');

//б╥си
app.config(function($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise('/welcome');
    $stateProvider
        .state('default', {
            url: '',
            views: {
                'main': {
                    templateUrl: 'views/welcome.html',
                    controller:'welcomeController'
                }
            }
        })
        .state('welcome',{
            url: '/welcome',
            views: {
                'main': {
                    templateUrl: 'views/welcome.html',
                    controller:'welcomeController'
                }
            }
        })
        .state('userInfo', {
            url: '/userInfo',
            views: {
                'main': {
                    templateUrl: 'views/userInfo.html',
                    controller:'userInfoController'

                }
            }
        })
        .state('passwordChange', {
            url: '/passwordChange',
            views: {
                'main': {
                    templateUrl: 'views/passwordChange.html',
                    controller:'passwordChangeController'
                }
            }
        })
        .state('userSearch', {
            url: '/userSearch',
            views: {
                'main': {
                    templateUrl: 'views/userSearch.html',
                    controller:'userSearchController'
                }
            }
        })
        .state('userManagement', {
            url: '/userManagement',
            views: {
                'main': {
                    templateUrl: 'views/userManagement.html',
                    controller:'userManagementController'
                }
            }
        })
        .state('equipmentSearch', {
            url: '/equipmentSearch',
            views: {
                'main': {
                    templateUrl: 'views/equipmentSearch.html',
                    controller:'equipmentSearchController'
                }
            }
        })
        .state('equipmentClassSearch', {
            url: '/equipmentClassSearch',
            views: {
                'main': {
                    templateUrl: 'views/equipmentClassSearch.html',
                    controller:'equipmentClassSearchController'
                }
            }
        })
        .state('equipmentStatusSearch', {
            url: '/equipmentStatusSearch',
            views: {
                'main': {
                    templateUrl: 'views/equipmentStatusSearch.html',
                    controller:'equipmentStatusSearchController'
                }
            }
        })
        .state('equipmentADD', {
            url: '/equipmentADD',
            views: {
                'main': {
                    templateUrl: 'views/equipmentADD.html',
                    controller:'equipmentADDController'
                }
            }
        })
        .state('equipmentChange', {
            url: '/equipmentChange',
            views: {
                'main': {
                    templateUrl: 'views/equipmentChange.html',
                    controller:'equipmentChangeController'
                }
            }
        })
        .state('equipmentRepair', {
            url: '/equipmentRepair',
            views: {
                'main': {
                    templateUrl: 'views/equipmentRepair.html',
                    controller:'equipmentRepairController'
                }
            }
        })
        .state('Recording', {
            url: '/Recording',
            views: {
                'main': {
                    templateUrl: 'views/Recording.html',
                    controller:'RecordingController'
                }
            }
        })



});