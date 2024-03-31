package ru.delegate.main;

public class DelegateApplication {
	public static void main(String[] args) {
		DelagateCat delegateCat = new DelagateCat();
		delegateCat.feedCat();
		delegateCat.hugCat();
		delegateCat.kissCat();
	}
}
