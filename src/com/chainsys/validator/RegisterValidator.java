package com.chainsys.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.chainsys.model.Registration;

public class RegisterValidator {
	public void validateId(Registration registration) throws Exception {
		if (registration.getId() <= 0) {
			throw new Exception("invalid id");
		}

	}

	public static boolean validNumber(String mobilenumber) {
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");

		Matcher m = p.matcher(mobilenumber);
		return (m.find() && m.group().equals(mobilenumber));
	}

	public static boolean isValidMobileNumber(String mobilenumber) {
		
		if (validNumber(mobilenumber)) {
		
			return true;
		} else {

			
			return false;
		}
	}

}
