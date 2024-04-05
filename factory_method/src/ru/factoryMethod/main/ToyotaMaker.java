package ru.factoryMethod.main;

public class ToyotaMaker implements CarMaker {

	@Override
	public Car makeCar() {
		return new Toyota();
	}

}
