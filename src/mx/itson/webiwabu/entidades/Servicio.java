/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.webiwabu.entidades;

/**
 * Clase Servicio con atributos de servicio
 * @author medin
 */
public class Servicio {
    private Double costoKwh;
private Double dap;
private Double cargosCreditos;
private Double facturacionPeriodo;
private Double diferenciaPeriodo;
private Double adeudoAnterior;
private Double pagoAnterior;
private Double subtotal;
private Double iva;
private Double total;
private Double lecturaAnterior;
private Double lecturaActual;

    /**
     * @return the costoKwh
     */
    public Double getCostoKwh() {
        return costoKwh;
    }

    /**
     * @param costoKwh the costoKwh to set
     */
    public void setCostoKwh(Double costoKwh) {
        this.costoKwh = costoKwh;
    }

    /**
     * @return the dap
     */
    public Double getDap() {
        return dap;
    }

    /**
     * @param dap the dap to set
     */
    public void setDap(Double dap) {
        this.dap = dap;
    }

    /**
     * @return the cargosCreditos
     */
    public Double getCargosCreditos() {
        return cargosCreditos;
    }

    /**
     * @param cargosCreditos the cargosCreditos to set
     */
    public void setCargosCreditos(Double cargosCreditos) {
        this.cargosCreditos = cargosCreditos;
    }

    /**
     * @return the facturacionPeriodo
     */
    public Double getFacturacionPeriodo() {
        return facturacionPeriodo;
    }

    /**
     * @param facturacionPeriodo the facturacionPeriodo to set
     */
    public void setFacturacionPeriodo(Double facturacionPeriodo) {
        this.facturacionPeriodo = facturacionPeriodo;
    }

    /**
     * @return the diferenciaPeriodo
     */
    public Double getDiferenciaPeriodo() {
        return diferenciaPeriodo;
    }

    /**
     * @param diferenciaPeriodo the diferenciaPeriodo to set
     */
    public void setDiferenciaPeriodo(Double diferenciaPeriodo) {
        this.diferenciaPeriodo = diferenciaPeriodo;
    }

    /**
     * @return the adeudoAnterior
     */
    public Double getAdeudoAnterior() {
        return adeudoAnterior;
    }

    /**
     * @param adeudoAnterior the adeudoAnterior to set
     */
    public void setAdeudoAnterior(Double adeudoAnterior) {
        this.adeudoAnterior = adeudoAnterior;
    }

    /**
     * @return the pagoAnterior
     */
    public Double getPagoAnterior() {
        return pagoAnterior;
    }

    /**
     * @param pagoAnterior the pagoAnterior to set
     */
    public void setPagoAnterior(Double pagoAnterior) {
        this.pagoAnterior = pagoAnterior;
    }

    /**
     * @return the subtotal
     */
    public Double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the iva
     */
    public Double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(Double iva) {
        this.iva = iva;
    }

    /**
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * @return the lecturaAnterior
     */
    public Double getLecturaAnterior() {
        return lecturaAnterior;
    }

    /**
     * @param lecturaAnterior the lecturaAnterior to set
     */
    public void setLecturaAnterior(Double lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }

    /**
     * @return the lecturaActual
     */
    public Double getLecturaActual() {
        return lecturaActual;
    }

    /**
     * @param lecturaActual the lecturaActual to set
     */
    public void setLecturaActual(Double lecturaActual) {
        this.lecturaActual = lecturaActual;
    }
}
