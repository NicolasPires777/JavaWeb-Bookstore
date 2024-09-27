# Projeto Bookstore

Este projeto é um sistema simples de cadastro de livros usando Java Web com Servlets, JSP, e Tomcat.

## Requisitos

- **Java 21** ou superior (certifique-se de que o `JAVA_HOME` está configurado corretamente)
- **Apache Tomcat 9**
- **Eclipse IDE** (ou outra IDE de sua preferência)

## Configuração do Ambiente

1. **Instalar Java 21**:
   - Verifique se o Java está instalado rodando o comando:
     ```bash
     java -version
     ```
   - Caso não esteja, instale o OpenJDK 21 (ou a versão compatível da sua preferência).

2. **Configurar Tomcat no Eclipse**:
   - Baixe o [Apache Tomcat 9.x](https://tomcat.apache.org/download-90.cgi).
   - No Eclipse, vá em `Window` -> `Preferences` -> `Server` -> `Runtime Environments`.
   - Adicione um novo servidor Tomcat apontando para o diretório de instalação.

3. **Clonar o repositório**:
   - Clone este repositório em sua máquina:
     ```bash
     git clone <URL-do-repositorio>
     ```

4. **Importar o projeto no Eclipse**:
   - No Eclipse, vá em `File` -> `Open Project from a File System`.
   - Selecione o diretório onde o projeto foi clonado.

5. **Configuração do Tomcat**:
   - No Eclipse, clique com o botão direito no projeto, vá em `Run As` -> `Run on Server`.
   - Escolha o Tomcat como servidor de execução.

## Rodando o Projeto

1. **Executar o servidor**:
   - No Eclipse, vá em `Servers` e inicie o servidor Tomcat configurado.
   - O projeto será automaticamente publicado e estará disponível em:
     ```
     http://localhost:8080/Bookstore/cadastroLivro.jsp
     ```

2
