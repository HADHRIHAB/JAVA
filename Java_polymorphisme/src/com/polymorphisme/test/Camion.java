package com.polymorphisme.test;

public class Camion extends Vehicule {
	private final String serie;

	public Camion() {
	 super();
	}

	public Camion(String modele, int age, float vitesse, String serie) {
	
		super(modele, age, vitesse);
		this.serie = serie;
	
	}
	
	public String toString() { 
		 return getSerie() +" ,"+ getModele()+" ,"+getAge()+" ,"+getVitesse();
		 }

	public String getSerie() {
		
		return serie;
	}
		
}
