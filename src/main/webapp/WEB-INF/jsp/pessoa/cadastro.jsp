<%-- 
    Document   : cadastro
    Created on : 25/03/2015, 19:32:44
    Author     : Orlando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro</h1>
        <form method="post" action="cadastro">
            <label>Nome:</label>
            <input type="text" name="pessoa.nome"/><br/>
            <label>Endereço:</label>
            <input type="text" name="pessoa.enderecos[].logradouro"/><br/>
            <label>Número:</label>
            <input type="text" name="pessoa.enderecos[].numero"/>
            <button type="submit">Cadastrar</button>
            <button type="reset">Limpar</button>
        </form>
    </body>
</html>
