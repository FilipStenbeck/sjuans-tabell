var app = app || {};

app.DataCollection  = Backbone.Collection.extend({
	model: app.Data,
	
    baseUrl : "service/data/",
   
    
	// Because the service doesn't return an array of models we need to point Backbone.js at the correct property
    parse: function(resp, xhr) {
        return resp.seven;
    }
});
