<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="assets/css/nequi_login.css">
    <link rel="stylesheet" href="">
    <title>Login_dp</title>
  </head>

  <body>
    <!-- Contenidos de el header -->
    <div class="contenedor">
      <div class="header">
        <!-- Servlet para una imagen que redirige a la vita principal -->
        <div id="img"><a href="bolsillo?accion=index">
            <img
              src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAC4AAAA8CAYAAAAZp4inAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAARpSURBVHgBzZq9cttGEMf3DkxCJQ0940ijJAXTURpZhqgUKakniFSmEvUEsZ9AyhNE6ZJK1hPIZVKJ7JKZmOJItIWoCdLYtKyCla0ZE7fePZgcmgRNgPg4/AoBIHDUYvnH3u4eBBimbNul4i2UpITS60/BddvtXphxAgxQWbNrQhR+EKDqCFAaO+0KEA2F3rHTaTemfUemhldsuyw86wgAa+FGiAZa3p7TbrvjZyRkRGV9c1d68iy80QzWBI1Zube5PX4mdY+zhheU3AeEBxALsXN58eTx8AhSZNW2bfTkCe2WIT49tNTGQDapSWVlffMn8OQpJGM0U/KfD5/EPc7S+Jz+AQJuQwogyi2n808jUY+zNBboYUrLaIZCqP7uxAxnaaCOGolJIxgBu/4mJjpqeNZJtDAXjzeWuhPL4zwDLkSOzfEp0oM6t+GV9eq+EIlGjdBIjjAQkejTdvKwVApRBrA0aNo+oahRAlMIP4MMLZWV9eovLI2AbC5TEKHB25ke19LoU9RAtCEPoDzmzUc9PszoRE6MBmjyrMk7Uz3O0iAvP0DIB0JAT0lVHxwHGr56v3qECuqQI/oo9q5GCooJqbCn82Q0e9qjXPxqJBdnPvC4TkVJHpAXhGgr6e1cBZRuwwmIo4fUmZ3ZcDcE4dfLTmuqE4cel561b3RieQ9LQ+u586E0Jq7jP/40Lv8D8zSpPKsHVfXj+B73ZA1MM0Ma42jDqQGzyyONQLkHKrk3mFjCIv2xxmbGJkq1FdVopsD6Rs9AJFHw8PJp6xDmJFJamwgDaTyN7uVRMmvBDUHhQqHvQkyyN9zvB55W1r6rQQwkx0wK5qF60glSFkKdrlLdCnOiPY4g2mAAqmYOKD864wABEfENR2yCKaiy0tKhoiXKMG24V1CPwSxlgfgoinSG2SE1z09NthxGcClf2ZqVrwyjCqL4GfIBJ3xns6RjDXZurp+7Xy4u36Hf4HswT5GksL209HXpi68W/+51u7fjF0x0slbpKce8tCJ8AqUzMQFxqcTTMuSHso46YyFzwnC+M87YhDAT26egjeeW9uADK+iqm2639+rli9/vLi6T/VCDfFD6DK3iq+vnf/LBzG5t5V61Tsbzcl8ZcgDp/VtWxcwky7loPcqTdGRf1vU2zMV8h8/On2xQbmE81uO8a0CcjgqpjkxKZ641IK4PWTp0z8bym+I8SymjVNaqB/rBzRh+QGMvF+pmkqJFrAylE3u5kBlMWNS+O4Zs6EVaA/oYbLxzcVZXAh5C6vhFT6LF8r/nrUPWX5q5Dgr9GknwlB8HThe+WV469pRYSDxFJoc456093k3ccKZL+fPN9Ys/7i4t/08/aQ10BIsPotzhuoH3U+2rcLqgLLWRhHQEzdqjPcbM3oKLE/PZ6Ged1sHoZ6lIJQiSToOlQ8ZzdRWqyfp+4epHp9P6beIcGIBTZdIor6Hen3JJk5e+bwvqcNqbn0YMH6DLsX6hLIUq8zF11Hr49pO24/zlzhr7Dvwg13oxQB7sAAAAAElFTkSuQmCC' hidden/>
          </a>
        </div>
        <h3><a href="nequi?accion=index">HOME</a> </h3>
        <h1>NEQUI</h1>
      </div>
      <div class="centro">
        <!--contednidos de el centro -->
        <h3>INICIA SESION </h3>
        <!-- fondo de el formulario -->
        <div id='daviplata_login' class='daviplata_login'>
          <div id='rectangle8' class='rectangle8'></div>


          <div class="formulario_login">
          
            <form action="usuario"method="post">
              <label for="NombreUsuario">Nombre:</label>
              <input type="text" id="NombreUsuario" name="NombreUsuario" required>
              <label for="N_documento">Numero de documento:</label>
              <input type="text" id="N_documento" name="N_documento" required>
              <label for="ConstrasenaUsuario">Contraseña:</label>
              <input type="password" id="contrasena" name="ConstrasenaUsuario" required>
              <button type="submit" name="accion" value="inicio_nq" >Ingresar</button>
            </form>
          </div>
        </div>
      </div>
    </div>

  </body>

  </html>