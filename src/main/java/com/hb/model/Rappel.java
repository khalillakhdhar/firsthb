package com.hb.model;



import jakarta.persistence.Entity;


@Entity
public class Rappel extends Superlative {
	
	private String texte;
	
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	
	
	
	
	
	
	
}
