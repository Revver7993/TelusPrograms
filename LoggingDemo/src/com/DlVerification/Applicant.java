package com.DlVerification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Applicant {
	Log logger = LogFactory.getLog(Applicant.class);

	public void dlEligibility() throws InvalidAge, PoliceVerification, MedicalVerification {
	boolean eligible=checkApplicantforDL();
	
    }
	
	private String name;
	private int age;
	private String medical;
	private String policeVerification;

	public Applicant(String name, int age, String medical, String policeVerification) {
		super();
		this.name = name;
		this.age = age;
		this.medical = medical;
		this.policeVerification = policeVerification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMedical() {
		return medical;
	}

	public void setMedical(String medical) {
		this.medical = medical;
	}

	public String getPoliceVerification() {
		return policeVerification;
	}

	public void setPoliceVerification(String policeVerification) {
		this.policeVerification = policeVerification;
	}

	@Override
	public String toString() {
		return "Applicant [name=" + name + ", age=" + age + ", medical=" + medical + ", policeVerification="
				+ policeVerification + "]";
	}
	
	public boolean checkApplicantforDL() throws InvalidAge, PoliceVerification, MedicalVerification {
	if(this.age<18) {
		logger.info("Age is not valid");
		throw new InvalidAge("Age not valid for applying");
	}
	else if((this.medical).equals("unfit")) {
		logger.info("Medically not fit");
		throw new MedicalVerification("Applicant medically unfit to apply");
	}
	else if((this.policeVerification).equals("not clear")) {
		logger.info("Police verification not clear");
		throw new PoliceVerification("Applicant not verified");
	}
	return true;
	}
	
}
	
	
	
	
	
