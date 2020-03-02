<!DOCTYPE html>

<html>
<head>
	<title>Primera página</title>
</head>
<body>

 <h2>Spring MVC Demo - Home Page</h2>

ruta Imagen : ${pageContext.request.contextPath}/resources/images/img1.jpg
 
 <img src="${pageContext.request.contextPath}/resources/images/img1.jpg"> 
 
 <hr>
 
 <a href="hello/showForm">Hello World form</a>
 <br>
  <a href="student/showForm">Student form</a>
<br>
  <a href="customer/showForm">Customer form</a>

</body>

</html>