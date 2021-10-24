<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html xmlns:form="http://www.w3.org/1999/xhtml">
<body>
<h2> Dear Employee, Please enter your details</h2>
<br>
<br>
<form:form action="showEmpDetails" modelAttribute="employee" method="post">

Name <form:input path="name"/>
    <form:errors path="name"/>
<br>
<br>
Surname <form:input path="surname"/>
    <form:errors path="surname"/>
<br>
<br>
Salary <form:input path="salary"/>
    <form:errors path="salary"/>
<br>
<br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
</form:select>
    <br>
    <br>
    Which car do you want&
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    <br>
    Foreign Language(s)
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br>
    <br>
    Phone Number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>