<!DOCTYPE html>
<html>

<body>
<h2> Dear Employee, you are WELCOME!!!</h2>
<br>
<br>

<!--<h3>Your name: ${param.employeeName}</h3>-->
Your name: ${employee.name}
<br>
<br>
Your surname: ${employee.surname}
<br>
<br>
Your salary: ${employee.salary}
<br>
<br>
Your department: ${employee.department}
<br>
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

</html>