var app = new Object();
window.MainRouter = Backbone.Router.extend ({
	
	initialize : function () {
		console.log("Launching main router...");
		this.login();
	},
	
	routes: {
			"" : "login"
	},
	
	login : function(){
		var loginView = new LoginView({});
		$('#content').html(loginView.el);
	}
});


templateLoader.load([ "LoginView" ], function() {
	app.mainRouter = new MainRouter();
	Backbone.history.start();
});