package entidades;


public class Producto {
    private String prod_id;
    private String prod_nombre;
    private String prod_marca;
    private double prod_precio_venta;
    private double prod_precio_compra;

    public String getProd_id() {
        return prod_id;
    }

    public void setProd_id(String prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_nombre() {
        return prod_nombre;
    }

    public void setProd_nombre(String prod_nombre) {
        this.prod_nombre = prod_nombre;
    }

    public String getProd_marca() {
        return prod_marca;
    }

    public void setProd_marca(String prod_marca) {
        this.prod_marca = prod_marca;
    }

    public double getProd_precio_venta() {
        return prod_precio_venta;
    }

    public void setProd_precio_venta(double prod_precio_venta) {
        this.prod_precio_venta = prod_precio_venta;
    }

    public double getProd_precio_compra() {
        return prod_precio_compra;
    }

    public void setProd_precio_compra(double prod_precio_compra) {
        this.prod_precio_compra = prod_precio_compra;
    }
    
    
    
}
