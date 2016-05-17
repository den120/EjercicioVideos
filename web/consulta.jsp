<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : consulta
    Created on : 15/05/2016, 07:09:41 PM
    Author     : Administrator
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Camion"%>
<%-- 
   lo primero es retirar el arraylist de la sesion
--%>
<%

    ArrayList<Camion> camiones = (ArrayList<Camion>)request.getSession().getAttribute("camiones"); 
//recuperamos el objeto de la secion
    
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mostrar todo</h1>
        <%
            for(int i=0;i<camiones.size();i++){
                out.println("<p>Matricula:"+camiones.get(i).getMatricula()+"</p>");
            }
        
        %>
    <%-- 
   siguiente codigo tiene errores
        --%>    
    <c:forEach var="camion" items="${sessionScope.camiones}">
        <p>${camion.camion_codigo}</p>
    </c:forEach>
        
        
    </body>
</html>
