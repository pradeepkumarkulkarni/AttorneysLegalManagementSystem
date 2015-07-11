var ActionsRouter = Backbone.Router.extend({

	initialize: function() {
		
	},

	routes : {
		"documentList" : "documentListView"
	}, 
	
	documentListView : function () {
		this.documentView = new DocumentListView({});
		$('#content').html(this.documentView.el);
	}
});