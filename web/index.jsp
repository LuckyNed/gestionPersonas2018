<%@include file="template/header.jsp" %>
    <div class="row">
    <div class="col s4 offset-s4 z-depth-3">
        <h2> Inicio Sesión </h2>
        <form action="control.do" method="POST">
            <label> Rut</label>
            <input type="text" name="rut"/>
            <br>
            <label> Clave</label>
            <input type="text" name="clave"/>
            <br><br>
            <button class="btn" type="submit" name="boton" value="login">
                Aceptar
            </button>
            <br>
            <a href="registro.jsp">Si no tienes cuenta regístrate aquí</a>
        </form>
    </div>
    </div>
        <p class="red-text">${requestScope.msg}</p>
<%@include file="template/footer.jsp" %>