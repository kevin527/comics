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
     * ciclo que permite hacer las operaciones crud para la tabla comic
     * agregar:parametros=nombre, imagen, publicacion, restauracion
     * eliminar:parametros=nombre
     * buscar:parametros=nombre
     * modificar:parametros=nombre
     */
    
    /**
     * ciclo para agregar comic
     */
    ComicDao comicDao = new ComicDao();
    if(request.getParameter("agregar") != null)
    {
        boolean existe = comicDao.buscarComic(request.getParameter("nombre"));
        
        if(existe)
        {
           out.println("<h2> EL comic ya existe..</h2>");
        }
        else{
            Comic c = new Comic(request.getParameter("nombre"), request.getParameter("img"), 
                    request.getParameter("publicacion"));
            String f = request.getParameter("restauracion");            
            comicDao.crearComic(c, f);
        }
    }
    /**
     * ciclo para eliminar comic
     */
    else if(request.getParameter("eliminar") != null)
    {
         boolean existe = comicDao.buscarComic(request.getParameter("eliminar2"));
        
        if(!existe)
        {
           out.println("<h2> EL comic a eliminar no existe..</h2>");
        }
        else{
            comicDao.eliminarComic(request.getParameter("eliminar2"));
        }
    }
    /**
     * ciclo para modificar comic
     */
    else if(request.getParameter("modificar") != null)
    {
         boolean existe = comicDao.buscarComic(request.getParameter("nombreAnterior"));
        
        if(!existe)
        {
           out.println("<h2> EL comic a modificar no existe..</h2>");
        }
        else{
            Comic c = new Comic(request.getParameter("nuevoNombre"), request.getParameter("nuevaImg"), 
                    request.getParameter("nuevaPublicacion"));
            String f = request.getParameter("nuevaRestauracion"); 
            comicDao.modificarComic(request.getParameter("nombreAnterior"), c, f);
        }
    }
%>
<body>
<form id="form1" name="form1" method="post" action="">
  NOMBRE: 
  <label>
  <input type="text" name="nombre" id="nombre" />
  </label>
  <p>IMAGEN: 
    <label>
    <input type="file" name="img" id="img" value="Enviar" />
    </label>
  </p>
  <p>FECHA PUBLICACION: 
    <label>
    <input type="date" name="publicacion" id="publicacion" />
    </label>
  </p>
  <p>FECHA RESTAURACION: 
    <label>
    <input type="date" name="restauracion" id="restauracion" />
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
    ingrese el comic a eliminar </p>
  <p>
	  
    <label></label>
  </p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
</form>
<form id="form2" name="form2" method="post" action="">
  <p>NOMBRE (COMIC A MODIFICAR):
  	  <label>
  	  <input type="text" name="nombreAnterior" id="nombreAnterior" />
  	  </label>
  </p>	
    <p>NUEVO NOMBRE:
  	  <label>
  	  <input type="text" name="nuevoNombre" id="nuevoNombre" />
  	  </label>
  </p>
  	<p>NUEVA IMAGEN:
  	  <label></label>
  	  <label>
  	  <input type="file" name="nuevaImg" id="nuevaImg" value="Enviar" />
  	  </label>
  	</p>
  	<p>NUEVA FECHA PUBLICACION:
  	  <label>
  	  <input type="date" name="nuevaPublicacion" id="nuevaPublicacion" />
  	  </label>
  	</p>
  	<p>NUEVA FECHA RESTAURACION: 
  	  <label>
  	  <input type="date" name="nuevaRestauracion" id="nuevaRestauracion" />
  	  </label>
  	</p>
  	<p>
  	  <input type="submit" name="modificar" id="modificar" value="modificar" />
  	</p>
</form>
</body>
</html>
