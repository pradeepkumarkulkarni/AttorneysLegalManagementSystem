window.Document = Backbone.Model.extend({
	attributeId : "",
	
	url : function (){
		return serverURL + '/rest/document/getDocument';
	},
	
	defaults: {
		"documentId" : "",
		"documentString" : ""
	}
});

window.DocumentCollection = Backbone.Collection.extend({
	model: Document,
	
	url : function (){
		return serverURL + '/rest/document/getAllDocuments';
	},
	
});