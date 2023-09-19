package com.hb.model;

import jakarta.persistence.Entity;

@Entity
public class Chef extends User {
private String secteur;
private String description;
public String getSecteur() {
	return secteur;
}
public void setSecteur(String secteur) {
	this.secteur = secteur;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}




}
