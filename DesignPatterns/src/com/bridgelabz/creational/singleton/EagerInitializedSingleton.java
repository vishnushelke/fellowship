package com.bridgelabz.creational.singleton;

public class EagerInitializedSingleton {
	private static EagerInitializedSingleton instance=new EagerInitializedSingleton();
	
	//constructor
	private EagerInitializedSingleton() {}
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}
