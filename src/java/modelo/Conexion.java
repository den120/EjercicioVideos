/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Conexion {
    Connection cnn; //coenctar la bd
    Statement state; //ejecutar un querry
    ResultSet res;  // guardar un resultado de un select
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");//driver de conexion
            cnn= DriverManager.getConnection("jdbc:mysql://localhost:3306/camiones?zeroDateTimeBehavior=convertToNull", "root","");//URL, Usuario,password
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int insertar(Camion c){
        int bandera=0;
        try {
            String querry ="INSERT INTO camion (`CAMION_CODIGO`, `CAMION_MATRICULA`, `CAMION_MAXVOLUMEN`, `CAMION_PESOMAX`, `CAMION_DUENO`)"
                    +"VALUES('"+c.getCodigo()+"','"+c.getMatricula()+"',"+c.getMaxVolumen()+","+c.getPesoMax()+",'"+c.getDueno()+"')";
            state =   cnn.createStatement();
            bandera = state.executeUpdate(querry);
              
           
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bandera;
    }

    public ResultSet consultarTodo(){
        try {
            String query = "select * from camion";
            state = cnn.createStatement();
            res = state.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    public int Eliminar(String c){
        int bandera=0;
        try {
            
            String querry = "delete from camion where camion_codigo = '"+c+"'";
            state = cnn.createStatement();
            bandera = state.executeUpdate(querry);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bandera;
         
    }
    
    
    
    
}
