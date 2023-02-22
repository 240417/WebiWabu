/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.webiwabu.entidades;

/**
 * Clase Empresa con atributos de una empresa 
 * @author medin
 */
public class Empresa {
    private String nombre;
    private String teléfono;
    private String dirección;
    private String codigoPostal;

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
     * @return the dirección
     */
    public String getDirección() {
        return dirección;
    }

    /**
     * @param dirección the dirección to set
     */
    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    /**
     * @return the codigoPostal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
