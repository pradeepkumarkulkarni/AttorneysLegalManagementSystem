/**
 * The Login View component to handle UI events.
 */
window.LoginView = Backbone.View.extend({

	initialize : function() {
		this.render();
	},

	render : function() {
		$(this.el).html(this.template());
		return this;
	},
	
	events: {
		"click #loginBtn" : "loginUser"
	},
	
	loginUser : function() {
		var user = $("#userName").val();
		var pass = $("#userPass").val();
		app.mainRouter.navigate("welcome", true);
	}
});
