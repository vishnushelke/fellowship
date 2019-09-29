package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.datastructure.LinkedListnext;
import com.bridgelabz.model.Company;
import com.bridgelabz.model.CompanySharesModel;
import com.bridgelabz.utility.Utility;

public class ListOfCompanyShares {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper =new ObjectMapper();
		CompanySharesModel model=new CompanySharesModel();
		
		String filepath="/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/Companies.json";
		String outfile="/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/shresusinglinkedlist";
		model=mapper.readValue(new File(filepath), model.getClass());

		mapper.writeValue(new File(outfile), model);
		LinkedListnext<Company> companies = new LinkedListnext<Company>();

		companies.addAll(model.getCompanyshares());
		boolean exit=false;
		
		while(!exit)
		{
			System.out.println("Select your company");
			for (int i = 0; i < companies.size(); i++) {
				System.out.println((i+1)+". "+companies.get(i).getCompanyname());
			}
			int companySelect=Utility.intScan()-1;
			System.out.println("company shares are "+companies.get(companySelect).getNumberofshares());
			System.out.println("what do you want to do?\n1.add shares\n2.decrease shares\n3.exit");
			int response=Utility.intScan();
			switch(response)
			{
			case 1:
				System.out.println("how many shares you want to add?");
				
				int sharestoadd=Utility.intScan();
				companies.get(companySelect).setNumberofshares(companies.get(companySelect).getNumberofshares()+sharestoadd);
				companies.get(companySelect).setTotalprice(companies.get(companySelect).getNumberofshares()*companies.get(companySelect).getShareprice());
				System.out.println("company new shares are "+companies.get(companySelect).getNumberofshares());
				System.out.println("shares added suucessfully\n1.exit\n2.be with us");
				System.out.println("company new shares are "+companies.get(companySelect).getNumberofshares());
				if(Utility.intScan()==1)
					exit=true;
				
				break;
			case 2: 
				    System.out.println("how many shares you want to remove?");
					int sharestoremove=Utility.intScan();
					if(sharestoremove>companies.get(companySelect).getNumberofshares())
					{
						System.out.println("Company has only "+companies.get(companySelect).getNumberofshares()+" shares.enter valid number of shares");
						sharestoremove=Utility.intScan();
					}
					companies.get(companySelect).setNumberofshares(companies.get(companySelect).getNumberofshares()-sharestoremove);
					companies.get(companySelect).setTotalprice(companies.get(companySelect).getNumberofshares()*companies.get(companySelect).getShareprice());
					System.out.println("company new shares are "+companies.get(companySelect).getNumberofshares());
					System.out.println("shares changed suucessfully\n1.exit\n2.be with us");
					if(Utility.intScan()==1)
						exit=true;
					break;
			case 3:System.out.println("thank you for being with us!");
			}
		}
		
		mapper.writeValue(new File(outfile), model);
		
		
	}

}
