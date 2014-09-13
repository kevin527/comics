package mundo;

import java.sql.Date;

public class Venta {

//-----------------------
//Atributos
//-----------------------
    private Date fechaVenta;
    private double valor;
    private int cantidad;

//-----------------------
//Constructor
//-----------------------
    /**
     * Es el constructor de la clase
     *
     * @param fechaVenta
     * @param valor
     * @param cantidad
     */
    public Venta(Date fechaVenta, double valor, int cantidad) {
        this.fechaVenta = fechaVenta;
        this.valor = valor;
        this.cantidad = cantidad;
    }

//-----------------------
//Metodos
//-----------------------
    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
