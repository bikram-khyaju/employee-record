var app = angular
		.module("Demo", [ "ngRoute" ])
		.config(function($routeProvider) {
			$routeProvider.when("/home", {
				templateUrl : "home",
				controller : "homeController"
			}).when("/courses", {
				templateUrl : "courses",
				controller : "coursesController"
			}).when("/employeeList", {
				templateUrl : "employeeList",
				controller : "employeeController"
			}).when("/add", {
				templateUrl : "addEmployee",
				controller : "employeeController"
			}).when("/editEmployee/:id", {
				templateUrl : "editEmployee",
				controller : "employeeController"
			})
			
			.otherwise({
				redirectTo : "/home.html"
			})
		})
		.controller("homeController", function($scope) {
			$scope.message = "Home Page"
		})
		.controller(
				"coursesController",
				function($scope) {
					$scope.courses = [ "C#", "C++", "java", "VB.net",
							"AngularJS", "JQuery", "HTML" ];
				})
		.controller(
				"employeeController",
				function($scope, $http,$location,$routeParams) {
					/* $scope.students=["Bikram","Ram","Anand","Baby","Sweety","Tiger"]; */

					$scope.getData = function() {
						console.log("Employee called");
						$http.get('getAllEmployees').then(
								function response(data) {
									$scope.employees = data.data;

								});
					}
					$scope.getData();

					// Searching
					$scope.search = function(item) {
						if ($scope.searchText === undefined) {
							return true;
						} else if (item.firstName.toLowerCase().indexOf(
								$scope.searchText.toLowerCase()) != -1
								|| item.lastName.toLowerCase().indexOf(
										$scope.searchText.toLowerCase()) != -1) {
							return true;
						} else
							return false;

					};

					// Sorting data
					$scope.sortData = function(column) {
						console.log("Bikram");
						$scope.reverseSort = ($scope.sortColumn == column) ? !$scope.reverseSort
								: false;
						$scope.sortColumn = column;
					};
					$scope.getSortClass = function(column) {
						if ($scope.sortColumn == column) {
							return $scope.reverseSort ? 'arrow-down'
									: 'arrow-up'
						}
						return '';
					};
					
					//Delete employee
					$scope.deleteEmployee = function(id){
						console.log("delete employee")
						$http.get('deleteEmployee/' + id).then(function successCallback(response) {
							$scope.getData();
							$location.path("/employeeList");
						  })
					}
					
					//Edit Employee
					
					if($routeParams.id!=null){
						$http.get('editEmployee/'+$routeParams.id)
						.then (function response(data){
							console.log("Employee Called");
							console.log(data.data);
							
							$scope.employee = data.data;
							
						})
					}
					
					$scope.save = function() {
						console.log("Entered into save");
						$http.post('save', $scope.employee).then(
								function response(data) {
									console.log("Saved Data= " + data.data);
								});
					}
					
					$scope.editEmployee = function(id){
						
						
					}

				}).controller("addController", function($scope) {
			$scope.message = "Employee added successfully!!!";
		}).controller(
				"formControler",
				function($scope, $http) {

					$scope.save = function() {
						console.log("Entered into save");
						$http.post('save', $scope.employee).then(
								function response(data) {
									console.log("Saved Data= " + data.data);
								});
					}
				})