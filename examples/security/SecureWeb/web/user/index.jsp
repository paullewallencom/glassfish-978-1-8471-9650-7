<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%@page import = "java.sql.*, javax.sql.*, javax.naming.*"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to the Admin Page</title>
    </head>
    <body>
        <h1>Welcome to the Admin Page</h1>
        <p>
            Hello, please verify the following information of yours:
        </p>
        <table border="1">
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
        <p>
            Here is the information you need:
        </p>

        <sql:query var="query" dataSource="jdbc/UserDS">
            SELECT id, firstname, lastname, gender FROM users
        </sql:query>

        <table border="1">
            <c:forEach var="columnName" items="${query.columnNames}">
                <th><c:out value="${columnName}"/></th>
            </c:forEach>
            <c:forEach var="row" items="${query.rows}">
                <tr>
                    <c:forEach var="column" items="${row}">
                        <td><c:out value="${column.value}"/></td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </table>

<%--
        <%
        try {
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/StudentDS");
            Connection conn = ds.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name, firstEnrolled FROM student");
            while (rs.next()) {
                out.println("Name + " + rs.getString("name") + "; Enrolled: " + rs.getDate("firstEnrolled"));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            throw new ServletException(e);
        }
        %>
        --%>
    </body>
</html>
