/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comicsLand.datos;

/**
 * @author David Q.
 */
public class ClienteDao {

    /**
     * atributo fachada para establecer la conexion a la BD
     */
    private Fachada fachada;

    /**
     * Constructor de la clase
     */
    public ClienteDao() {
        fachada = new Fachada();
    }
}
