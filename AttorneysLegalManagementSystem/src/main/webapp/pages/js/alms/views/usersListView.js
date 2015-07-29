window.UsersListView = Backbone.View.extend({
	initialize : function (options) {
		this.model = options.model;
		this.render();
	},
	
	render : function () {
		$(this.el).html(this.template(this.model.toJSON()));
		return this;
	}
});