package com.polymorphisme;

import com.polymorphisme.test.Camion;
import com.polymorphisme.test.Vehicule;
import com.polymorphisme.test.Voiture;

public class Main {

	public static void main(String[] args) {
		Voiture voiture= new Voiture("BMW",12, 22, "M12");
		voiture.accelerer(30);
		voiture.toString();
		System.out.println(voiture);
		
		Camion camion = new Camion("tesla", 24, 55, "t23");
		camion.setVitesse(40);
		camion.setAge(10);
		camion.toString();
		System.out.println(camion);
		
		Vehicule vehicule[]= new Vehicule[5];
		vehicule[0]=  new Voiture("Audi",9, 40, "A9");
		vehicule[1]=  new Camion("tesla",8, 44, "DS3");
		vehicule[2]=  new Voiture("audi",11, 64, "A9");
		vehicule[3]=  new Voiture("BMW",18, 83, "S1");
		vehicule[4]=  new Camion("tesla",11, 94, "T66");
			

		//for(int i=0; i<vehicule.length; i++) {
			//System.out.println(vehicule[i]);
		//}
		
		for(Vehicule i : vehicule) {
			System.out.println("La vehicule :"+ i);
		}
	}
	
	
	

}
