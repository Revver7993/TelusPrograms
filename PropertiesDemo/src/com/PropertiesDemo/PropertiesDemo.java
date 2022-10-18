package com.PropertiesDemo;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class PropertiesDemo {

	public static void main(String[] args) throws ConfigurationException {
		Configurations configuration = new Configurations();
		PropertiesConfiguration config = configuration.properties("configuration.properties");
		System.out.println(config.getProperty("name"));

	}

}
