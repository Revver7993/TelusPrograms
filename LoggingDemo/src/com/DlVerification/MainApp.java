package com.DlVerification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MainApp {

	public static void main(String[] args) {
		Log logger=LogFactory.getLog(MainApp.class);
		
		Applicant a1 = new Applicant("Rohan", 17, "fit", "clear");
		Applicant a2 = new Applicant("Mohan", 18, "unfit", "clear");
		Applicant a3 = new Applicant("Sohan", 19, "fit", "not clear");
		Applicant a4 = new Applicant("Goldy", 20, "fit", "clear");
		Applicant a5 = new Applicant("Soldy", 21, "fit", "clear" );
        
		try {
			a1.dlEligibility();}
		catch (Exception e) {
			logger.error("Error occured while applying DL for"+a1.getName());
		}
		try {
			a2.dlEligibility();}
		catch (Exception e) {
			logger.error("Error occured while applying DL for"+a2.getName());
		}
		try {
			a3.dlEligibility();}
		catch (Exception e) {
			logger.error("Error occured while applying DL for"+a3.getName());
		}
		try {
			a4.dlEligibility();}
		catch (Exception e) {
			logger.error("Error occured while applying DL for"+a4.getName());
		}
		try {
			a5.dlEligibility();}
		catch (Exception e) {
			logger.error("Error occured while applying DL for"+a5.getName());
		}
	}
		

}

	