package mundo;

public class Cliente
{

//-----------------------
//Atributos
//-----------------------
    private String identificacion;
	private String nombres;
	private String apellidos;
	private String email;
	private String telefono;

//-----------------------
//Constructor
//----------------------- 
        
        /**
         * Es el constructor de la clase
         * @param identificacion
         * @param nombres
         * @param apellidos
         * @param email
         * @param telefono 
         */
    public Cliente(String identificacion, String nombres, String apellidos, String email, String telefono) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
    }

//-----------------------
//Metodos
//-----------------------
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
