<%@include file="template/header.jsp" %>
<%@include file="template/menu.jsp" %>
    <body>
    <div class="row">
    <div class="col s4 offset-s4 z-depth-3">
        <h2> Registro</h2>
        <form action="control.do" method="POST">
            <label> Rut</label>
            <input type="text" name="rut"/>
            <br>
            <label> Nombre</label>
            <input type="text" name="nombre"/>
            <br>
            <label> Mail</label>
            <input type="text" name="mail"/>
            <br>
            <label> Clave</label>
            <input type="password" name="clav1"/>
            <br>
            <label> Confirmar</label>
            <input type="password" name="clave2"/>
            <br><br>
            <button class="btn" type="submit" name="boton" value="registro">
                Aceptar
            </button>
            <br>
            <a href="index.jsp">Volver</a>
        </form>
    </div>
    </div>
<%@include file="template/footer.jsp" %>
