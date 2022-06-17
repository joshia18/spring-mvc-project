package com.ajcode.springmvcdemo.mvc.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface CourseCode {
	
	//set default value for the annotation parameters value and message
	//define default course code
	public String[] value() default {"AJC", "LUV"};
	
	//define default error message
	public String message() default "must start with AJC or LUV";
	
	//define default groups
	//Groups: can group related constraints
	public Class<?>[] groups() default {};
	
	//define default pay loads
	public Class<? extends Payload>[] payload() default {};
}
