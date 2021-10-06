<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html xmlns:form="http://www.w3.org/1999/xhtml">
<body>
<h2> Dear Employee, Please enter your details</h2>
<br>
<br>
<form:form action="showEmpDetails" modelAttribute="employee">

Name <form:input path="name"/>
<br>
<br>
Surname <form:input path="surname"/>
<br>
<br>
Salary <form:input path="salary"/>
<br>
<br>
<input type="submit" value="OK">
</form:form>
</body>
</html>