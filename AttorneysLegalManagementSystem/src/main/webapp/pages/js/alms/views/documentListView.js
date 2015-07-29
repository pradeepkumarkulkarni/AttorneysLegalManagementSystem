window.DocumentListView = Backbone.View.extend({
	initialize : function () {
		this.render();
	},
	
	render : function () {
		$(this.el).html("");
		var docTmpl = _.template(
					'<div class="accordion" id="accordionDoc">\
					  <div class="accordion-group">\
					    <div class="accordion-heading">\
					      <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordionDoc" href="#inputsDoc">\
					        B&uacute;squeda avanzada\
					      </a>\
					    </div>\
					    <div id="inputsDoc" class="accordion-body collapse">\
					      <div class="accordion-inner">\
							<form class="form-inline">\
							  <div class="form-group">\
							    <label for="inputDoc"></label>\
							    <input type="text" class="form-control" id="inputDoc" placeholder="Ingrese el n&uacute;mero de folio">\
								<button type="submit" class="btn btn-primary">Buscar</button>\
							  </div>\
							  </form>\
					      </div>\
					    </div>\
					  </div>\
				   </div>\
				</div>\
				<table id="docListTable" class="table table-striped">\
					<th>Nombre de documento</th>\
					<th>Cadena de bytes para generar documento</th>\
				</table>');
		$(this.el).append(docTmpl);
		
		_.each (this.collection.models, function (data){
			$("#docListTable", this.el).append(new DocumentListItemView({model : data }).render().el);
		}, this);
		
		return this;
	}
});

window.DocumentListItemView = Backbone.View.extend({
	tagName: "tr",
	
	initialize: function () {
		console.log("in doc item view");
		this.render();
	},
	
	render : function () {
		$(this.el).html(this.template(this.model.toJSON()));
		return this;
	}
});
