/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comicsLand.datos;

import com.comicsLand.mundo.Comic;
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
public class ComicDao {

    /**
     * atributo fachada para establecer la conexion a la BD
     */
    private Fachada fachada;
    private Statement stm;

    /**
     * Constructor de la clase
     */
    public ComicDao() {
        fachada = new Fachada();
    }
    /**
     * metodo que permite agregar un comic
     */
    public int crearComic(Comic c, String res) {
        int agregado = -1;
        try {
            String fecha = c.getAnioPublicacion();
            String[] separador = fecha.split("-");

            /* Date fechaPub =  new Date(Integer.parseInt(separador[0].toString()), Integer.parseInt(separador[1].toString()), 
             Integer.parseInt(separador[2].toString()));*/
            Connection conxion = fachada.GetConnection();
            String miSql = "INSERT INTO comic ( nombre, imagen, publicacion, restauracion, id_editorial) VALUES ('" + c.getNombre() + "', '" + c.getImagen() + "', '" + c.getAnioPublicacion() + "','"
                    + res + "'," + 1 + ")";
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
     * metodo que permite buscar un comic
     */
    public boolean buscarComic(String xNombre) {
        boolean b = false;
        Connection miConexion = fachada.GetConnection();
        String sql = "select nombre from comic where nombre='" + xNombre + "'";
        if (miConexion != null) {
            try {
                Statement instruccion = miConexion.createStatement();
                ResultSet tabla = instruccion.executeQuery(sql);
                while (tabla.next() && !b) {
                    b = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(ComicDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return b;
    }
    /**
     * metodo que permite eliminar un comic
     */
    public void eliminarComic(String nombre) {
        try {
            Connection miConexion = fachada.GetConnection();
            Statement s = (Statement) miConexion.createStatement();
            s.execute("DELETE FROM comic WHERE nombre ='" + nombre + "'");
        } catch (SQLException ex) {
            Logger.getLogger(ComicDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * metodo que permite modificar un comic
     */
    public void modificarComic(String comicAmodificar, Comic c, String r) {

        try {
            String sql = "UPDATE comic SET nombre ='" + c.getNombre() + "'" + ", imagen ='" + c.getImagen() + "'" + ", publicacion = '" + c.getAnioPublicacion() + "'" + ", restauracion = '" + r + "'" + "WHERE nombre='" + comicAmodificar + "'";
            Connection miConexion = fachada.GetConnection();
            if (miConexion != null) {
                Statement instruccion = (Statement) miConexion.createStatement();
                instruccion.executeUpdate(sql);
                miConexion.close();
                instruccion.close();
            }
            fachada.desconectar(miConexion);
        } catch (SQLException ex) {
            Logger.getLogger(ComicDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
