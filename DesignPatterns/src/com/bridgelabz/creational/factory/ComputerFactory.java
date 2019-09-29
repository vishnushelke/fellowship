package com.bridgelabz.creational.factory;

public class ComputerFactory {
	public static Computer getComputer(String type,String ram,String hdd,String cpu)
	{
		if("PC".equalsIgnoreCase(type))
			return new Pc(ram,cpu,hdd); 
		else if("Laptop".equalsIgnoreCase(type))
			return new Laptop(ram,cpu,hdd); 
		else if("Server".equalsIgnoreCase(type))
			return new Server(ram,cpu,hdd);
		return null; 
	}

}
