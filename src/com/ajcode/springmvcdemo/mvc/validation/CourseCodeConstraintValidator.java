package com.ajcode.springmvcdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements
							ConstraintValidator<CourseCode, String>{
	
	private String[] coursePrefix;

	@Override
	public void initialize(CourseCode theCourseCode) {
		//assigns "LUV" to coursePrefix
		coursePrefix = theCourseCode.value();
	}
	
	//here: String theCode -> is the code entered by the user in the HTML form
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		// TODO Auto-generated method stub
		boolean result = false;
		
		//null checks have to be done for validation, it is important otherwise we'll get error
		if(theCode != null) {
			
			//loop through coursePrefixes
			for(String str : coursePrefix) {
				result  = theCode.startsWith(str);
				
				if(result) break;
			}
		}
		else {
			return true;
		}
		
		return result;
	}
	
}
