<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>
<!-- The below will call the getter methods from the class -->
The Student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

You are from: ${student.country }

<br><br>

Your Favorite programming language is: ${student.favoriteLanguage}

<br><br>

Your Operating Systems are: 

<ul>
	<c:forEach var=	"temp" items="${student.operatingSystems}">
		<li> ${temp}</li>
	</c:forEach>
</ul>

</body>

</html>