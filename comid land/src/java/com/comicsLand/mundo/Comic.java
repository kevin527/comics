package com.comicsLand.mundo;

public class Comic {

//-----------------------
//Atributos
//-----------------------	
    private String nombre;
    private String imagen;
    private String anioPublicacion;

//-----------------------
//Constructor
//-----------------------
    
    /**
     * Es el constructor de la clase
     * @param nombre
     * @param imagen
     * @param anioPublicacion 
     */
    public Comic(String nombre, String imagen, String anioPublicacion) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.anioPublicacion = anioPublicacion;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

}
