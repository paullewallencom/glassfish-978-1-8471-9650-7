<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="com.programmingstuff.hello.*"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h1>JSP Page</h1>
    

    <p>
    The Hello Provider is: <%= new HelloProvider().getName() %>.
    </p>

    </body>
</html>
