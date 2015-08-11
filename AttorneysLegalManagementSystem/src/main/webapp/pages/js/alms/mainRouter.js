var app = new Object();
app.currentView;
var serverURL;

// Console fix for IE.
if (!window.console) console = {log : function() {}};

window.MainRouter = Backbone.Router.extend({
	initialize : function() {
		console.log("Launching main router...");
		serverURL = location.protocol + '//' + location.hostname + (location.port ? ':' + location.port : '') + "/AttorneysLegalManagementSystem";
		console.log("serverURL:" + serverURL);
	},

	routes : {
		"" : "showLogin",
		"welcome" : "showWelcome"
	},

	showLogin : function() {
		var loginView = new LoginView({});
		$('#content').html(loginView.el);
	},

	showWelcome : function() {
		var welcome = new WelcomeView({});
		$("#content").html(welcome.el);
		$('.carousel').carousel({
			interval : 2500,
			cycle: true
		});
		this.loadMainMenu();
	},
	
	loadMainMenu : function() {
		var header = new HeaderView({});
		$("#header").html(header.el);
		$("#footer").html(new FooterView({}).el);
	}
});

templateLoader.load([ "LoginView", "WelcomeView", "HeaderView", "FooterView", "DocumentListView", "UsersListView", 
                      "DocumentListItemView", "NewUserView"], function() {
	app.mainRouter = new MainRouter();
	app.actionsRouter = new ActionsRouter();
	Backbone.history.start();
});