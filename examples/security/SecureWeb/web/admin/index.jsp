package admin;

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to the User Page</title>
    </head>
    <body>
        <h1>Welcome to the User Page</h1>
        <p>
            Hello, please verify the following information of yours:

        </p><table border="1">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Value</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>User ID</td>
                    <td><%=request.getRemoteUser()%></td>
                </tr>
                <tr>
                    <td>User Principal</td>
                    <td><%=request.getUserPrincipal()%></td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
