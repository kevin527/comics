package com.comicsLand.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author David Q.
 */
public class Fachada {

    private Connection conexion;
    private String servidor;
    private String usuario;
    private String password;

    public Fachada() {
        conexion = null;
        usuario = "";
        servidor = "";
        password = "";
    }

    public Connection GetConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        servidor = "jdbc:mysql://localhost/tiendac";
        usuario = "root";
        password = "";
        conexion = DriverManager.getConnection(servidor, usuario, password);
        return conexion;
    }

    public void desconectar() throws SQLException {
        conexion.close();
    }
}
