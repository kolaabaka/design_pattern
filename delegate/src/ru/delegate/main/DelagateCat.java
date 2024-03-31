package ru.delegate.main;

public class DelagateCat {
	CareCat careCat;
	public DelagateCat() {
		this.careCat = new CareCat();
	}
	
	public void hugCat() {
		careCat.hugCat();
	}
	
	public void feedCat() {
		careCat.feedCat();
	}
	
	public void kissCat() {
		System.out.println("Kissing cat");
	}
}
