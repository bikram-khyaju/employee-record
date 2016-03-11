var app = angular.module("Demo",["ngRoute"])
                  .config(function($routeProvider){
                    $routeProvider
                      .when("/home",{
                        templateUrl: "home",
                        controller: "homeController"
                      })
                      .when("/courses",{
                        templateUrl: "courses",
                        controller: "coursesController"
                      })
                      .when("/studentList",{
                        templateUrl: "studentList",
                        controller: "studentsController"
                      })
                      .otherwise({
                        redirectTo: "/home.html" 
                      })
                  })
                  .controller("homeController",function($scope){
                    $scope.message = "Home Page"
                  })
                  .controller("coursesController", function($scope){
                    $scope.courses=["C#","C++","java","VB.net","AngularJS","JQuery","HTML"];
                  })
                  .controller("studentsController", function($scope){
                    $scope.students=["Bikram","Ram","Anand","Baby","Sweety","Tiger"];
                  })