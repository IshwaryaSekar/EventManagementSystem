package com.chainsys.validator;

import com.chainsys.model.Registration;
import com.chainsys.model.Student;
import com.chainsys.validatorfunctions.ValidatorUtil;

public class RegisterEventsValidator {
	public void validateEvents(Student student) throws Exception {
		if (!ValidatorUtil.isValidId(student.getId())) {
			throw new Exception("invalid id");
		}
		if(!ValidatorUtil.isValidEmail(student.getEmail()))
			
		{	System.out.println("Failed -" + student.getEmail());

			//throw new Exception("invalid email");
		
	}

}
}