'use strict';

angular.module('SGarden.rewards', [
    'ngRoute'
])

.config([    '$stateProvider', '$urlRouterProvider',
    function ($stateProvider,   $urlRouterProvider){

            $stateProvider
                .state("rewards", {
                    url:"/rewards",
                    templateUrl: "apps/components/rewards.html",
//                    resolve: {
//                            reservService: ['reservService',
//                              function( reservService){
//
//                                return reservService.reservation();                          
//                          }]
//                      },
                    controller: ['$scope', '$state',
                        function($scope, $state){
 
                        //$scope.ajReserv = reservService.data.reservation;
                    }]
                })
                .state("rewards.login", {
                        url:"/login",
                        views: {
                            "rewardsLogin": {
                                templateUrl: "apps/components/rewardsLogin.html",
                                controller: ['$scope', '$state',
                                    function($scope, $state){
                                        $scope.loginForm = {};
                                        
                                        $scope.processForm = function(){
                                            
                                        };
                                    
                                }]
                            }
                                

                        }
                    });
                       
}]);