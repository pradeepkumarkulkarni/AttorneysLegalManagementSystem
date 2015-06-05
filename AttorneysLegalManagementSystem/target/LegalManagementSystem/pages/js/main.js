$(document).ready(function(){
	$("#documentationQuery").click(showDocumentationList);
});

function showDocumentationList() {
	console.log("sendig to queryList...");
	$.ajax({
		url: getURL() + "/documentation/getList",
		type: "get",
		success: function(response) {
			$("#body").html(response);
		},
		fail: function(error) {
			alert("error: " + error);
		}
	});
}