package com.polymorphisme.test;

public class Voiture extends Vehicule {
	private final String marque;
	
   public String getMarque() {
		
		return marque;
	}
	public Voiture(String marque) {
		this.marque= marque;
	}
    
	public Voiture() {
		super();
	}
	
	public Voiture(String modele, int age, float vitesse, String marque) {
		super(modele, age, vitesse);
		this.marque= marque;
	}
       

	public String toString() { 
		 return getMarque() +" ,"+ getModele()+" ,"+getAge()+" ,"+getVitesse();
		 }


		
	
}
