# Projeto: Cadastro de Usuários com Spring Data JPA e PostgreSQL

Este projeto demonstra como realizar o cadastro simples de usuários utilizando Spring Boot, Spring Data JPA e banco de dados PostgreSQL.

## Tecnologias Utilizadas
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL

## Estrutura do Projeto
- `model/User.java`: Classe de modelo que representa o usuário, com atributos como id, nome, login e senha.
- `repository/UserRepository.java`: Interface responsável pelas operações de acesso a dados (CRUD) dos usuários.
- `StartApp.java`: Classe para inicialização e execução de exemplos de operações com usuários.
- `application.properties`: Configurações de conexão com o banco de dados PostgreSQL.

## Como Executar
1. Configure o banco de dados PostgreSQL e atualize as credenciais em `src/main/resources/application.properties`.
2. Execute o projeto com o comando:
   ```shell
   ./mvnw spring-boot:run
    ```