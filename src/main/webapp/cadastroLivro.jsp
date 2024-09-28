<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Livro</title>
    <link rel="stylesheet" href="styleTest.css">
</head>

<body>

<h1>Cadastro de Livro</h1>

<!-- Área para exibir mensagens ao usuário -->
<div class="message">
    <!-- Exibe mensagem de sucesso ou erro se houver -->
    <c:if test="${not empty mensagemErro}">
        <div class="error">${mensagemErro}</div>
    </c:if>
    <c:if test="${not empty mensagemSucesso}">
        <div class="success">${mensagemSucesso}</div>
    </c:if>
</div>

<form action="cadastroLivro" method="post">
    <label for="titulo">Título:</label>
    <input type="text" id="titulo" name="titulo" required><br>

    <label for="autor">Autor:</label>
    <input type="text" id="autor" name="autor" required><br>

    <label for="editora">Editora:</label>
    <input type="text" id="editora" name="editora" required><br>

    <label for="ano">Ano de Publicação:</label>
    <input type="number" id="ano" name="ano" min="0" required><br>

    <input type="submit" value="Cadastrar">
</form>

</body>
</html>
