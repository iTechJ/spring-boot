app.controller('HomeController', ['$scope', 'ConnectionProperties', 'Record', 'Config',
    function ($scope, ConnectionProperties, Record, Config) {
        ConnectionProperties.get(function (data) {
            $scope.connection = data;
        });

        Record.query(function (data) {
            $scope.records = data;
        });

        Config.get(function(data) {
            $scope.config = data;
        })
    }]);