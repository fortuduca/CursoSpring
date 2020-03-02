<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
	<title>Student Confirmation</title>
</head>
<body>

	The student is confirmed: ${student.firstName} ${student.lastName} 

    <br><br>
    Country property: ${student.country}

    <br><br>
    Country lista: ${student.countryLista}
	
    <br><br>
    Favorite Language: ${student.favoriteLanguage}

    <br><br>
    Favorite Language Properties: ${student.languageProperties}

    <br><br>
    Operating System:
    <ul>
      <c:forEach var="temp" items="${student.osOptions }">
      	<li>${temp.value }</li>
      </c:forEach>	
    </ul>

    <br><br>
    Operating System Properties:
    <ul>
      <c:forEach var="temp" items="${student.osProperties}">
      	<li>${temp}</li>
      </c:forEach>	
    </ul>
    

</body>

</html>