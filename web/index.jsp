<%-- 
    Document   : index
    Created on : 12/05/2016, 05:50:11 PM
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
        <h1>Registro:</h1>
        <form action = "registro.do" method = "">
            <table>
                <tr>
                    <td>Codigo:</td>        
                    <td><input type = "text" name = "txtCodigo"/> </td>     
                </tr> 
                <tr>
                    <td>Matricula</td>        
                    <td><input type = "text" name = "txtMatricula"/></td>      
                </tr> 
                <tr>
                    <td>Volumen Maximo</td>        
                    <td><input type = "text" name = "txtVolumen"/></td>      
                </tr> 
                <tr>
                    <td>Peso Maximo</td>        
                    <td><input type = "text" name = "txtPeso"> </td>      
                </tr>
                <tr>
                    <td>Dueño</td>        
                    <td><input type = "text" name = "txtDueno"> </td>      
                </tr> 
                 <tr>
                    <td></td>        
                    <td><input type = "submit" name = "Registrar..."> </td>      
                </tr> 
            </table>
        </form>
        
    
        <table>
            <tr>
                <td></td>        
                <td><input type="submit" value="borrar" onclick = "location='borrar.jsp'"/> </td>      
                </tr> 
        </table>
         <table>
            <tr>
                <td></td>        
                <td><input type="submit" value="Consultar" onclick = "location='consultarTodo.jsp'"/> </td>      
            </tr> 
        </table>
    
    </body>
</html>
