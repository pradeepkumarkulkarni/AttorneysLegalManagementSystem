window.WelcomeView = Backbone.View.extend({
	initialize : function() {
		this.render();
	},
	render : function() {
		$(this.el).html(this.template);
		return this;
	},
	close : function () {
		this.unbind(); //Unbind all local event bindings
		this.model.unbind('change', this.render, this);//Unbind reference 
		this.remove(); //Remove view from DOM
		delete this.$el; //Delete the jQuery wrapped object variable
		delete this.el; //Delete the variable reference to this node
		app.currentView = undefined;
	}
});