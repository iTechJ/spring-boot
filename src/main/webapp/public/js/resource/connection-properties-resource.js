app.factory('ConnectionProperties', ['$resource', function($resource) {
    return $resource('/properties', {}, {
        get: {
            method: "GET",
            isArray: false
        }
    });
}]);