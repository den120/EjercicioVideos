<%-- 
    Document   : borrar
    Created on : 17/05/2016, 05:29:50 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action = "borrar.do" method = "">
           <h1>Codigo a borrar</h1>
            <table>
                <tr>
                    <td>Codigo:</td>        
                    <td><input type = "text" name = "txtCodigoB"/> </td>     
                </tr> 
                <tr>
                    <td></td>        
                    <td><input type = "submit" name = "Borrar"> </td>      
                </tr> 
            </table>
        </form>
        
        
        
    </body>
</html>