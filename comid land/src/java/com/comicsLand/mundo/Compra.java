package mundo;

public class Compra {

//-----------------------
//Atributos
//-----------------------
    private String fechaCompra;
    private int valor;
    private int cantidad;

//-----------------------
//Constructor
//-----------------------
    /**
     * Es el constructor de la clase
     *
     * @param fechaCompra
     * @param valor
     * @param cantidad
     */
    public Compra(String fechaCompra, int valor, int cantidad) {
        this.fechaCompra = fechaCompra;
        this.valor = valor;
        this.cantidad = cantidad;
    }

//-----------------------
//Metodos
//-----------------------
    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
