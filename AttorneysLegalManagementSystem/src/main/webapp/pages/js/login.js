$(document).ready(function(){
	$("#btnSubmit").click();
	showLogin();
	 $('.dropdown-toggle').dropdown();
});

function showLogin() {
	console.log("url to send: " + getURL() + "/lawyersPich/login"),
	$.ajax({
		url : getURL() + "/lawyersPich/login",		
		type: "get",
//		beforeSend: function(xhr) {		
//			alert("antes de mandar");
//		},
        success: function(response) {
        	 $("#body").html(response);        	 
        }, 
        fail: function(error) {
        	alert("el error es:" + error);
        }
	});
}

function showMainMenu() {
	$.ajax({		
		url : getURL() + "/lawyersPich/menuManager",	
		type: "get",
//		beforeSend: function(xhr) {		
//			alert("antes de mandar");
//		},

        success: function(response) {
        	 $("#body").html(response);
        	 $("#header").show();
        	 $("#footer").show();
        }, 
        fail: function(error) {
        	alert("el error es:" + error);
        }
	
	});
}

