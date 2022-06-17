<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	
	<form:form action = "processForm" modelAttribute = "student">
	
	First Name: <form:input path = "firstName"/>
	
	<br><br>
	
	Last Name: <form:input path = "lastName"/>
	
	<br><br>
	
	<form:select path = "country">
		<form:options items="${student.countryOptions}" />
		<!-- <form:option value="BRA" label = "Brazil"></form:option>
		<form:option value="FRA" label = "France"></form:option>
		<form:option value="GER" label = "Germany"></form:option>
		<form:option value="IND" label = "India"></form:option> -->
	</form:select>
	
	<br><br>
	
	Favorite Language: 
	<form:radiobuttons path = "favoriteLanguage" items = "${student.favoriteLanguageOptions}" />
	<!--  Java <form:radiobutton path = "favoriteLanguage" value = "Java" />
	C# <form:radiobutton path = "favoriteLanguage" value = "C#" />
	PHP <form:radiobutton path = "favoriteLanguage" value = "PHP" />
	Kotlin <form:radiobutton path = "favoriteLanguage" value = "Kotlin" /> -->
	
	<br><br>
	Operating Systems:
	Linux<form:checkbox path = "operatingSystems" value = "Linux" />
	Mac<form:checkbox path = "operatingSystems" value = "Mac" />
	MS Windows<form:checkbox path = "operatingSystems" value = "MS Windows" />
	
	<br><br>
	<input type = "submit" value = "Submit" />
	<input type="reset">
	
	</form:form>

</body>

</html>