package com.example.Logging;

import org.apache.log4j.Logger;

public class SecondLog {


	
	final static Logger mojLogger=Logger.getLogger(SecondLog.class);
	public static void main(String[] args) {
		
		
		mojLogger.fatal("FATAL ERROR");
		mojLogger.info("Informativna poruka");
	}
}
