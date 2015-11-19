var ActionsRouter = Backbone.Router.extend({

	initialize: function() {
		
	},

	routes : {
		"documentsList" : "documentListView",
		"usersList" 	: "usersListView",
		"newUser" 		: "newUserView"
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
		var users = new UserCollection();	
		users.fetch({
			success: function() {	
				this.userListView = new UserListView({collection : users});
				$('#content').html(this.userListView.el);
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