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
package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.AddresBookModel;
import com.bridgelabz.model.Person;
import com.bridgelabz.model.State;
import com.bridgelabz.services.OopsUtility;
import com.bridgelabz.services.Utility;

public class AddressBook {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		AddresBookModel model = new AddresBookModel();
		ObjectMapper mapper = new ObjectMapper();
		String fileOut = "/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/addressbook";
		ArrayList<Person> persons = new ArrayList<Person>();
		ArrayList<Person> persons1 = new ArrayList<Person>();
		ArrayList<State> states = new ArrayList<State>();

		// first adding 2 addresses in addressbook
		State statenew = new State();
		statenew.setStatename("maharashtra");

		Person person = new Person();
		String firstname = "";
		String lastname = "";
		String address = "";
		String city = "";
		String state1 = "maharashtra";
		person.setState(state1);
		int zip = 0;
		String mobile = "";
		person=OopsUtility.addPerson("vishnu", "shelke", "radha krishna nagar", "latur", 413512, "8180927857");
		persons.add(person);

		// 2nd person to 1st addressbook
		Person person3 = new Person();
		person3=OopsUtility.addPerson("rishi", "mhatre", "durga nagar", "panvel", 413515, "rishi123");
		person3.setState("maharashtra");
		persons.add(person3);
		statenew.setPerson(persons);
		states.add(statenew);
		model.setState(states);

		State state2 = new State();
		state2.setStatename("karnataka");
		Person person1 = new Person();
		person1.setState("karnataka");
		person1=OopsUtility.addPerson("mahesh", "shelke", "Indian oil Quarters", "gulbarga",510245 , "9449864372");
		persons1.add(person1);

		Person person4 = new Person();
		person4.setState("karnataka");
		person4=OopsUtility.addPerson("akanksha", "patil", "Indian Oil Quarters", "gulbarga", 510243, "9449864371");
		persons1.add(person4);

		state2.setPerson(persons1);
		states.add(state2);
		model.setState(states);
		mapper.writeValue(new File(fileOut), model);

		System.out.println("Welcome to address Book sir!");
		boolean exit=false;
		while(!exit)
		{
			System.out.println(
					"What do you want to do?\n1.create a new addressbook\n2.open an addressbook\n3.save addressbook\n4.save as");
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
					boolean exitAddingPerson = false;
					while (!exitAddingPerson) {
						statenew = new State();
						statenew.setStatename(state1);
						person = new Person();
						System.out.println("Enter a firstname of the person");
						firstname = Utility.stringScan();
						System.out.println("Enter the last name");
						lastname = Utility.stringScan();
						System.out.println("Enter the address");
						address = Utility.stringScan();
						System.out.println("Enter the city");
						city = Utility.stringScan();
						person.setState(state1);
						System.out.println("Enter the zip code");
						zip = Utility.intScan();
						System.out.println("Enter mobile Number");
						mobile = Utility.stringScan();
						person = OopsUtility.addPerson(firstname, lastname, address, city, zip, mobile);
						persons.add(person);
						statenew.setPerson(persons);
						states.add(statenew);
						model.setState(states);
						System.out.println(state1);
						mapper.writeValue(new File(
								"/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/"
										+ state1 + ".json"),
								model);
						System.out.println("Person added successfully in your new addressbook");
						System.out.println("Do you want to add more person?\n1.yes\n2.no");
						response = Utility.intScan();
						if (response == 2)
							exitAddingPerson = true;
					}

				}
				exit=OopsUtility.isExit();
				break;

			case 2:// opening addressbook

				System.out.println("Which state addressbook you want to open?");
				for (int i = 0; i < states.size(); i++) {
					String statesearch = model.getState().get(i).getStatename();
					System.out.println((i + 1) + ". " + statesearch);
				}
				int addressbookPosition = Utility.intScan() - 1;
				isFound = false;

				boolean exitToAddressbok = false;
				statenew = new State();
				persons = new ArrayList<Person>();
				statenew = states.get(addressbookPosition);
				persons = states.get(addressbookPosition).getPerson();

