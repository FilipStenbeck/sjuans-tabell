var app = app || {};

(function () {
    app.dataView = new app.DataView();
    app.dataView.loadData();
    app.dataRouter =  new app.DataRouter();
    Backbone.history.start();
}());


