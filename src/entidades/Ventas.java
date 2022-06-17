package entidades;

import java.util.ArrayList;
import java.util.Date;

public class Ventas {
    
    private String vnt_id;
    private double vnt_subtotal;
    private double vnt_total;
    private Date vnt_fecha;
    private String Serie;
    private String nro_comprobante;
    private ArrayList<Vnt_Detalle> lista_detalles; 
    private Clientes cliente;

    public String getVnt_id() {
        return vnt_id;
    }

    public void setVnt_id(String vnt_id) {
        this.vnt_id = vnt_id;
    }

    public double getVnt_subtotal() {
        return vnt_subtotal;
    }

    public void setVnt_subtotal(double vnt_subtotal) {
        this.vnt_subtotal = vnt_subtotal;
    }

    public double getVnt_total() {
        return vnt_total;
    }

    public void setVnt_total(double vnt_total) {
        this.vnt_total = vnt_total;
    }

    public Date getVnt_fecha() {
        return vnt_fecha;
    }

    public void setVnt_fecha(Date vnt_fecha) {
        this.vnt_fecha = vnt_fecha;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getNro_comprobante() {
        return nro_comprobante;
    }

    public void setNro_comprobante(String nro_comprobante) {
        this.nro_comprobante = nro_comprobante;
    }

    public ArrayList<Vnt_Detalle> getLista_detalles() {
        return lista_detalles;
    }

    public void setLista_detalles(ArrayList<Vnt_Detalle> lista_detalles) {
        this.lista_detalles = lista_detalles;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }
    
    
    
     
    
    
}
