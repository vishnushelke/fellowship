package com.bridgelabz.creational.factory;

public class Pc extends Computer{
	private String ram;
	private String cpu;
	private String hdd;
	
	//constructor
	public Pc(String ram,String cpu,String hdd)
	{
		this.ram=ram;
		this.cpu=cpu;
		this.hdd=hdd;
	}
	
	public String getRAM()
	{
		return this.ram;
	}
	public String getCPU()
	{
		return this.cpu;
	}
	public String getHDD()
	{
		return this.hdd;
	}

	@Override
	public String toString() {
		return "Pc [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + "]";
	}

}
