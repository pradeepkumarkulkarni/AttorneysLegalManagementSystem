window.User = Backbone.Model.extend({
	
	attributeId: "",
	
	defaults : {
		idUser : 0,
		name : "",
		profile : ""
	}
});


window.UsersCollection = Backbone.Collection.extend({
	model : User,
	
});