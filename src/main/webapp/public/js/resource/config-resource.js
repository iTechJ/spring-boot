app.factory('Config', ['$resource', function($resource) {
    return $resource('/config', {}, {
        get: {
            method: "GET",
            isArray: false
        }
    });
}]);