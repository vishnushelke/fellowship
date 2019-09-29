package com.bridgelabz.utility;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Company;
import com.bridgelabz.model.CompanySharesModel;
import com.bridgelabz.model.CustomerInfo;
import com.bridgelabz.model.CustomerInfoModel;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;

public class OopsUtility {

	public static ObjectMapper mapper = new ObjectMapper();
	public static CompanySharesModel modelCompanyShares = new CompanySharesModel();
	public static CustomerInfoModel modelCustomers = new CustomerInfoModel();

	public static ArrayList<Company> companies = new ArrayList<Company>();
	public static ArrayList<CustomerInfo> customers = new ArrayList<CustomerInfo>();

	public static String[] sortCards(String[] player) {
		String temp = "";
		for (int j = 0; j < player.length; j++) {
			for (int j2 = j + 1; j2 < player.length; j2++) {
				int len1 = player[j].length() - 1;
				int len2 = player[j2].length() - 1;
				int n1 = player[j].charAt(len1) + (player[j].charAt(len1 - 1)) * 10;
				int n2 = player[j2].charAt(len2) + (player[j2].charAt(len2 - 1)) * 10;
				if (n1 > n2) {
					temp = player[j];
					player[j] = player[j2];
					player[j2] = temp;
				}

			}
		}

		return player;
	}

	public static void showCards(String[][] player) {
		for (int j = 0; j < player.length; j++) {
			for (int j2 = 0; j2 < player[j].length; j2++) {
				player[j][j2] = player[j][j2].replaceAll("11", "jack");
				player[j][j2] = player[j][j2].replaceAll("12", "queen");
				player[j][j2] = player[j][j2].replaceAll("13", "king");
				player[j][j2] = player[j][j2].replaceAll("14", "ace");
			}
		}
		for (int i = 0; i < player.length; i++) {
			for (int j = 0; j < player[i].length; j++) {
				System.out.print(player[i][j] + ",");
			}
			System.out.println();
			System.out.println();
		}
	}

	public static CustomerInfo createAccount() {
		CustomerInfo customer = new CustomerInfo();
		System.out.println("Enter your name");
		String name = Utility.stringScan();
		customer.setName(name);
		System.out.println("Enter your symbol,your name and ddmm of your date of birth");
		String symbol = Utility.stringScan();
		customer.setSymbol(symbol);
		System.out.println("How many shares you have?");
		int shares = Utility.intScan();
		customer.setAvailableshares(shares);
		System.out.println("how many ruppes you have for investment?");
		int ruppes = Utility.intScan();
		customer.setRupeesavailable(ruppes);
		System.out.println("creating a Customer...");
		return customer;
	}

	public static CompanySharesModel startDataCompanies()
			throws JsonGenerationException, JsonMappingException, IOException {
		Company company = new Company();
		company.setCompanyname("icici");
		company.setNumberofshares(100);
		company.setShareprice(50);
		company.setSymbol("icici");
		int totalprice = company.getShareprice() * company.getNumberofshares();
		company.setTotalprice(totalprice);
		companies.add(company);

		// second company
		Company company1 = new Company();
		company1.setCompanyname("sbi");
		company1.setNumberofshares(150);
		company1.setShareprice(60);
		company1.setSymbol("sbi");
		int totalprice1 = company1.getShareprice() * company1.getNumberofshares();
		company1.setTotalprice(totalprice1);
		companies.add(company1);

		// third company
		Company company2 = new Company();
		company2.setCompanyname("axis");
		company2.setNumberofshares(200);
		company2.setShareprice(90);
		company2.setSymbol("axis");
		int totalprice2 = company2.getShareprice() * company2.getNumberofshares();
		company2.setTotalprice(totalprice2);
		companies.add(company2);
		modelCompanyShares.setCompanyshares(companies);
		return modelCompanyShares;
	}

	public static CustomerInfoModel startDataCUdtomers() {
		// adding 3 customers
		CustomerInfo customer = new CustomerInfo();
		customer.setAvailableshares(50);
		customer.setName("vishnu");
		customer.setRupeesavailable(0);
		customer.setSymbol("eater");
		customers.add(customer);

		CustomerInfo customer1 = new CustomerInfo();
		customer1.setAvailableshares(60);
		customer1.setName("rishi");
		customer1.setRupeesavailable(1000);
		customer1.setSymbol("rishi");
		customers.add(customer1);

		CustomerInfo customer2 = new CustomerInfo();
		customer2.setAvailableshares(100);
		customer2.setName("abhishek");
		customer2.setRupeesavailable(200000);
		customer2.setSymbol("cashier");
		customers.add(customer2);
		modelCustomers.setCustomers(customers);
		return modelCustomers;
	}

	public static void buyShares(int amount, String symbol) {

	}

	public static Doctor addDoctor(int doctorNumber) {

		Doctor doctor = new Doctor();
		System.out.println("Enter Doctor name");
		doctor.setName(Utility.stringScan());
		System.out.println("When will you be available for patients i.e. am or pm");
		doctor.setAvailability(Utility.stringScan());
		System.out.println("Give your specialization");
		doctor.setSpecialization(Utility.stringScan());
		doctor.setIsfull(false);
		doctor.setId(doctor.getSpecialization() + "/" + doctorNumber);
		return doctor;
	}

	public static Patient addPatient(int patientNumber, String name, String mobileNumber) {
		Patient patient = new Patient();

		patient.setMobileNumber(mobileNumber);
		patient.setName(name);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM");
		LocalDateTime dateTimeNow = LocalDateTime.now();
		patient.setID("Patient " + dateTimeNow.format(dateFormatter) + "/" + patientNumber);

		return patient;
	}

	public static boolean isExit() {

		System.out.println("Do you want to continue?\n1.yes\n2.no");
		if (Utility.intScan() == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static Doctor searchDoctorByName(String name, ArrayList<Doctor> doctors) {

		Doctor doctor = new Doctor();

		for (int i = 0; i < doctors.size(); i++) {
			if (doctors.get(i).getName().contentEquals(name)) {

				doctor = doctors.get(i);
				break;
			}

		}

		return doctor;
	}

	public static ArrayList<Doctor> searchDoctorBySpecialization(String specialization, ArrayList<Doctor> doctors) {
		
		ArrayList<Doctor> doctorsBySpecialization = new ArrayList<>();
		for (int i = 0; i < doctors.size(); i++) {
			if (doctors.get(i).getSpecialization().equals(specialization)) {

				doctorsBySpecialization.add(doctors.get(i));

			}

		}

		return doctorsBySpecialization;
	}

	public static ArrayList<Doctor> searchDoctorByAvailability(String availability, ArrayList<Doctor> doctors) {
		
		ArrayList<Doctor> doctorsBySpecialization = new ArrayList<>();
		for (int i = 0; i < doctors.size(); i++) {
			if (doctors.get(i).getAvailability().equals(availability)) {

				doctorsBySpecialization.add(doctors.get(i));
			}

		}

		return doctorsBySpecialization;
	}

	public static Doctor searchDoctorByID(String ID, ArrayList<Doctor> doctors) {
		Doctor doctor = new Doctor();

		for (int i = 0; i < doctors.size(); i++) {
			if (doctors.get(i).getId().equals(ID)) {

				doctor = doctors.get(i);
				break;
			}

		}

		return doctor;
	}

}
