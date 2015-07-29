var ActionsRouter = Backbone.Router.extend({

	initialize: function() {
		
	},

	routes : {
		"documentsList" : "documentListView",
		"usersList" : "usersListView"
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
		
	}
});