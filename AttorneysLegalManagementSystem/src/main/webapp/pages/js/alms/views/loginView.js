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
	}
});
