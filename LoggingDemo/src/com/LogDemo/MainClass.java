package com.LogDemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MainClass {
	
	static Log logger=LogFactory.getLog(MainClass.class);

	public static void main(String[] args) {
		UserAuthentication user=new UserAuthentication();
		logger.info("User is logging");
		user.loginUser("Abhi" , "ku");
		

	}

}
