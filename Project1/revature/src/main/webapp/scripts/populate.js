
let employee = {};

window.onload = function(){
	populateUser();
}

function populateUser(){
	//send a GET request to localhost:7001/SessionMgmtDemo/session
	fetch("http://localhost:7001/project1/session").then(function(response) {
		return response.json();
	}).then(function(data){
		//check whether there was a valid session returned
		//define behavior for no user returned 
		if (data.session === null) {
			console.log("data.session was null");
			window.location = "http://localhost:7001/project1/login";
		} else {
			//define behavior for user returned
			employee = data;
			document.getElementById("firstname").innerText = employee.firstname;
			document.getElementById("lastname").innerText = employee.lastname;
			document.getElementById("email").innerText = employee.email;
		}
	});
	

	
	
}