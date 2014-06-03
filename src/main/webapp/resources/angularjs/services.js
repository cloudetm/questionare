'use strict';

/* Services */
angular.module('questionare.services', ['ngResource'])
  .service('resultsService', function ($resource){
     var _questions;
    return {
      setResults: function(questions) {
        _questions = questions;
      },
      getResults: function (){
        return _questions;
      }
    };
  });
