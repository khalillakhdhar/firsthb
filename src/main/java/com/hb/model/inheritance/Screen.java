package com.hb.model.inheritance;

import jakarta.persistence.Entity;

@Entity
public class Screen extends Output {
private String quality;

public String getQuality() {
	return quality;
}

public void setQuality(String quality) {
	this.quality = quality;
}




}
