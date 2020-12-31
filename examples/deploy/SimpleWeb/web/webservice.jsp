<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Programming-Stuff.com</title>
    </head>
    <body>
        <h1>Invoking a web service</h1>
        <p>
            <form method="GET" action="webservice.jsp">
                Enter your name: <input type="text" name="name" size="20"/>
                <input type="submit" value="Submit" />
            </form>
        </p>
        <hr/>
        <c:if test="${fn:length(param.name) > 0}" >
            <jsp:include page="wsclient"/>
        </c:if>
    </body>
</html>
