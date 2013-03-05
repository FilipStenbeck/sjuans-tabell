var app = app || {};

app.DataView = Backbone.View.extend({
   
    initialize: function () {
        this.coll = new app.DataCollection();
        this.coll.on('reset', this.loaded, this);
    },
    el: $("#data_container"),
    render: function () {
    	//variable declaration
        var that = this, i = 4,reverse = false;
               
        //Render the buttons
        $(that.el).html(_.template( $("#btn_template").html()));
        
        //Then inject the model into the underscore template
        _.each(this.coll.models, function (obj) {
            $(that.el).append(_.template($("#data_template").html(), 
        		{
        			'i' : i, 
        			'operator' : obj.get("operator"), 
        			'result' : obj.get("result")
        		}
            ));    
            
            //change loop variable to control the offset of the spans
            if (reverse) {
                i--;
            } else {
                i++;
            }
            if (i === 6) {
                reverse = true;
            }
            if (i === 1) {
                reverse = false;
            }  
        });
        return this;
    },
    
    //methods
    loadData : function (amount) {
    	
        var that = this;
        if (!amount) {
            amount = 100;
        }
        
        this.coll.url =  this.coll.baseUrl + amount;
        
        this.coll.fetch({
                        
            success: function (data) {
                that.render();    
            },
            error : function (collection) {
                collection.reset(); 
                $('.alert').addClass('alert-error');
                $('.alert').html('Hoppsan något galet gick på tok...');             
            }
        });
    },
    loaded : function (collection) {
    	$('#load-msg').addClass('in');
    	$('#load-msg span').first().html(collection.length);
    	$("#first-load").hide();
      
       
    },
    showAll : function (event) {
       $('.span4').fadeIn("slow");
    },
    hideItem : function (event) {
         $(event.currentTarget).fadeOut("slow");
    },
    hitchhikersGuide : function (event) {
    	this.loadData(42);
   },
    events: {
        "click .span4" : "hideItem",
        "click .show-all" : "showAll",
        "click .btn-primary" : "hitchhikersGuide"
    }
});
