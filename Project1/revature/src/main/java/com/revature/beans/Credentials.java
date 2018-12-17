package com.revature.beans;


public class Credentials {


		public Credentials(String username, String password, int id) {
			super();
			this.username = username;
			this.password = password;
			this.id = id;
			
		}

		public Credentials() {
		}

		private String username;
		private String password;
		private int id;
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "Credentials [username=" + username + ", password=" + password + ", id=" + id + ", getUsername()="
					+ getUsername() + ", getPassword()=" + getPassword() + ", getId()=" + getId() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		

}

