import * as angular from 'angular';

export default angular.module('hello', [])
    .controller('home', ['$scope', '$http', function($scope, $http) {
        $http.get('/api/v1/resource/').then(function(response) {
            $scope.greeting = response.data;
        })
    }])
    .name;