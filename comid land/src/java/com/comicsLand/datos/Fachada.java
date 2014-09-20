package com.comicsLand.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        GetConnection();
    }

    public Connection GetConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            servidor = "jdbc:mysql://localhost/tienda";
            usuario = "root";
            password = "mysql";
            conexion = DriverManager.getConnection(servidor, usuario, password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fachada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Fachada.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }

    public void desconectar(Connection c) throws SQLException {
        c.close();
    }
}
