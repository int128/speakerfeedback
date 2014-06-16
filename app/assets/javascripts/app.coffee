app = angular.module 'speakerfeedbackApp', []

app.controller 'EnqueteCtrl', ($scope, $http) ->
    $http.get('/enquete/test').success (enquete) ->
        $scope.enquete = enquete

    $scope.submitAnswer = (enquete) ->
        $http.post('/enquete/test/answer', enquete)
