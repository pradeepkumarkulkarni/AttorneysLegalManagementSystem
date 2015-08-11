window.NewUserView = Backbone.View.extend({
	initialize: function (options) {
		this.profiles = options.collection;
		this.render();
	},
	
	render : function() {
		$(this.el).html(this.template);
				
		var profileArrayObject = new Array();
		profilesArray = this.profiles.toJSON();
		
		for (var i=0;i < profilesArray.length;i++) {
			var profile = new Object();
			profile.id = profilesArray[i].idProfile;
			profile.text = profilesArray[i].name;
			profileArrayObject.push(profile);
		}
		
		$("#profile", this.el).select2({
            placeholder: "Seleccione perfil",
            width: '140',
            data: profileArrayObject
		});
	},
	
	events : {
		"click #saveUserBtn" : "saveUser"
	},
	
	saveUser : function(event) {
		event.preventDefault();
		
		var name = $("#name").val();
		var pass = $("#pass").val();
		var profile = $("#profile").val();
		
		var user = new User();
		user.set("pass", pass);
		user.set("name", name);
		user.set("profile", profile);
		user.set("lastLoginDate" , new Date());
		user.set("status", "Active");
		
		if(user.isNew()) {
			user.url = serverURL + '/rest/user/saveUser';
			user.save(null, {
				beforeSend: function (request){
					request.setRequestHeader("Authorization", "Just a header here!");
				}, 
				success: function (jhx, response){
					alert(response);
				}, error : function (response){
					alert(response);
				}
			});
		}
	}
});