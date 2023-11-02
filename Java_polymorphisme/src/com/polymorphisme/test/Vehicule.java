package com.polymorphisme.test;

public class Vehicule {

	public String modele;
	public int age;
	public float vitesse;
	
	public void accelerer(float vitesse ) {
		this.vitesse+= vitesse;
	}
	public void decelerer(float vitesse ) {
		this.vitesse-= vitesse;
	}

	public Vehicule() {
		
	}
	public Vehicule(String modele, int age, float vitesse) {
		this.modele = modele;
		this.age = age;
		this.vitesse = vitesse;
	}
	
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public float getVitesse() {
		return vitesse;
	}
	public void setVitesse(float vitesse) {
		this.vitesse = vitesse;
	}
	

}
