package com.bridgelabz.creational.singleton;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	//constructor
	private StaticBlockSingleton() {}
	//exception handling block
	static {
		try {
			instance=new StaticBlockSingleton();
		}
		catch(Exception e){
			throw new RuntimeException("Exception occuered during creating of Singleton");
		}
	}
	public static StaticBlockSingleton getInstance()
	{
		return instance;
	}
}
