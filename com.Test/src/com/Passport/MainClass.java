package com.Passport;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class MainClass {

	public static void main(String[] args) throws InvalidAge, Nationality, CriminalRecord{
		Log logger=LogFactory.getLog(MainClass.class);
		
		
		Applicant a1=new Applicant("Jack", 25, "Indian", "not clear");
		Applicant a2=new Applicant("Bob", 30, "Indian", "not clear");
		Applicant a3=new Applicant("Mohan", 22, "Indian", "clear");
		Applicant a4=new Applicant("Sohan", 23, "not Indian", "clear");
		
		
		List<Applicant> aList = new ArrayList<>();
		
		
		try {
			a1.passportCriteria();}
			catch (Exception e){
				logger.error("Error while applying Passport for "+a1.getName());			
			}
			try {
			a2.passportCriteria();}
			catch (Exception e) {
				logger.error("Error while applying Passport for "+a2.getName());
			}
			try {
			a3.passportCriteria();}
			catch (Exception e) {
				logger.error("Error while applying Passport for "+a3.getName());
				}
			try {
			a4.passportCriteria();}
			catch (Exception e) {
				logger.error("Error while applying Passport for "+a4.getName());
				}
			
	}

}

