package mundo;

import java.sql.Date;

public class Restauracion {

//-----------------------
//Atributo
//-----------------------
    private Date fecha;

//-----------------------
//Constructor
//-----------------------
    /**
     * Es el constructor de la clase
     * @param fecha
     */
    public Restauracion(Date fecha) {
        this.fecha = fecha;
    }

//-----------------------
//Metodos
//-----------------------
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
