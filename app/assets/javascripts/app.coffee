app = angular.module 'speakerfeedbackApp', []

app.controller 'EnqueteCtrl', ($scope, $http) ->
    $http.get('/enquete/test').success (enquete) ->
        $scope.enquete = enquete

    $scope.submitAnswer = (enquete) ->
        $http.post '/enquete/test/answer',
            enqueteId: enquete.id
            questions: enquete.questions.map (question) ->
                questionId: question.id,
                answer: question.answer
