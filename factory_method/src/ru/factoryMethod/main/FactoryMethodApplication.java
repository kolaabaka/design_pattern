package ru.factoryMethod.main;

public class FactoryMethodApplication {

	public static void main(String[] args) {
		CarMaker make = getMakerByName("Lada");
		Car car = make.makeCar();
		car.slogan();
	}
	
	private static CarMaker getMakerByName(String name) {
		if(name.equals("Toyota")) {
			return new ToyotaMaker();
		}else if(name.equals("Mazda")) {
			return new MazdaMaker();
		}
		
		throw new RuntimeException("У меня нет завода марки " + name);
	}
	
}


