package br.com.altamira.data.rest;

public class AuthTokenChkRespDataBean {
	private String accessToken;
	private String userName;
	private String lastName;
	private String loggedinSince;
	private String firstName;
	private String theme;
	private String userId;
	private String email;
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLoggedinSince() {
		return loggedinSince;
	}
	public void setLoggedinSince(String loggedinSince) {
		this.loggedinSince = loggedinSince;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
