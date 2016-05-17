<%-- 
    Document   : error
    Created on : 14/05/2016, 09:30:42 PM
    Author     : Administrator
--%>
<%
String error = (String)request.getSession().getAttribute("error");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ha ocurrido un error: <%=error%></h1>
    </body>
</html>
