package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.AppointmentModel;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.DoctorsModel;
import com.bridgelabz.model.Patient;
import com.bridgelabz.model.PatientModel;
import com.bridgelabz.utility.OopsUtility;
import com.bridgelabz.utility.Utility;

public class Clinique {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		// int[] count = new int[5];
		ObjectMapper mapper = new ObjectMapper();
		DoctorsModel modelDoctor = new DoctorsModel();
		PatientModel modelPatient = new PatientModel();
		AppointmentModel modelAppointment = new AppointmentModel();

		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		ArrayList<Patient> patients = new ArrayList<Patient>();
		ArrayList<Appointment> appointments = new ArrayList<Appointment>();

		modelDoctor = mapper.readValue(new File(
				"/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/jsonfiles 2/doctors.json"),
				modelDoctor.getClass());
		doctors = modelDoctor.getDoctors();

		boolean exit = false;
		while (!exit) {
			System.out.println(
					"what do you want to do?\n1.add a doctor\n2.add a patient\n3.search a doctor\n4.search a patient\n5.take an appointment with a doctor\n6.print report of a doctor\n7.print a report of a patient\n8.show popular doctor\n9.show popular specialization");
			switch (Utility.intScan()) {
			case 1:// add a doctor
				int doctorNumber = doctors.size() + 1;
				Doctor doctor = new Doctor();
				doctor = OopsUtility.addDoctor(doctorNumber);
				doctors.add(doctor);
				modelDoctor.setDoctors(doctors);

				System.out.println("Doctor added suuccessfully in clinic");
				exit = OopsUtility.isExit();
				mapper.writeValue(new File(
						"/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/jsonfiles 2/doctors.json"),
						modelDoctor);
				break;

			case 2:// add a patient
				int patientNumber = patients.size() + 1;

				System.out.println("what is your name");
				String name = Utility.stringScan();
				System.out.println("enter your mobile number");
				String mobileNumber = Utility.stringScan();
				System.out.println("ENter your age");
				int age = Utility.intScan();
				Patient patient = OopsUtility.addPatient(patientNumber, name, mobileNumber, age);
				patients.add(patient);
				modelPatient.setPatients(patients);
				System.out.println("patient added successfully");
				exit = OopsUtility.isExit();
				mapper.writeValue(new File(
						"/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/jsonfiles 2/patients.json"),
						modelPatient);
				break;
			case 3:// search doctor
				System.out.println(
						"How do you want to search a doctor?\n1.by name\n2.by specialization\n3.by availability\n4.by ID");
				switch (Utility.intScan()) {
				case 1: // search doctor by name
					System.out.println("Enter the name of a doctor");
					doctor = OopsUtility.searchDoctorByName(Utility.stringScan(), doctors);
					if (doctor != null)
						System.out.println(doctor);
					else
						System.out.println("doctor not found");
					exit = OopsUtility.isExit();
					break;
				case 2:// search doctor by specialization
					ArrayList<Doctor> doctorsBySpecialization = new ArrayList<>();
					System.out.println("Enter the specialization of a doctor");
					doctorsBySpecialization = OopsUtility.searchDoctorBySpecialization(Utility.stringScan(), doctors);
					if (doctorsBySpecialization.get(0).getName() != null)
						System.out.println(doctorsBySpecialization);
					else
						System.out.println("doctor not found");
					exit = OopsUtility.isExit();
					break;
				case 3:// search doctor by availability
					ArrayList<Doctor> doctorsByAvailability = new ArrayList<>();
					System.out.println("Enter the availability of a doctor");
					doctorsByAvailability = OopsUtility.searchDoctorByAvailability(Utility.stringScan(), doctors);
					if (doctorsByAvailability.get(0) != null)
						System.out.println(doctorsByAvailability.toString());
					else
						System.out.println("doctor not found");
					exit = OopsUtility.isExit();
					break;
				case 4:// search doctor by ID
					System.out.println("Enter the ID of a doctor");
					doctor = OopsUtility.searchDoctorByID(Utility.stringScan(), doctors);
					if (doctor.getName() != null)
						System.out.println(doctor);
					else
						System.out.println("doctor not found");
					exit = OopsUtility.isExit();
					break;
				default:
					System.out.println("Enter valid input");
					break;

				}
			case 4:// search a patient
				System.out.println("What do you know about a patient?\n1.name\n2.ID\n3.Mobile Number");
				switch (Utility.intScan()) {
				case 1:// search a patient by name
					System.out.println("Enter a name of the patient");
					String patientName = Utility.stringScan();
					ArrayList<Patient> patientsByName = new ArrayList<>();
					patientsByName = OopsUtility.searchPatientByName(patientName, patients);
					if (patientsByName.get(0) == null)
						System.out.println("Patient not found");
					else
						System.out.println(patientsByName);
					exit = OopsUtility.isExit();
					break;

				case 2:// search a patient by ID
					System.out.println("Enter a ID of the patient");
					String ID = Utility.stringScan();
					ArrayList<Patient> patientsById = new ArrayList<>();
					patientsById = OopsUtility.searchPatientById(ID, patients);
					if (patientsById.get(0) == null)
						System.out.println("Patient not found");
					else
						System.out.println(patientsById);
					exit = OopsUtility.isExit();
					break;
				case 3:// search a patient by Mobile number
					System.out.println("Enter a Mobile number of the patient");
					String mobile = Utility.stringScan();
					Patient patientByMobile = OopsUtility.searchPatientByMObile(mobile, patients);
					if (patientByMobile.getName() == null)
						System.out.println("Patient not found");
					else
						System.out.println(patientByMobile);
					exit = OopsUtility.isExit();
					break;
				default:
					System.out.println("Enter valid input");
					break;
				}
			case 5:// take an appointment
				System.out.println("Enter a specialization of a doctor you want to have an appointment with");
				String specializationSearch = Utility.stringScan();
				Doctor doctorForAppointment = new Doctor();
				Patient patientAppointment = new Patient();
				ArrayList<Doctor> doctorsBySpecialization = new ArrayList<>();
				doctorsBySpecialization = OopsUtility.searchDoctorBySpecialization(specializationSearch, doctors);
				if (doctorsBySpecialization.get(0).getName() == null) {
					System.out.println(
							"doctor not found.Do you want to have an appointment with a doctor with any other specilization?");
					System.out.println("We have following doctors in our clinic to serve you");
					exit = OopsUtility.isExit();
//					doctors.forEach(i -> {
//						System.out.println(i.getName()+"->> "+i.getSpecialization());
//					});
//					System.out.println("Enter doctor number if you want an appointment with him,\nelse enter 9 to exit");
//					int selectDoctor=Utility.intScan();
//					switch(selectDoctor)
//					{
//					
//					}

				} else {
					System.out.println(doctorsBySpecialization);
					System.out.println("Enter doctor number you want an appoint ment with");
					int doctorNumberAppointment = Utility.intScan();

					doctorForAppointment = doctorsBySpecialization.get(doctorNumberAppointment - 1);
					System.out.println("Doctor Selected");
				}
				System.out.println("is this your first visit in hospital?\n1.yes\n2.no");
				int visit = Utility.intScan();
				if (visit == 1) {
					int patientNumberAppointment = patients.size() + 1;

					System.out.println("what is your name");
					String namePatient = Utility.stringScan();
					System.out.println("enter your mobile number");
					String mobileNumberPatient = Utility.stringScan();
					System.out.println("ENter your age");
					int agePatient = Utility.intScan();
					patientAppointment = OopsUtility.addPatient(patientNumberAppointment, namePatient,
							mobileNumberPatient, agePatient);
					patients.add(patientAppointment);
					modelPatient.setPatients(patients);
					System.out.println("patient added successfully");

					mapper.writeValue(new File(
							"/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/jsonfiles 2/patients.json"),
							modelPatient);

				} else {
					System.out.println("Enter your MobileNumber");
					String mobileNumberPatient = Utility.stringScan();
					Patient patientByMobile = OopsUtility.searchPatientByMObile(mobileNumberPatient, patients);
					if (patientByMobile.getName() == null) {
						System.out.println("Patient not found");
						System.out.println("Do you want to add yourself in patientlist?\n1.yes\n2.no");
						if (Utility.intScan() == 2) {
							return;
						} else {
							
							int patientNumberAppointment = patients.size() + 1;

							System.out.println("what is your name");
							String namePatient = Utility.stringScan();
							System.out.println("enter your mobile number");
							mobileNumberPatient = Utility.stringScan();
							System.out.println("ENter your age");
							int agePatient = Utility.intScan();
							patientAppointment = OopsUtility.addPatient(patientNumberAppointment, namePatient,
									mobileNumberPatient, agePatient);
							patients.add(patientAppointment);
							modelPatient.setPatients(patients);
							System.out.println("patient added successfully");

							mapper.writeValue(new File(
									"/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/jsonfiles 2/patients.json"),
									modelPatient);
						}

					}

					else
						patientAppointment = patientByMobile;
				}
				System.out.println("Doctor is available for slot " + doctorForAppointment.getAvailability());
				System.out.println("Do you want to continue taking an appointment?\n1.yes\n2.no");
				if (Utility.intScan() == 1) {
					Appointment appointment = new Appointment();
					appointment = OopsUtility.createAnAppointment(patientAppointment, doctorForAppointment,
							appointments);
					appointments.add(appointment);
//					ArrayList<Appointment> doctorAppointments = new ArrayList<Appointment>();
//					doctorAppointments.add(appointment);
//					doctorForAppointment.setAppointments(doctorAppointments);
//					doctorForAppointment.setNumberOfAppointments(doctorForAppointment.getNumberOfAppointments() + 1);
//					mapper.writeValue(new File(
//							"/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/jsonfiles 2/doctors.json"),
//							modelDoctor);
					modelAppointment.setAppointments(appointments);
					
					mapper.writeValue(new File("/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/jsonfiles 2/appointments.json"), modelAppointment);
					
					System.out.println("Your apppointment is fixed with " + doctorForAppointment.getName());

					exit = OopsUtility.isExit();
				} else {
					exit = true;
				}

			}
		}

	}

}
