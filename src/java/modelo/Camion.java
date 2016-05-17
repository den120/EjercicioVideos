/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Administrator
 */
public class Camion {
    
    private String Codigo;
    private String Matricula;
    private float MaxVolumen;
    private float PesoMax;
    private String Dueno;

    public Camion(String Codigo, String Matricula, float MaxVolumen, float PesoMax, String Dueno) {
        this.Codigo = Codigo;
        this.Matricula = Matricula;
        this.MaxVolumen = MaxVolumen;
        this.PesoMax = PesoMax;
        this.Dueno = Dueno;
    }

    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public float getMaxVolumen() {
        return MaxVolumen;
    }

    public void setMaxVolumen(float MaxVolumen) {
        this.MaxVolumen = MaxVolumen;
    }

    public float getPesoMax() {
        return PesoMax;
    }

    public void setPesoMax(float PesoMax) {
        this.PesoMax = PesoMax;
    }

    public String getDueno() {
        return Dueno;
    }

    public void setDueno(String Dueno) {
        this.Dueno = Dueno;
    }
    
    

}
