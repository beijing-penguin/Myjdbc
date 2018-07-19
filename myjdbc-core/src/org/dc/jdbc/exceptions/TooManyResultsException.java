package org.dc.jdbc.exceptions;

public class TooManyResultsException extends Exception {
	private static final long serialVersionUID = 7868016755892393664L;

	public TooManyResultsException() {
		super("Expected one result (or null) to be returned by select");
	}
}
