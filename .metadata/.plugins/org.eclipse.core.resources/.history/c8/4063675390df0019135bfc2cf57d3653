/******************************************************************************
 *  Compilation:  javac -d bin AddressBook.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.AddressBook n
 *  
 *  Purpose: application of addressbook.
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   23-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.AddresBookModel;
import com.bridgelabz.model.Person;
import com.bridgelabz.model.State;
import com.bridgelabz.utility.Utility;

public class AddressBook {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		AddresBookModel model = new AddresBookModel();
		ObjectMapper mapper = new ObjectMapper();
		String fileOut = "/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/addressbook.json";
		ArrayList<Person> persons = new ArrayList<Person>();
		ArrayList<Person> persons1 = new ArrayList<Person>();
		ArrayList<State> states = new ArrayList<State>();

		// first adding 2 addresses in addressbook
		State statenew = new State();
		statenew.setStatename("maharashtra");

		Person person = new Person();
		String firstname = "vishnu";
		person.setFirstname(firstname);
		String lastname = "shelke";
		person.setLastname(lastname);
		String address = "radha krishna nagar";
		person.setAddress(address);
		String city = "latur";
		person.setCity(city);
		String state1 = "maharashtra";
		person.setState(state1);
		int zip = 413512;
		person.setZip(zip);
		String mobile = "8180927857";
		person.setPhone(mobile);
		persons.add(person);
		
		//2nd person to 1st addressbook
		Person person3 = new Person();
		String firstname3 = "rishi";
		person3.setFirstname(firstname3);
		String lastname3 = "mhatre";
		person3.setLastname(lastname3);
		String address3 = "durga nagar";
		person3.setAddress(address3);
		String city3 = "panvel";
		person3.setCity(city3);
		person3.setState("maharashtra");
		int zip3 = 413515;
		person3.setZip(zip3);
		String mobile3 = "rishi123";
		person3.setPhone(mobile3);
		persons.add(person3);
		statenew.setPerson(persons);
		states.add(statenew);
		model.setState(states);

		State state2 = new State();
		state2.setStatename("karnataka");
		Person person1 = new Person();
		String firstname1 = "mahesh";
		person1.setFirstname(firstname1);
		String lastname1 = "shelke";
		person1.setLastname(lastname1);
		String address1 = "Indian oil Quarters";
		person1.setAddress(address1);
		String city1 = "gulbarga";
		person1.setCity(city1);
		String statename1 = "karnataka";
		person1.setState(statename1);
		int zip1 = 510245;
		person1.setZip(zip1);
		String mobile1 = "9449864372";
		person1.setPhone(mobile1);
		persons1.add(person1);
		
		Person person4 = new Person();
		String firstname4 = "akanksha";
		person4.setFirstname(firstname4);
		String lastname4 = "patil";
		person4.setLastname(lastname4);
		String address4 = "Indian oil Quarters";
		person4.setAddress(address4);
		String city4 = "gulbarga";
		person4.setCity(city4);
		String statename4 = "karnataka";
		person4.setState(statename4);
		int zip4 = 510243;
		person4.setZip(zip4);
		String mobile4 = "9449864371";
		person4.setPhone(mobile4);
		persons1.add(person4);
		
		
		state2.setPerson(persons1);
		states.add(state2);
		model.setState(states);
		mapper.writeValue(new File(fileOut), model);

		System.out.println("Welcome to address Book sir!");
		System.out.println("What do you want to do?\n1.create a new addressbook\n2.open an addressbook");
		int response = Utility.intScan();
		switch (response) {
		case 1:
			System.out.println("give a state name,kindly insert full name and in lowercase only");
			state1 = Utility.stringScan();
			boolean isFound = false;

			// searching in addressbook if the state is already available
			for (int i = 0; i < states.size(); i++) {
				String statesearch = model.getState().get(i).getStatename();
				if (state1.equals(statesearch)) {
					isFound = true;
					System.out.println("This addressbook is already available,\nkindly open that addressbook");
					break;
				}

			}

			// if state not found,creating new addressbook
			if (!isFound) {
				boolean exit = false;
				while (!exit) {
					statenew = new State();
					statenew.setStatename(state1);

					person = new Person();

					System.out.println("Enter a firstname of the person");
					firstname = Utility.stringScan();
					person.setFirstname(firstname);
					System.out.println("Enter the last name");
					lastname = Utility.stringScan();
					person.setLastname(lastname);
					System.out.println("Enter the address");
					address = Utility.stringScan();
					person.setAddress(address);
					System.out.println("Enter the city");
					city = Utility.stringScan();
					person.setCity(city);
					person.setState(state1);
					System.out.println("Enter the zip code");
					zip = Utility.intScan();
					person.setZip(zip);
					System.out.println("Enter mobile Number");
					mobile = Utility.stringScan();
					person.setPhone(mobile);
					persons.add(person);
					statenew.setPerson(persons);
					states.add(statenew);
					System.out.println("Person added successfully in your new addressbook");
					System.out.println("Do you want to add more person?\n1.yes\n2.no");
					response = Utility.intScan();
					if (response == 2)
						exit = true;
				}

			}

			break;

		case 2:// opening addressbook

			System.out.println("Which state addressbook you want to open?");
			for (int i = 0; i < states.size(); i++) {
				String statesearch = model.getState().get(i).getStatename();
				System.out.println((i + 1) + ". " + statesearch);
			}
			int addressbookPosition = Utility.intScan() - 1;
			isFound = false;

			boolean exit = false;
			statenew = new State();
			persons = new ArrayList<Person>();
			statenew = states.get(addressbookPosition);
			persons = states.get(addressbookPosition).getPerson();

			while (!exit) {

				System.out.println(
						"What do you want to do?\n1.add a person\n2.delete a person\n3.edit an info of exiting person\n4.sort the addressbook by Last name\n5.sort the addressbook by zipcode\n6.print the addressbook");
				response = Utility.intScan();
				switch (response) {
				case 1:
					System.out.println("Kindly fill in the required details");
					person = new Person();
					System.out.println("Enter a firstname of the person");
					firstname = Utility.stringScan();
					person.setFirstname(firstname);
					System.out.println("Enter the last name");
					lastname = Utility.stringScan();
					person.setLastname(lastname);
					System.out.println("Enter the address");
					address = Utility.stringScan();
					person.setAddress(address);
					System.out.println("Enter the city");
					city = Utility.stringScan();
					person.setCity(city);
					String statename = statenew.getStatename();
					person.setState(statename);
					System.out.println("Enter the zip code");
					zip = Utility.intScan();
					person.setZip(zip);
					System.out.println("Enter mobile Number");
					mobile = Utility.stringScan();
					person.setPhone(mobile);
					persons.add(person);
					System.out.println("Person added successfully in your addressbook");
					break;
				
				case 2:System.out.println("Enter the mobile number of the person you want to delete");
				 		int personPosition=0;
				 		isFound=false;
						mobile=Utility.stringScan();
				 		for (int i = 0; i < persons.size(); i++) {
							String mobileSearch=persons.get(i).getPhone();
							if(mobileSearch.equals(mobile))
							{
								isFound=true;
								System.out.println("Person found in addressbook and deleted successfully");
								persons.remove(personPosition);
								
								break;
							}
							else
							{
								personPosition++;
							}
						}
				 		if(!isFound)
				 		{
				 			System.out.println("Person you are searching for not found in AddressBook");
				 		}
				 		break;
				 		
				case 3:System.out.println("Enter the mobile number of the person you want to edit");
				 		personPosition=0;
				 		isFound=false;
						mobile=Utility.stringScan();
				 		for (int i = 0; i < persons.size(); i++) {
							String mobileSearch=persons.get(i).getPhone();
							if(mobileSearch.equals(mobile))
							{
								isFound=true;
								System.out.println("Person found in addressbook.");
								break;
							}
							else
							{
								personPosition++;
							}
						}
				 		if(!isFound)
				 		{
				 			System.out.println("Person you are searching for not found in AddressBook");
				 		}
				 		else
				 		{
				 			person=persons.get(personPosition);
							while(!exit)
							{
								System.out.println("What do you want to edit?\n1.address\n2.city\n3.zip");
								int optionSelect=Utility.intScan();
								switch(optionSelect)
								{
								case 1: System.out.println("Enter new Address");
								        address=Utility.stringScan();
										person.setAddress(address);
										break;
								case 2:System.out.println("Enter new city");
										city=Utility.stringScan();
										person.setCity(city);
										break;
								case 3:System.out.println("Enter new zip");
								 		zip=Utility.intScan();
								 		person.setZip(zip);
								 		break;
								default:System.out.println("choose correct option");
								 		break;
								}
								statenew.setPerson(persons);
								System.out.println("Person info edited successfully.\n1.want to edit more\n2.exit");
								optionSelect=Utility.intScan();
								if(optionSelect==2)
									exit=true;
								
							}
				 		}
				 		break;
				 		
				case 4: 
						for (int i = 0; i < persons.size(); i++) {
							Person person6=persons.get(i);
							for (int j = i+1; j < persons.size(); j++) {
								Person person5=persons.get(j);
								if(person6.getLastname().compareTo(person5.getLastname())>0)
								{
									persons.set(i, person5);
									persons.set(j, person6);
								}
							}
						}
						System.out.println("AddressBook successfully sorted using LastName");
						break;
						
				case 5:
					for (int i = 0; i < persons.size(); i++) {
						Person person6=persons.get(i);
						for (int j = i+1; j < persons.size(); j++) {
							Person person5=persons.get(j);
							if(person6.getZip()>person5.getZip())
							{
								persons.set(i, person5);
								persons.set(j, person6);
							}
						}
					}
					System.out.println("AddressBook successfully sorted using LastName");
					break;
				default:System.out.println("enter valid input");
					
		
				}
				System.out.println("Do you want to continue?\n1.yes\n2.no");
				response = Utility.intScan();
				if (response == 2) {
					System.out.println("Thank you for giving us chance to serve you!");
					exit = true;
				}
				statenew.setPerson(persons);
				model.setState(states);
				break;

			}

		}
		
		mapper.writeValue(new File(fileOut), model);
	}
}
