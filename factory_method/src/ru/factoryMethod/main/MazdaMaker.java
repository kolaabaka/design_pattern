package ru.factoryMethod.main;

public class MazdaMaker implements CarMaker {

	@Override
	public Car makeCar() {
		return new Mazda();
	}

}
