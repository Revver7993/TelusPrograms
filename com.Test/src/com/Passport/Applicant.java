package com.Passport;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Applicant {
	
	
	Log logger=LogFactory.getLog(Applicant.class);
	
	public boolean passportCriteria() throws InvalidAge, Nationality, CriminalRecord {
		boolean eligible=checkApplicantPassport();
		return eligible;
		
	}
	
	private String name;
	private int age;
	private String nationality;
	private String criminalRecord;
	
	public Applicant(String name, int age, String nationality, String criminalRecord) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.criminalRecord = criminalRecord;
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


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getCriminalRecord() {
		return criminalRecord;
	}


	public void setCriminalRecord(String criminalRecord) {
		this.criminalRecord = criminalRecord;
	}


	@Override
	public String toString() {
		return "Applicant [name=" + name + ", age=" + age + ", nationality=" + nationality + ", criminalRecord="
				+ criminalRecord + "]";
	}


	public boolean checkApplicantPassport() throws InvalidAge, CriminalRecord, Nationality{
		if(this.age<18) {
			logger.info("Age not valid");
			throw new InvalidAge("Age not valid for applying");
		}
		else if((this.criminalRecord).equals("not clear")){
			logger.info("Criminal Record not clear");

			throw new CriminalRecord("Applicant criminal record not clear");
		}
		else if((this.nationality).equals("not Indian")) {
			logger.info("Nationality not accepted");

			throw new Nationality("Applicant is not Indian");
		}
		return true;
	}
	
	

}
