package com.hb.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import jakarta.validation.constraints.Min;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends Superlative {

@Column(unique = true ,nullable = false)
private String username;
@Column(nullable = false)
private String password;
@Min(value = 18)
private int age;
@Column(columnDefinition = "varchar(30) default 'employee'")
private String grade;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User( String username, String password, int age) {
	super();
	this.username = username;
	this.password = password;
	this.age = age;
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

public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}






}
