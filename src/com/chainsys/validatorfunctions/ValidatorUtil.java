package com.chainsys.validatorfunctions;


import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class ValidatorUtil {
	public static boolean isValidName(String input){
		return input!= null && !input.trim().equals("") && input.matches("^[a-zA-Z]*$"); 

	}
	public static boolean isValidId(int input){
		return input>=0;

	}
	public static boolean isValidPassword(String input){
		return input!= null && !input.trim().equals("") ;
	}
	
		public static boolean isValidMobileNumber(String mobilenumber) {
			Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");

			java.util.regex.Matcher m = p.matcher(mobilenumber);
			return (m.find() && m.group().equals(mobilenumber));
		}
				
		public static boolean isValidEmail(String input){
			return input.indexOf('@')== -1 && input.indexOf('.')== -1;
		}

	}


