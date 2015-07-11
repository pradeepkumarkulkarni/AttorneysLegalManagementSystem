window.HeaderView = Backbone.View.extend({
	initialize : function() {
		this.render();
	},

	render : function() {
		$(this.el).html(this.template);
		return this;
	},
	events : {
		"click #logout" : "logout"
	},

	logout : function() {
		$(".header").empty();
		$(".footer").empty();
		app.mainRouter.navigate("", {trigger : true, replace : true});// router handles view change
		
		//app.mainRouter.navigate(""); only url is updated
	}
});