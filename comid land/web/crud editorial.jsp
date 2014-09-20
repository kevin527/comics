<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="com.comicsLand.mundo.*"%>
<%@page import="com.comicsLand.datos.*"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin t&iacute;tulo</title>
</head>
<%
      /**
     * ciclo que permite hacer las operaciones crud para la tabla editorial
     * agregar:parametros=nombre, estado
     * eliminar:parametros=nombre
     * buscar:parametros=nombre
     * modificar:parametros=nombre
     */
    
    /**
     * ciclo para agregar editorial
     */ 
    EditorialDao editorialDao = new EditorialDao();
    if(request.getParameter("agregar") != null)
    {
         boolean existe = editorialDao.buscarEditorial(request.getParameter("nombre"));
         
         if(existe)
        {
           out.println("<h2> La editorial ya existe..</h2>");
        }
        else{
            Editorial ed = new Editorial(request.getParameter("nombre"), request.getParameter("estado"));
            editorialDao.crearEditorial(ed);
        }   
 
    }
     /**
     * ciclo para eliminar editorial
     */
     else if(request.getParameter("eliminar") != null)
    {       
         boolean existe = editorialDao.buscarEditorial(request.getParameter("eliminar2"));         
        
        if(!existe)
        {
           out.println("<h2> La editorial a eliminar no existe..</h2>");
        }
        else{
            editorialDao.eliminarEditorial(request.getParameter("eliminar2"));
        }
    }
     
      /**
     * ciclo para modificar editorial
     */
   else if(request.getParameter("modificar") != null)
    {
         boolean existe = editorialDao.buscarEditorial(request.getParameter("nombreAnterior"));
        
        if(!existe)
        {
           out.println("<h2> La editorial a modificar no existe..</h2>");
        }
        else{
            Editorial e = new Editorial(request.getParameter("nuevoNombre"), request.getParameter("nuevoEstado"));
           //String pais = request.getParameter("nuevoPais");
           editorialDao.modificarEditorial(request.getParameter("nombreAnterior"), e);
                   
                   }
    }
    %>
<body>
<form id="form1" name="form1" method="post" action="">
  NOMBRE: 
  <label>
  <input type="text" name="nombre" id="nombre" />
  </label>
  <p>ESTADO: 
    <label>
    <select name="estado" id="estado">
      <option value="0">activa</option>
      <option value="1">inactiva</option>
    </select>
    </label>
  </p>
  <p>PAIS: 
    <label>
    <input type="text" name="pais" id="pais" />
    </label>
  </p>
  <p>
    <input type="submit" name="agregar" id="agregar" value="agregar" />
  </p>
  <p>
    <label></label>
    <label></label>
    <label>
    <input type="submit" name="eliminar" id="eliminar" value="eliminar" />
    </label>
    <label>
    <input type="text" name="eliminar2" id="eliminar2" />
    </label>
    ingrese la editorial a eliminar </p>
  <p>
	  
    <label></label>
  </p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
</form>
<form id="form2" name="form2" method="post" action="">
     <p>NOMBRE (EDITORIAL A MODIFICAR):
  	  <label>
  	  <input type="text" name="nombreAnterior" id="nombreAnterior" />
  	  </label>
  </p>	
  	<p>NUEVO NOMBRE:
  	  <label>
  	  <input type="text" name="nuevoNombre" id="nuevoNombre" />
  	  </label>
  </p>
  	<p>
  	  <label></label>
  	NUEVO ESTADO: 
    <label>
    <select name="nuevoEstado" id="nuevoEstado">
      <option value="0">activa</option>
      <option value="1">inactiva</option>
    </select>
    </label>
</p>
  	<p>NUEVO PAIS:
  	  <label>
        <input type="text" name="nuevoPais" id="nuevoPais" />
        </label>
    </p>
  	<p>
  	  <input type="submit" name="modificar" id="modificar" value="modificar" />
  	</p>
</form>
</body>
</html>