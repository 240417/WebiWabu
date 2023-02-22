/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.webiwabu.entidades;

import java.util.Date;
import mx.itson.webiwabu.enumeradores.FormaPago;
import mx.itson.webiwabu.enumeradores.MetodosPago;

/** 
 * Clase Pago con atributos de pago
 * @author Jesus Quintero
 */
public class Pago {
    private FormaPago formaPago;
    private MetodosPago metodosPago;
    private Date fecha;

    /**
     * @return the formaPago
     */
    public FormaPago getFormaPago() {
        return formaPago;
    }

    /**
     * @param formaPago the formaPago to set
     */
    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    /**
     * @return the metodosPago
     */
    public MetodosPago getMetodosPago() {
        return metodosPago;
    }

    /**
     * @param metodosPago the metodosPago to set
     */
    public void setMetodosPago(MetodosPago metodosPago) {
        this.metodosPago = metodosPago;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
