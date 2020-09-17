<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

<h3 align="center">The MorseCode</h3>
<hr>


<form action="MorseCodeToLettersServlet" method="GET">

Write MorseCode: <input type="text" name="letters" />
<br/><br/>

submit :<input type="submit" value="submit"/>

<hr>

</form>

</body>
</html>