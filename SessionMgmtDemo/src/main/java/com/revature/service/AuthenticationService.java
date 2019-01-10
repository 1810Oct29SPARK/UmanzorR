package com.revature.service;

import com.revature.model.Credentials;
import com.revature.model.User;

public class AuthenticationService {

	public AuthenticationService() {
	}
	
	public User isValidUser(Credentials credentials){
		User u = null;
		String username = credentials.getUsername();
		String password = credentials.getPassword();		
		//this is ATHUENTICATION(does this user exist in the system)
		//now AUTHORIZATION(what can the user access)
		//take credentials and return the user to which it belongs if it exists
		if (username != null && password != null) {
			if (username.equals("Merlin") && password.equals("Wizard")) {
				u = new User(5,username,"Merlin","Cat","wizcat@tampa.com");
			}
			
		}
		
		return u;
		
	}

}
