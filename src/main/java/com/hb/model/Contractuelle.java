package com.hb.model;

import jakarta.persistence.Entity;

@Entity
public class Contractuelle extends User {
private int dureeContrat;

public int getDureeContrat() {
	return dureeContrat;
}

public void setDureeContrat(int dureeContrat) {
	this.dureeContrat = dureeContrat;
}



}
