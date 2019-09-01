package com.sde.cookbook;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class XMLFileLog4jExample {

static Logger logger = Logger.getLogger(PropertiesFileLog4jExample.class);
	
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir")
                + "/src/main/resources/" + "log4j.xml";
        PropertyConfigurator.configure(log4jConfigFile);
        logger.debug("this is a debug log message");
        logger.info("this is a information log message");
        logger.warn("this is a warning log message");

	}


}
