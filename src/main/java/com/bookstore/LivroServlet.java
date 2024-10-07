package com.bookstore;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet responsável por processar o cadastro de livros.
 */
@WebServlet("/cadastroLivro")
public class LivroServlet extends HttpServlet {

    /**
     * Processa a requisição POST para cadastro de um novo livro.
     *
     * @param request  A requisição HTTP do cliente
     * @param response A resposta HTTP para o cliente
     * @throws ServletException Em caso de erro na lógica do servlet
     * @throws IOException      Em caso de erro de entrada/saída
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtenção dos parâmetros do formulário
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String editora = request.getParameter("editora");
        String anoStr = request.getParameter("ano");

        // Validação dos parâmetros
        if (titulo == null || titulo.trim().isEmpty() ||
                autor == null || autor.trim().isEmpty() ||
                editora == null || editora.trim().isEmpty() ||
                anoStr == null || anoStr.trim().isEmpty()) {

            // Redireciona para uma página de erro se algum campo estiver vazio
            request.setAttribute("mensagemErro", "Todos os campos são obrigatórios.");
            request.getRequestDispatcher("erroCadastro.jsp").forward(request, response);
            return; // Impede a continuidade se houver erro
        }

        // Conversão do ano para inteiro
        int ano;
        try {
            ano = Integer.parseInt(anoStr);
        } catch (NumberFormatException e) {
            // Redireciona para uma página de erro se o ano não for um número válido
            request.setAttribute("mensagemErro", "O ano de publicação deve ser um número válido.");
            request.getRequestDispatcher("erroCadastro.jsp").forward(request, response);
            return;
        }

        // Criação de um novo Livro
        try {
            Livro livro = new Livro(titulo, autor, editora, ano);

            // Atribui o objeto Livro à requisição para ser acessado no JSP
            request.setAttribute("livro", livro);

            // Redireciona para a página de sucesso
            request.getRequestDispatcher("cadastroSucesso.jsp").forward(request, response);
        } catch (Exception e) {
            // Em caso de erro inesperado, redireciona para uma página de erro genérico
            request.setAttribute("mensagemErro", "Erro ao cadastrar o livro. Tente novamente.");
            request.getRequestDispatcher("erroCadastro.jsp").forward(request, response);
        }
    }
}
