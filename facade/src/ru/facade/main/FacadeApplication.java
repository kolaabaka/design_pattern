package ru.facade.main;

public class FacadeApplication {

	public static void main( String[] args ) {
		Facade facade = new Facade();
		facade.startCar();
		System.out.println();
		facade.stopCar();
	}
	
}
