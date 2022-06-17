<!DOCTYPE html>
<html>

<body>

Hello world of Spring!

<br><br>

<!-- here in param.studentName -> studentName is the actual text field name in the form.jsp file -->
Student Name: ${param.studentName}

<br><br>
<!-- here the message is the model attribute from controller -->
The message: ${message}
</body>

</html>