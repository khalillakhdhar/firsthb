package com.hb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;

@Entity
public class User {
@Id
private long id;
@Column(unique = true)
private String username;
private String password;
@Min(value = 18)
private int age;
@Column(columnDefinition = "varchar(30) default 'employee'")
private String grade;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(long id, String username, String password, int age) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.age = age;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}






}
