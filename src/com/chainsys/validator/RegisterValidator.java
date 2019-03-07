package com.chainsys.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.chainsys.model.Registration;
import com.chainsys.validatorfunctions.ValidatorUtil;

public class RegisterValidator {
	public void validateRegistration(Registration registration)
			throws Exception {
		if (!ValidatorUtil.isValidId(registration.getId())) {
			throw new Exception("invalid id");
		}
		if (!ValidatorUtil.isValidName(registration.getName())) {
			throw new Exception("No name ");
		}
		if (!ValidatorUtil.isValidPassword(registration.getPassword())){
			throw new Exception("No password");
		}
		
		if (!ValidatorUtil.isValidMobileNumber(registration.getMobilenumber())){
			//System.out.println("Failed - Mobile no validation':" + registration.getMobilenumber());
			throw new Exception("invalid mobilenumber");
		}
		
	

}}
