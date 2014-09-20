<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin t&iacute;tulo</title>
</head>

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
