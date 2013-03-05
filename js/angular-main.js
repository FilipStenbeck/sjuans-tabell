function sjuanCtrl($scope, $http) {
	
	 $http.get('service/data/100').success(function(data) {
		 $scope.sevens = data.seven;
	});
	   
}

