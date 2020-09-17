<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

<c:forEach var="lettersToMorseCode" items="${lettersToMorseCode}">

Morse Code Results: ${lettersToMorseCode } <br/><br/>

</c:forEach>

</body>
</html>