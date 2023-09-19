package com.hb.model.inheritance;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Output extends Device{
private String resolution;

public String getResolution() {
	return resolution;
}

public void setResolution(String resolution) {
	this.resolution = resolution;
}



}
