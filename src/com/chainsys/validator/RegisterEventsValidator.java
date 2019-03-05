package com.chainsys.validator;

import com.chainsys.model.Registration;
import com.chainsys.model.Student;

public class RegisterEventsValidator {
	public void validateId(Student student) throws Exception {
		if(student.getId()<=0)
		{
			throw new Exception("invalid id");
		}
			
	}
	
	
}
