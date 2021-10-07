<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns:form="http://www.w3.org/1999/xhtml">
<html>

<body>
<h2> Dear Employee, you are WELCOME!!!</h2>
<br>
<br>

<!--<h3>Your name: ${param.employeeName}</h3>-->
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your Car: ${employee.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li $(lang) </li>
               </c:forEach>
</ul>
Phone Number: ${employee.phoneNumber}
</body>
<br>
Email: ${employee.email}

</html>