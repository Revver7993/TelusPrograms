package com.Passport;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PassportApplicationTest {
	@Test
	void passportNationalityTest() {
		Applicant a1=new Applicant("Abhishek", 20, "not Indian", "clear");
		assertThrows(Nationality.class, ()->a1.passportCriteria());
	}
	@Test
	void passportCriminalRecordTest() {
		Applicant a2=new Applicant("Abhishek", 20, "Indian", "not clear");
		assertThrows(CriminalRecord.class, ()->a2.passportCriteria());
	}
	@Test
	void passportAgeTest() {
		Applicant a3=new Applicant("Abhishek", 16, "Indian", "clear");
		assertThrows(InvalidAge.class, ()->a3.passportCriteria());
	}
	@Test
	void passportEligibityTest() throws InvalidAge, Nationality, CriminalRecord {
		Applicant a4=new Applicant("Abhishek", 20, "Indian", "clear");
		boolean actual=a4.checkApplicantPassport();
		assertTrue(actual);
	}

}
