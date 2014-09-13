package mundo;

public class Editorial {

//-----------------------
//Atributos
//-----------------------
    private String nombre;
    private String estado;

//-----------------------
//Constructor
//-----------------------
    /**
     * Es el constructor de la clase
     * @param nombre
     * @param estado 
     */
    public Editorial(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

//-----------------------
//Metodos
//-----------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
