<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Livro Cadastrado</title>
    <link rel="stylesheet" href="styleTest.css">
</head>
<body>

<h1>Cadastro realizado com sucesso!</h1>

<div class="message">
    <p><strong>Título:</strong> ${livro.titulo}</p>
    <p><strong>Autor:</strong> ${livro.autor}</p>
    <p><strong>Editora:</strong> ${livro.editora}</p>
    <p><strong>Ano de Publicação:</strong> ${livro.ano}</p>
</div>

<!-- Opções de navegação -->
<a href="cadastroLivro.jsp">Cadastrar outro livro</a> |
<a href="listarLivros">Ver todos os livros</a>

</body>
</html>
