package com.hb.model.inheritance;

import jakarta.persistence.Entity;

@Entity
public class Keyboard extends Input {
private String mode;

public String getMode() {
	return mode;
}

public void setMode(String mode) {
	this.mode = mode;
}



}
