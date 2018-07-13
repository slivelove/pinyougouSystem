app.controller('indexController',function($scope,loginService){
	$scope.showLoginName=function(){
		loginService.getName().success(
				function(response){
					$scope.loginName = response.loginName;
				});
	}
});