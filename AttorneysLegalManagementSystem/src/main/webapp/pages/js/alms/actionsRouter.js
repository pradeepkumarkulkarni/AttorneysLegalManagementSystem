var ActionsRouter = Backbone.Router.extend({

	initialize: function() {
		
	},

	routes : {
		"documentsList" : "documentListView",
		"usersList" : "usersListView",
		"newUser" : "newUserView"
	}, 
	
	documentListView : function () {
		var documents = new DocumentCollection();
		documents.fetch({
			success: function() {	
				this.documentView = new DocumentListView({collection: documents});
				$('#content').html(this.documentView.el);
			}, error: function() {
				alert("Something failed!");
			}
		});
		
	},
	
	usersListView : function () {
		var user = new User();	
		user.fetch({
			success: function() {	
				this.usersListView = new UsersListView({model:user});
				$('#content').html(this.usersListView.el);
			}, error: function() {
				alert("Something failed!");
			}
		});
	},
	
	newUserView : function () {
		var profiles = new ProfileCollection();
		profiles.fetch({
			success: function() {	
				this.userView = new NewUserView({collection:profiles});
				$("#content").html(this.userView.el);
			}, error: function() {
				alert("Something failed!");
			}
		});
	}
});