/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.webiwabu.entidades;

import java.util.Date;

/**
 *
 * @author carlo
 */
public class Recibo {
    private Empresa empresa;
    private Servicio servicio;
    private Cliente cliente;
    private Date fechaInicio;
    private Date fechaFinal;
    private Date fechaLimite;
    private Date fechaCorte;
    private CostoMercado costoMercado;
    private String numMedidor;

    /**
     * @return the empresa
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the servicio
     */
    public Servicio getServicio() {
        return servicio;
    }

    /**
     * @param servicio the servicio to set
     */
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFinal
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }

    /**
     * @param fechaFinal the fechaFinal to set
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * @return the fechaLimite
     */
    public Date getFechaLimite() {
        return fechaLimite;
    }

    /**
     * @param fechaLimite the fechaLimite to set
     */
    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    /**
     * @return the fechaCorte
     */
    public Date getFechaCorte() {
        return fechaCorte;
    }

    /**
     * @param fechaCorte the fechaCorte to set
     */
    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    /**
     * @return the costoMercado
     */
    public CostoMercado getCostoMercado() {
        return costoMercado;
    }

    /**
     * @param costoMercado the costoMercado to set
     */
    public void setCostoMercado(CostoMercado costoMercado) {
        this.costoMercado = costoMercado;
    }

    /**
     * @return the numMedidor
     */
    public String getNumMedidor() {
        return numMedidor;
    }

    /**
     * @param numMedidor the numMedidor to set
     */
    public void setNumMedidor(String numMedidor) {
        this.numMedidor = numMedidor;
    }
    
}
