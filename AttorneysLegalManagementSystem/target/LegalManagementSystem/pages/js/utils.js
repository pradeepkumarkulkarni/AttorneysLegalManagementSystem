/*
 * This is the generic functions.
 */

/**
 * Get the URL.
 */

function getURL() {
//	var url = location.protocol + '//' + location.hostname + (location.port ? ':' + location.port : '');
//	console.log("url: " + url);
	var origin = window.location.origin;
	var url = origin + '/LawyersManagementControl/v1';
	console.log("URL: " + url);
	return url;
}
