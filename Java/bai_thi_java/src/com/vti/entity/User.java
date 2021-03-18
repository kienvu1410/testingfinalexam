package com.vti.entity;

public class User {
private int id;
private String fullName;
private String passWord;
private String email;
private Role role;
public User(int id, String fullName, String passWord, String email, Role role) {
	super();
	this.id = id;
	this.fullName = fullName;
	this.passWord = passWord;
	this.email = email;
	this.role = role;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String toString() {
	return "User [id=" + id + ", FullName=" + fullName + ", Email=" + email + ", role=" + role + "]";
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;

}
}
