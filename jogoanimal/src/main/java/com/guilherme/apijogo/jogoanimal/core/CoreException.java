package com.guilherme.apijogo.jogoanimal.core;

public abstract class CoreException extends Exception {

	public CoreException() {
		super();
	}


	public CoreException(String message) {
		super(message);
		this.logError(message);
	}

	public CoreException(String message, Throwable error) {
		super(message, error);
		this.logError(message);
		this.logTrace(error);
	}


	private void logError(String message) {
		Logger.error(message);
	}

	private void logTrace(Throwable error) {
		Logger.trace(error);
	}
}