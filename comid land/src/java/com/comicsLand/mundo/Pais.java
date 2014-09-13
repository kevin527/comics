package mundo;

public class Pais
{
    
//-----------------------
//Atributo
//-----------------------
	private String nombre;

//-----------------------
//Constructor
//-----------------------
        /**
         * Es el cpnstructor de la clase
         * @param nombre 
         */
    public Pais(String nombre) {
        this.nombre = nombre;
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
}
