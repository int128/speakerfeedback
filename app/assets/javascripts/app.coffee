app = angular.module 'speakerfeedbackApp', []

app.controller 'EnqueteCtrl', ($scope, $http) ->
    $http.get('/enquete/test').success (enquete) ->
        $scope.enquete = enquete

    $scope.submitQuestionAnswers = (questions) ->
        $http.post '/enquete/test/answer', questions.map (question) ->
            questionId: question.id,
            answer: question.answer
