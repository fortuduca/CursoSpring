package com.luv2code.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;

	@Value("#{languageProperties}") 
	private Map<String, String> languageProperties;
	
	@Value("#{operatingSystemsProperties}") 
	private Map<String, String> osProperties;	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel){
	    Student theStudent = new Student();
	    
	    theModel.addAttribute("student", theStudent);
	    	    
	    theModel.addAttribute("theCountryOptions", countryOptions); 
	    
	    theModel.addAttribute("theLanguageProperties", languageProperties);
	    
	    theModel.addAttribute("theOsProperties", osProperties);	    
		
		return "student-form";
	}
	

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent){

		System.out.println("theStudent: " + theStudent.getFirstName()
		                     + " " + theStudent.getLastName()
		                     + " " + theStudent.getCountry()
		                     + " " + theStudent.getCountryLista()
		                     + " " + theStudent.getFavoriteLanguage());
			
		
		return "student-confirmation";
	}

}
