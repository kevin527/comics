package mundo;

public class Sesion {
//-----------------------
//Atributos
//-----------------------

    private String nombre_usuario;
    private String contrasenia;

//-----------------------
//Constructor
//-----------------------
    /**
     * constructor de la clase
     * @param nombre_usuario
     * @param contrasenia 
     */
    public Sesion(String nombre_usuario, String contrasenia) {
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
    }
//-----------------------
//Metodos
//-----------------------

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

}
