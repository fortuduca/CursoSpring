package com.luv2code.springdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	@NotNull (message="Debe introducir el nombre")
	@Size(min=10, message="Al menos 10 caracteres")
	private String firstName;
	
	@NotNull(message="Debe introducir los apellidos")
	@Size(min=10, max=12, message="La longitud debe estar entre 10 y 12 caracteres")

	private String lastName;

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
