package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

		private String firstName;
		private String lastName;
		
		private String country;
		private String countryLista;
		private LinkedHashMap<String, String> countryOptionsLista;		

		private String favoriteLanguage;
		private LinkedHashMap<String, String> favoriteLanguageOptions;
		
		private String languageProperties;
		
		private String[] operatingSystems;
		private String[] OsProperties;		
		private LinkedHashMap<String, String> osOptions;
						
		
		
		public Student() {
			countryOptionsLista = new LinkedHashMap<> ();
			countryOptionsLista.put("BR","Brazil");
			countryOptionsLista.put("FR","Francia");
			countryOptionsLista.put("DE","Germany");
			countryOptionsLista.put("IN","India");
			countryOptionsLista.put("US","United States of America");
			
			favoriteLanguageOptions = new LinkedHashMap<> ();
			favoriteLanguageOptions.put("Java", "Java");
			favoriteLanguageOptions.put("C#", "C#");
			favoriteLanguageOptions.put("PHP", "PHP");
			favoriteLanguageOptions.put("Ruby", "Ruby");
			favoriteLanguageOptions.put(".NET", ".NET");
			
			osOptions = new LinkedHashMap<> ();
			osOptions.put("Windows", "Windows");
			osOptions.put("Android", "Android");
			osOptions.put("IOS", "IOS");
			osOptions.put("Mac OS", "Mac OS");
			osOptions.put("Linux", "Linux");
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

		public String getCountry() {
			return country;
		}
		
		public void setCountry(String country) {
			this.country = country;
		}
		
		
		public String getCountryLista() {
			return countryLista;
		}
		
		
		public void setCountryLista(String country) {
			this.countryLista = country;
		}
		
		
		public LinkedHashMap<String, String> getCountryOptionsLista() {
			return countryOptionsLista;
		}
		
		public void setCountryOptionsLista(LinkedHashMap<String, String> countryOptionsLista) {
			this.countryOptionsLista = countryOptionsLista;
		}

		//comienza language
		public String getFavoriteLanguage() {
			return favoriteLanguage;
		}

		public void setFavoriteLanguage(String favoriteLanguage) {
			this.favoriteLanguage = favoriteLanguage;
		}
		
		public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
			return favoriteLanguageOptions;
		}

		public String getLanguageProperties() {
			return languageProperties;
		}

		public void setLanguageProperties(String languageProperties) {
			this.languageProperties = languageProperties;
		}

		//comienza SO (CheckBox)
		public String[] getOperatingSystems() {
			return operatingSystems;
		}

		public void setOperatingSystems(String[] operatingSystems) {
			this.operatingSystems = operatingSystems;
		}

		public String[] getOsProperties() {
			return OsProperties;
		}

		public void setOsProperties(String[] osProperties) {
			OsProperties = osProperties;
		}

		public LinkedHashMap<String, String> getOsOptions() {
			return osOptions;
		}
				

}
