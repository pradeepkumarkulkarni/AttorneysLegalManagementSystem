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
		"click #saveUserBtn" : "saveUser",
		"click #clearFormBtn" : "cleanUserForm"
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
					$("#name").prop("disabled", true);
					$("#pass").prop("disabled", true);
					$("#profile").prop("disabled", true);
					$("#saveUserBtn").prop("disabled", true);
					$("#clearFormBtn").show();
					
					if(response == 100) {					
						$(".alert").show().html("El usuario se ha creado satisfactoriamente.");
					}
				}, error : function (response){
					alert(response);
				}
			});
		}
	},
	
	cleanUserForm : function(event) {
		event.preventDefault();
		$("#name").prop("disabled", false).val('');
		$("#pass").prop("disabled", false).val('');
		$("#profile").prop("disabled", false);
		$("#saveUserBtn").prop("disabled", false);
		$("#clearFormBtn").hide();
		$(".alert").hide();
	}
});