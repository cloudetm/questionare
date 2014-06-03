angular.module('questionare', ['ngRoute', 'questionare.filters', 'questionare.services', 'questionare.directives'])
	.config(['$routeProvider', function($routeProvider) {
		
		$routeProvider.when('/questions', {
			templateUrl: 'questions.html',
			controller: 'QuestionsController'
			});
		
		$routeProvider.when('/questions/:questionNo', {
			templateUrl:'questions.html',
			controller: 'QuestionsController'
			});

		$routeProvider.when('/results', {
			templateUrl:'results.html',
			controller: 'ResultsController'
			});

		$routeProvider.otherwise({redirectTo:'/questions'});
}]);
