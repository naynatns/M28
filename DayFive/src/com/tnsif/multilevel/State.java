package com.tnsif.multilevel;

public class State extends Country{
	
	private String stateName;
	private String language;
	
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", language=" + language + ", getCountryName()=" + getCountryName()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
	
	
	
	
	

}
