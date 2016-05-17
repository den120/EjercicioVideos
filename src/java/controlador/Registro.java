/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Camion;
import modelo.Conexion;

/**
 *
 * @author Administrator
 */
public class Registro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Cod = request.getParameter("txtCodigo");
        String Mat = request.getParameter("txtMatricula");
        String Vol=request.getParameter("txtVolumen");
        String Peso=request.getParameter("txtPeso");
        String Due= request.getParameter("txtDueno");
        if(Cod.equals("") || Mat.equals("") || Vol.equals("")||Peso.equals("")||Due.equals("")){
            String error = "campos vacios....";
            request.getSession().setAttribute("error", error);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }else{
            float p =0;
            float v=0;
            try {
            p = Float.parseFloat(Peso);
            v=Float.parseFloat(Vol);
            }
            catch(NumberFormatException ex){
                String error ="Ingrese solo numeros";
                request.getSession().setAttribute("error", error);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
            
            Camion c1;
            c1 = new Camion(Cod,Mat,v,p,Due);
            Conexion cn = new Conexion();
          
            if(cn.insertar(c1)>0){
              request.getRequestDispatcher("exito.jsp").forward(request, response);
            }else{
              String error = "nose pudo insertar";
               request.getSession().setAttribute("error", error);
               request.getRequestDispatcher("error.jsp").forward(request, response);     
            }
        }
        
  
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