				while (!exitToAddressbok) {

					System.out.println(
							"What do you want to do?\n1.add a person\n2.delete a person\n3.edit an info of exiting person\n4.sort the addressbook by Last name\n5.sort the addressbook by zipcode\n6.print the addressbook");
					response = Utility.intScan();
					switch (response) {
					case 1://add a new person
						System.out.println("Kindly fill in the required details");
						
						System.out.println("Enter a firstname of the person");
						firstname = Utility.stringScan();
						System.out.println("Enter the last name");
						lastname = Utility.stringScan();
						System.out.println("Enter the address");
						address = Utility.stringScan();
						System.out.println("Enter the city");
						city = Utility.stringScan();
						String statename = statenew.getStatename();
						person.setState(statename);
						System.out.println("Enter the zip code");
						zip = Utility.intScan();
						System.out.println("Enter mobile Number");
						mobile = Utility.stringScan();
						person=OopsUtility.addPerson(firstname, lastname, address, city, zip, mobile);
						persons.add(person);
						System.out.println("Person added successfully in your addressbook");
						System.out.println("Do you want to quit to addressbook\n1.yes\n2.no");
						if(Utility.intScan()==1)
							exitToAddressbok=true;
						break;

					case 2:// deleting using mobile number
						System.out.println("Enter the mobile number of the person you want to delete");
						int personPosition = 0;
						isFound = false;
						mobile = Utility.stringScan();
						for (int i = 0; i < persons.size(); i++) {
							String mobileSearch = persons.get(i).getPhone();
							if (mobileSearch.equals(mobile)) {
								isFound = true;
								System.out.println("Person found in addressbook and deleted successfully");
								persons.remove(personPosition);

								break;
							} else {
								personPosition++;
							}
						}
						if (!isFound) {
							System.out.println("Person you are searching for not found in AddressBook");
						}
						System.out.println("Do you want to quit to addressbook\n1.yes\n2.no");
						if(Utility.intScan()==1)
							exitToAddressbok=true;
						break;

					case 3:// editing using mobile number
						System.out.println("Enter the mobile number of the person you want to edit");
						personPosition = 0;
						isFound = false;
						mobile = Utility.stringScan();
						for (int i = 0; i < persons.size(); i++) {
							String mobileSearch = persons.get(i).getPhone();
							if (mobileSearch.equals(mobile)) {
								isFound = true;
								System.out.println("Person found in addressbook.");
								break;
							} else {
								personPosition++;
							}
						}
						if (!isFound) {
							System.out.println("Person you are searching for not found in AddressBook");
						} else {
							boolean exitFromEditing=false;
							person = persons.get(personPosition);
							while (!exitFromEditing) {
								System.out.println("What do you want to edit?\n1.address\n2.city\n3.zip");
								int optionSelect = Utility.intScan();
								switch (optionSelect) {
								case 1:
									System.out.println("Enter new Address");
									address = Utility.stringScan();
									person.setAddress(address);
									System.out.println("adress edited successfully,do you want to edit more?\n1.yes\n2.no");
									if(Utility.intScan()==2)
										exitFromEditing=true;
									break;
								case 2:
									System.out.println("Enter new city");
									city = Utility.stringScan();
									person.setCity(city);
									System.out.println("city edited successfully,do you want to edit more?\n1.yes\n2.no");
									if(Utility.intScan()==2)
										exitFromEditing=true;
									break;
								case 3:
									System.out.println("Enter new zip");
									zip = Utility.intScan();
									person.setZip(zip);
									System.out.println("zip edited successfully,do you want to edit more?\n1.yes\n2.no");
									if(Utility.intScan()==2)
										exitFromEditing=true;

									break;
								default:
									System.out.println("choose correct option");
									break;
								}
								statenew.setPerson(persons);
								
							}
						}
						System.out.println("Do you want to quit to addressbook\n1.yes\n2.no");
						if(Utility.intScan()==1)
							exitToAddressbok=true;
						
						break;

					case 4: // sorting by lastname
						for (int i = 0; i < persons.size(); i++) {
							Person person6 = persons.get(i);
							for (int j = i + 1; j < persons.size(); j++) {
								Person person5 = persons.get(j);
								Person temp = persons.get(i);
								if (person6.getLastname().compareTo(person5.getLastname()) > 0) {
									persons.set(i, person5);
									persons.set(j, temp);
								}
							}
						}
						System.out.println("AddressBook successfully sorted using LastName");
						System.out.println("Do you want to quit to addressbook\n1.yes\n2.no");
						if(Utility.intScan()==1)
							exitToAddressbok=true;
						
						break;

					case 5:// sorting by zip
						for (int i = 0; i < persons.size(); i++) {
							Person person6 = persons.get(i);
							for (int j = i + 1; j < persons.size(); j++) {
								Person person5 = persons.get(j);
								Person temp = persons.get(i);
								if (person6.getZip() > person5.getZip()) {
									persons.set(i, person5);
									persons.set(j, temp);
								}
							}
						}
						System.out.println("AddressBook successfully sorted using LastName");
						System.out.println("Do you want to quit to addressbook\n1.yes\n2.no");
						if(Utility.intScan()==1)
							exitToAddressbok=true;
						
						break;
					case 6://printing to file
						System.out.println("addressbook printed to file");
						System.out.println("Do you want to quit to addressbook\n1.yes\n2.no");
						if(Utility.intScan()==1)
							exitToAddressbok=true;
						
						break;
					default:
						System.out.println("enter valid input");

					}
					statenew.setPerson(persons);
					model.setState(states);

					break;
				}
				exit=OopsUtility.isExit();
				break;
			case 3://save to json file
				mapper.writeValue(new File(fileOut + ".json"), model);
				System.out.println("output saved in a json file");
				exit=OopsUtility.isExit();
				break;
			case 4://save as
				System.out.println("give an extension of a file to save as");
				String extesion = Utility.stringScan();
				mapper.writeValue(new File(fileOut + "." + extesion), model);
				System.out.println("output saved as a " + extesion + " file");
				exit=OopsUtility.isExit();
				break;
		   default:System.out.println("Enter valid input");
						break;
			}

		}
		//		//last save 
//		mapper.writeValue(new File(fileOut + ".json"), model);
	}
}