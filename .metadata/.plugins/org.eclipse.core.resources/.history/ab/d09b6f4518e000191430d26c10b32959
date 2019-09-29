package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.StockModel;

public class StockReport {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		String inString="/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/stock.json";
		String outString="/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/stockOut.json";
		ObjectMapper mapper=new ObjectMapper();
		StockModel data=new StockModel();
		data=mapper.readValue(new File(inString),StockModel.class);
		ArrayList<StockReport> list=new ArrayList<StockReport>();
		
		
		System.out.println("Company name is :"+data.getStock().get(0).getStockName());
		System.out.println("number of share :"+data.getStock().get(0).getNumberOfShare());
		System.out.println("price of Share is :"+data.getStock().get(0).getSharePrice());
		int totalValue=(data.getStock().get(0).getSharePrice()*data.getStock().get(0).getNumberOfShare());
		data.getStock().get(0).setTotalValue(totalValue);
		System.out.println("total value is :"+data.getStock().get(0).getTotalValue());
		System.out.println();
		
		System.out.println("Company name is :"+data.getStock().get(1).getStockName());
		System.out.println("number of share :"+data.getStock().get(1).getNumberOfShare());
		System.out.println("price of Share is :"+data.getStock().get(1).getSharePrice());
		totalValue=(data.getStock().get(1).getSharePrice()*data.getStock().get(1).getNumberOfShare());
		data.getStock().get(1).setTotalValue(totalValue);
		System.out.println("total value is :"+data.getStock().get(1).getTotalValue());
		System.out.println();
		
		System.out.println("Company name is :"+data.getStock().get(2).getStockName());
		System.out.println("number of share :"+data.getStock().get(2).getNumberOfShare());
		System.out.println("price of Share is :"+data.getStock().get(2).getSharePrice());
		totalValue=(data.getStock().get(2).getSharePrice()*data.getStock().get(2).getNumberOfShare());
		data.getStock().get(2).setTotalValue(totalValue);
		System.out.println("total value is :"+data.getStock().get(2).getTotalValue());
		
		mapper.writeValue(new File(outString), data);
	}

}
