package com.LogDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserAuthenticationTest {
	@Test
	void loginUserSuccessTest() {
		UserAuthentication ua = new UserAuthentication();
		String actual = ua.loginUser("Abhi", "Abhi01");
		String expected = "Successfully logged in";
		assertEquals(expected, actual);

	}
	@Test
	void loginUserFailureTest() {
		UserAuthentication ua = new UserAuthentication();
		assertThrows(RuntimeException.class, ()->ua.loginUser("", "Abhi01"));
	}

}
