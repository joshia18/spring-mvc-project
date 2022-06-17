package com.ajcode.springmvcdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ajcode.springmvcdemo.mvc.validation.CourseCode;

public class Customer {
	
	private String firstName;
	
	//adding validation rules to the member lastName
	@NotNull(message="is required")
	@Size(min=2, message="is required")
	private String lastName;
	
	//here wrapper class Integer is added instead of primitive int, because if there is white spaces, the initial init binder will trim it to null
	@NotNull(message="is required")
	@Min(value = 0, message="value entered for Free Passes must be greater than or equal to zero")
	@Max(value = 10, message="value entered for Free Passes should be less than or equal to 10")
	private Integer freePasses;
	
	//no need to give parameters here as they are given as default in the annotation
	//but we can customize it by giving parameters
	//@CourseCode(value="LUV", message="must start with LUV")
	@CourseCode
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	@Pattern(regexp="^[0-9]{6}", message = "6 digits has to be entered")
	private String postalCode;
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
 