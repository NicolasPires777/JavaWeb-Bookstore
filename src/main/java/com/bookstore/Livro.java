package com.bookstore;

import java.util.Objects;

/**
 * Classe que representa um Livro na aplicação.
 */
public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int ano;

    /**
     * Construtor para criar um novo Livro.
     *
     * @param titulo Título do livro
     * @param autor  Autor do livro
     * @param editora Editora do livro
     * @param ano    Ano de publicação do livro
     */
    public Livro(String titulo, String autor, String editora, int ano) {
        setTitulo(titulo);
        setAutor(autor);
        setEditora(editora);
        setAno(ano);
    }

    // Getters e Setters com validação

    /**
     * Retorna o título do livro.
     *
     * @return Título do livro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do livro, não pode ser nulo ou vazio.
     *
     * @param titulo Título do livro
     */
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título do livro não pode ser vazio.");
        }
        this.titulo = titulo;
    }

    /**
     * Retorna o autor do livro.
     *
     * @return Autor do livro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Define o autor do livro, não pode ser nulo ou vazio.
     *
     * @param autor Autor do livro
     */
    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("O autor do livro não pode ser vazio.");
        }
        this.autor = autor;
    }

    /**
     * Retorna a editora do livro.
     *
     * @return Editora do livro
     */
    public String getEditora() {
        return editora;
    }

    /**
     * Define a editora do livro, não pode ser nula ou vazia.
     *
     * @param editora Editora do livro
     */
    public void setEditora(String editora) {
        if (editora == null || editora.trim().isEmpty()) {
            throw new IllegalArgumentException("A editora não pode ser vazia.");
        }
        this.editora = editora;
    }

    /**
     * Retorna o ano de publicação do livro.
     *
     * @return Ano de publicação do livro
     */
    public int getAno() {
        return ano;
    }

    /**
     * Define o ano de publicação do livro. O ano deve ser maior que zero.
     *
     * @param ano Ano de publicação do livro
     */
    public void setAno(int ano) {
        if (ano <= 0) {
            throw new IllegalArgumentException("O ano de publicação deve ser maior que zero.");
        }
        this.ano = ano;
    }

    /**
     * Retorna a representação textual do livro.
     *
     * @return String com os dados do livro
     */
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", ano=" + ano +
                '}';
    }

    /**
     * Compara dois objetos Livro para verificar se são iguais.
     *
     * @param o Objeto a ser comparado
     * @return true se os livros forem iguais, caso contrário false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return ano == livro.ano &&
                Objects.equals(titulo, livro.titulo) &&
                Objects.equals(autor, livro.autor) &&
                Objects.equals(editora, livro.editora);
    }

    /**
     * Gera um código hash para o livro, com base no título, autor, editora e ano.
     *
     * @return Código hash do livro
     */
    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, editora, ano);
    }
}
