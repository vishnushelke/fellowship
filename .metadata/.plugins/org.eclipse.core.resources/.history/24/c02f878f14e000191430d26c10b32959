package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.datastructure.Stack;
import com.bridgelabz.model.Company;
import com.bridgelabz.model.CompanySharesModel;
import com.bridgelabz.model.Transaction;
import com.bridgelabz.model.TransactionModel;
import com.bridgelabz.utility.Utility;

public class ListOfCompanySymbol {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		TransactionModel model = new TransactionModel();
		CompanySharesModel companymodel=new CompanySharesModel();

		String filepath = "/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/stocktransactions.json";
		String filepathcompanies="/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/Companies.json";

		
		ArrayList<Company> companies=new ArrayList<Company>();
		
		model = mapper.readValue(new File(filepath), model.getClass());
		companymodel=mapper.readValue(new File(filepathcompanies), companymodel.getClass());
		Stack<Transaction> stack = new Stack<Transaction>();
		stack.pushAll(model.getTransactions());

		companies=companymodel.getCompanyshares();
		System.out.println("choose your company");
		for (int i = 0; i < companies.size(); i++) {
			System.out.println((i+1)+". "+companies.get(i).getCompanyname());
		}
		int company=Utility.intScan()-1;
		
		boolean exit = false;
//System.out.println(stack.peek().getPaidby());
//System.out.println(stack.peek().getPaidto());
//System.out.println(companies.get(company).getCompanyname());

		
		while (!exit) {
			if(companies.get(company).getCompanyname().equals(stack.peek().getPaidto())||companies.get(company).getCompanyname().equals(stack.peek().getPaidby()))
			{
				for (int i = 0; i < stack.size(); i++) {
		
				
				if (!exit) {
					if (i == 0) {
						System.out.print("paid by \t");
						System.out.print("paid to \t\t");
						System.out.print("Stocks sold \t\t");
						System.out.print("paid money \t");
						System.out.println("DateTime \t");
					}
					exit = true;
				}
				System.out.print(stack.peek().getPaidby() + "\t");
				System.out.print(stack.peek().getPaidto() + "\t\t\t");
				System.out.print(stack.peek().getStocksold() + "\t\t");
				System.out.print(stack.peek().getPaidmoney() + "\t");
				System.out.println(stack.peek().getDate() + "\t");
			}

			stack.pop();
			}
			
			
	}
	if (!exit) {
		System.out.println("No transaction for this company");
	}

	}
}


