app.factory('Record', ['$resource', function($resource) {
    return $resource('/record');
}]);