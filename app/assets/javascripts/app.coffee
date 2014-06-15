app = angular.module 'speakerfeedbackApp', []

app.controller 'EnqueteCtrl', ($scope, $http) ->
    $http.get('/enquete/test').success (enquete) ->
        $scope.enquete = enquete
