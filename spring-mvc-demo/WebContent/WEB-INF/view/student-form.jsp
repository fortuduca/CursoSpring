<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
	<title>Student Registration Form</title>
</head>
<body>

 <form:form action="processForm" modelAttribute="student">
 	First name: <form:input path="firstName" />
 	<br><br>
 	Last name: <form:input path="lastName" />
 	<br><br>  
 	Country lista java:
 	<form:select path="countryLista">
 	  <form:options items="${student.countryOptionsLista}"/>
 	</form:select>
 
    <br><br>	
 	Country Properties:
 	<form:select path="country">
 	  <form:options items="${theCountryOptions}"/>
 	</form:select>
 	
 	<br><br>
 	Favorite Language:<br>		
		<form:radiobuttons path="favoriteLanguage" 
			items="${student.favoriteLanguageOptions}"  /> 	
 	
 	<br><br>
 	Favorite Language properties:<br>		
		<form:radiobuttons path="languageProperties" 
		   items="${theLanguageProperties}"  /> 	

    <br><br>
    Operating System:<br>
  <form:checkboxes path="osOptions" 
	 	     items="${student.osOptions}"  /> 	
    
 	<br><br>
 	OS properties:<br>		
		<form:checkboxes path="osProperties" 
		   items="${theOsProperties}"  /> 	

<br><br>
     <input type="submit" value="Submit" /> 	
 </form:form>
 
 <br><br>
 
 
</body>

</html>