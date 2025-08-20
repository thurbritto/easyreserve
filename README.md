# EasyReserve 🪑

Sistema de reservas de mesas para restaurantes, desenvolvido com Java e Spring Boot.  
Este sistema permite o gerenciamento de usuários e reservas, com foco em usabilidade, segurança e escalabilidade.

---

## 🚀 Funcionalidades

- Cadastro de usuários com validações
- Atribuição automática de perfil (Client/Admin)
- Criptografia de senhas com PasswordEncoder
- Verificação de e-mail já existente
- Camadas bem definidas: Controller, Service, Repository, Mapper e DTO
- Tratamento global de exceções

---

## 🔧 Tecnologias utilizadas

- Java 17
- Spring Boot 3
- Spring Security
- Spring Data JPA
- MySQL
- Jakarta Validation
- Lombok
- Maven

---

## 🏁 Como rodar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/easyreserve.git
   cd easyreserve

2. Configure o banco de dados MySQL no arquivo application.properties:
    ```ini
    spring.datasource.url=jdbc:mysql://localhost:3306/easyreserve
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha

3. Rode o projeto:
    ```bash
   ./mvnw spring-boot:run
   
4. Acesse a API em: ``http://localhost:8080/users``

## 📁 Estrutura do Projeto
    src
    └── main
        └── java
            └── com.easyreserve.reserve
                ├── controller
                ├── service
                ├── repository
                ├── model
                ├── dto
                ├── mapper
                ├── exception
                └── config
