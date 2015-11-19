/**
 * The User model.
 */
window.User = Backbone.Model.extend({
	
	idAttribute: "idUser",
	
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

/**
 * The user collection.
 */
window.UserCollection = Backbone.Collection.extend({

	model : User,
	
	url: function () {
		var url = serverURL + '/rest/user/getAllUsers';
		return url;
	}
});