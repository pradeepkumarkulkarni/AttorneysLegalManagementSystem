window.UserListView = Backbone.View.extend({
	initialize : function (options) {
		this.users = options.collection;
		this.render();
	},
	
	render : function () {
//		$(this.el).html(this.template(this.model.toJSON()));
		
		$(this.el).html("");
		var usersTmpl = _.template(
			'<table id="userListTable" class="table table-striped">\
				<th>ID de usuario</th>\
				<th>Nombre de usuario</th>\
				<th>Perfil</th>\
				<th>&Uacuteltimo ingreso</th>\
				<th>Estatus</th>\
			</table>'
		);
		
		$(this.el).append(usersTmpl);
		
		_.each(this.users.models, function (data){
			$("#userListTable", this.el).append(new UserListItemView ({model:data}).render().el);
		}, this);
		
		return this;
	}
});

window.UserListItemView = Backbone.View.extend({
	
	tagName : "tr",
	
	initialize: function (){
		this.render();
	},
	
	render: function (){
		$(this.el).html(this.template(this.model.toJSON()));		
		return this;
	}
});