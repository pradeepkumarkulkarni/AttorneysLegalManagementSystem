window.User = Backbone.Model.extend({
	attributeId: "",
	
	url : function() {                        
        return serverURL + '/rest/user/getUser';
    },
	
	defaults : {
		idUser : 0,
		pass: "",
		name : "",
		profile : "",
		lastLoginDate : "",
		status : ""
	}
});

window.UsersCollection = Backbone.Collection.extend({
	model : User,
	url: 'user/getAllUsers',
});