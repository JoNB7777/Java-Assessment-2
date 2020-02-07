package com.qa.assessment;

public class NoDirectionEnteredException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Please enter a valid direction (e, w, s or n).";
	}

}
