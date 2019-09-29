package com.bridgelabz.creational.singleton;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;
	//constructor
	private LazyInitializedSingleton() {}
	public static LazyInitializedSingleton getInstance()
	{
		if(instance==null)
		{
			instance=new LazyInitializedSingleton();
		}
		return instance;
	}
}
