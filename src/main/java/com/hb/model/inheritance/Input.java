package com.hb.model.inheritance;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Input extends Device {
private int capacite;

public int getCapacite() {
	return capacite;
}

public void setCapacite(int capacite) {
	this.capacite = capacite;
}

}
