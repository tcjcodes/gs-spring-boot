angular.module('hello', [])
    .controller('home', function($scope, $http) {
        $http.get('/resource/').then(function(response) {
            $scope.greeting = response.data;
        })
    });