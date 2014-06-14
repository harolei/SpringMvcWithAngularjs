function LoginController($scope, $http) {
  $scope.user = {
    username: "",
    password: ""
  };

 $scope.sendLoginRequest = function() {
      $http.post('http://localhost:8080/springREST/register', $scope.user).success(function(data) {
        $scope.message = data;
      });
    };
}