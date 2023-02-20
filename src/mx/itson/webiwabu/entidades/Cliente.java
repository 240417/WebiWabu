/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.webiwabu.entidades;

/**
 *
 * @author medin
 */
public class Cliente {
    private String nombre;
    private String direccion;
    private int codigoPostal;
    private String teléfono;
    private String numServicio;
    private String rmu;
    private String rfc;
    private String cp;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the codigoPostal
     */
    public int getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * @return the teléfono
     */
    public String getTeléfono() {
        return teléfono;
    }

    /**
     * @param teléfono the teléfono to set
     */
    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    /**
     * @return the numServicio
     */
    public String getNumServicio() {
        return numServicio;
    }

    /**
     * @param numServicio the numServicio to set
     */
    public void setNumServicio(String numServicio) {
        this.numServicio = numServicio;
    }

    /**
     * @return the rmu
     */
    public String getRmu() {
        return rmu;
    }

    /**
     * @param rmu the rmu to set
     */
    public void setRmu(String rmu) {
        this.rmu = rmu;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the cp
     */
    public String getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(String cp) {
        this.cp = cp;
    }
}
