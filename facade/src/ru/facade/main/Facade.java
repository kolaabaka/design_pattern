package ru.facade.main;

public class Facade{
	private Key key;
	private Engine engine;
	
	public Facade() {
		this.key = new Key();
		this.engine = new Engine();
	}
	
	public void startCar() {
		key.startPosition();
		engine.startEngine();
	}
	
	public void stopCar() {
		key.stopPosition();
		engine.stopEngine();
	}
	
}