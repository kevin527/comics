package com.comicsLand.mundo;

import java.util.ArrayList;

public class Tienda
//-----------------------
//Atributos
//-----------------------

{
	private ArrayList compras;
        private ArrayList ventas;
        private ArrayList clientes;
        private ArrayList comics;
        private Sesion sesion;
        
//-----------------------
//Metodos
//-----------------------
        /*
        *metodo para agregar un comic
        */
    public void agregarComic(String nombre, String imagen, int anio_publicacion)
	{

	}
	 /*
        *metodo para modificar un comic
        */
	public void modificarComic(String nuevoNombre, String nuevaImagen, int nuevoAnioPubl)
	{
		
	}
         /*
        *metodo para eliminar un comic
        */
	
	public void eliminarComic(String nombre)
	{
		
	}
         /*
        *metodo para buscar un comic
        */
	public void buscarComic(String nombre)
	{
		
	}
	 /*
        *metodo para agregar una editorial
        */
	public void agregarEditorial(String nombre, String editorial)
	{
		
	}
	 /*
        *metodo para modificar una editorial
        */
	public void modificarEditorial(String nuevoNombre, String nuevaEditorial)
	{
		
	}
	 /*
        *metodo para eliminar una editorial
        */
	public Comic eliminarEditorial (Comic mcomic)
	{
		return null;
	}
	 /*
        *metodo para agregar un pais
        */
	public void agregarPais(String nombre)
	{
		
	}
	 /*
        *metodo para modificar un pais
        */
	public void modificarPais(String nuevoNombre)
	{
		
	}
	 /*
        *metodo para eliminar un pais
        */
	public Comic eliminarPais(Comic comic)
	{
		return null;
	}
	 /*
        *metodo para agregar un cliente
        */
	public void agregarCliente(String identificacion, String nombres, String apellidos, String email, String telefono)
	{
		
	}
	 /*
        *metodo para modificar un cliente
        */
	public void modificarCliente(String nuevaIdentificacion, String nuevosNombres, String nuevosApellidos, String nuevoEmail, String nuevoTelefono)
	{
		
	}
	 /*
        *metodo para eliminar un cliente
        */
	public void eliminarCliente(String identificacion)
	{
		
	}
	 /*
        *metodo para buscar un cliente
        */
	public Cliente buscarCliente(Cliente miCliente)
	{
		return null;
	}
	 /*
        *metodo para iniciar sesio en la tienda web
        */
	public void iniciarSesion(String nombre_usuario, String contrasenia)
	{
		
	}
	 /*
        *metodo para cambiar la contraseña de usuario 
        */
	public void cambiarContrasenia(String nuevaContrasenia)
	{
		
	}
	 /*
        *metodo para cambiar el nombre de usuario 
        */
	public void cambiarNombreUsuario(String nuevoNombre)
	{
		
	}
	 /*
        *metodo para cerrar la sesion 
        */
	public void cerrarSesion()
	{
		
	}
	
	
	 /*
        *metodo para comprar un comic 
        */
	public void comprarComic()
	{
		
	}
	 /*
        *metodo para vender comics
        */
	public void venderComic()
	{
		
	}
	 /*
        *metodo para consultar las compras realizadas
        */
	public void consultarCompras()
	{
		
	}
	 /*
        *metodo para consultar las ventas realizadas
        */
	public ArrayList consultarVentas()
	{
		return null;
	}

}