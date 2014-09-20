/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comicsLand.datos;

import com.comicsLand.mundo.Comic;
import com.comicsLand.mundo.Editorial;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import mundo.Restauracion;

/**
 * @author David Q.
 */
public class EditorialDao {

    /**
     * atributo fachada para establecer la conexion a la BD
     */
    private Fachada fachada;
    private Statement stm;

    /**
     * Constructor de la clase
     */
    public EditorialDao() {
        fachada = new Fachada();
    }
    /**
     * metodo que permite agregar una editorial en la base de datos
     */
    public int crearEditorial(Editorial e )
    {
        int agregado = -1;
        try {
            Connection conxion = fachada.GetConnection();
            String estado = "";
            if(e.getEstado().equals("0")){
            estado = "ACTIVO";
            }
            else{
             estado = "INACTIVO";   
            }
            String miSql = "INSERT INTO editorial ( nombre, estado, id_pais) VALUES ('" + e.getNombre() + "', '" + estado +"'," + 1 + ")";
            if (conxion != null) {

                Statement instruccion = (Statement) conxion.createStatement();
                agregado = ((java.sql.Statement) instruccion).executeUpdate(miSql);
                conxion.close();

            }
            fachada.desconectar(conxion);

        } catch (Exception ex) {
            // Logger.getLogger(ComicDao.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return agregado;
    }
    /**
     * metodo que permite buscar una editorial
     */
    public boolean buscarEditorial(String xNombre) {
        boolean b = false;
        Connection miConexion = fachada.GetConnection();
        String sql = "select nombre from editorial where nombre='" + xNombre + "'";
        if (miConexion != null) {
            try {
                Statement instruccion = miConexion.createStatement();
                ResultSet tabla = instruccion.executeQuery(sql);
                while (tabla.next() && !b) {
                    b = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(EditorialDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return b;
    }
     /**
     * metodo que permite eliminar una editorial
     */
    public void eliminarEditorial(String nombre) {
        try {
            Connection miConexion = fachada.GetConnection();
            Statement s = (Statement) miConexion.createStatement();
            s.execute("DELETE FROM editorial WHERE nombre ='" + nombre + "'");
        } catch (SQLException ex) {
            Logger.getLogger(EditorialDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     /**
     * metodo que permite modificar una editorial
     */

    public void modificarEditorial(String editorialAmodificar, Editorial e) {

        try {
            String estado = "";
            if(e.getEstado().equals("0")){
            estado = "ACTIVO";
            }
            else{
             estado = "INACTIVO";   
            }
            String sql = "UPDATE editorial SET nombre ='" + e.getNombre() + "', estado = '" + estado + "', id_pais="+ 1 + " WHERE nombre='" + editorialAmodificar + "'";
            Connection miConexion = fachada.GetConnection();
            if (miConexion != null) {
                Statement instruccion = (Statement) miConexion.createStatement();
                instruccion.executeUpdate(sql);
                miConexion.close();
                instruccion.close();
            }
            fachada.desconectar(miConexion);
        } catch (SQLException ex) {
            Logger.getLogger(EditorialDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}