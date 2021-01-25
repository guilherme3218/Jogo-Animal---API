package com.guilherme.apijogo.jogoanimal.core;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Logger {

	public static final String _REQUEST = "================ REQUEST ================";

	public static final String _REQUEST_BODY = "================ REQUEST BODY ================";

	public static final String _PARAM = "================ PARAMETERS ================";



	public static void info(String message) {
		log.info(message);
	}


	public static void info(String message, Object object) {
		log.info(message);
		if (object != null) {
			log.info(object.toString());
		}
	}


	public static void error(String message) {
		log.error(message);
	}

	public static void error(String message, Object object) {
		log.error(message);
		log.error(object.toString());
	}

	public static void trace(Throwable error) {
		log.trace(error.getMessage(), error);
	}

}