var app = app || {};

app.Data = Backbone.Model.extend({
	
	
	initialize: function() {
		this.on("change:operator change:result", function() {
			console.log("woot");
			app.dataView.render();
		});
	}
});



//RANDOM UNRELATED TESTS BELOW IGNORE THIS


/*
 var user = new app.User();
 user.set("name","Filip");
 user.save();
 */

app.User = Backbone.Model.extend({
	
	urlRoot : "service/data/user"
});



app.NodeData = Backbone.Model.extend({
	
	
	initialize: function() {
		var self = this;
		this.on("change", function(self) {
			console.log("woot!");

		});
	},
	
	urlRoot: "http://127.0.0.1:1337/foo/hej hur är det"
});

/*
 * 
 Paste these in a the chrome console
 * 
 * 
  
--------- 
GETTERS
  
var first = app.dataView.coll.models[0];
console.log(first.get("operator"));
console.log(first.get("result"));

----
SETTERS

var updated = app.dataView.coll.models[1];
updated.set("operator", "Filip was here, och han ");
updated.set("result", "super-cool");

-----------
SETTERS 2

var updated = app.dataView.coll.models[2];
updated.set({operator: "Filip was here, och han ",result : "super-cool"});

-------------------
UNDERSCORE ITERATOR

_.each(app.dataView.coll.models, function(model) {
	console.log(model.get("operator"));
	console.log(model.get("result"));
});

*/