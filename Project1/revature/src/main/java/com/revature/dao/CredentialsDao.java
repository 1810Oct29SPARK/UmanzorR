package com.revature.dao;

import java.util.List;

import com.revature.beans.Credentials;

public interface CredentialsDao {

	public List<Credentials> getCredentials();

	public void addCredentials(String username, String password, int id );

	public void updateCredentials(String username, String password, int id);

	public void deleteCredentialsByEmployeeId(int id);

	public int getCredentialsEmployeeUsername(String username);
	
	public Credentials login(String username, String password);



}
