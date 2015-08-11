window.Profile = Backbone.Model.extend({
	attributeId: "",
	
	url : function() {                        
        return serverURL + '/rest/profile/getProfile';
    },
	
	defaults : {
		idProfile : 0,
		name : "",
		description : ""
	}
});

window.ProfileCollection = Backbone.Collection.extend({
	model : Profile,
	url : function() {
		return serverURL + '/rest/profile/getAllProfiles';
	}
});