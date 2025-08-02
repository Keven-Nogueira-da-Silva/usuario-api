# 🧾 API de Cadastro de Usuários com Spring Boot

Este projeto é uma API REST desenvolvida com **Spring Boot** que permite o cadastro, listagem e gerenciamento de usuários. A aplicação segue boas práticas de arquitetura, utilizando camadas bem definidas (Controller, Repository, Model) e validações básicas. É ideal para quem está começando com Spring Boot e deseja entender como construir um CRUD simples e funcional.

---

## 📚 Sumário

- [🛠️ Tecnologias](#️-tecnologias)
- [📦 Funcionalidades](#-funcionalidades)
- [🚀 Como executar](#-como-executar)
- [📬 Testes com Postman](#-testes-com-postman)
- [📁 Estrutura de Pastas](#-estrutura-de-pastas)
- [📄 Licença](#-licença)

---

## 🛠️ Tecnologias

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database (banco em memória)
- Maven
- Postman

---

## 📦 Funcionalidades

- ✅ Cadastro de usuários (`POST /usuarios`)
- ✅ Listagem de todos os usuários (`GET /usuarios`)
- ✅ Validação de campos obrigatórios
- ✅ Verificação de e-mails duplicados
- ✅ Tratamento de erros com mensagens claras
- ✅ Integração com H2 Database para testes rápidos

---

## 🚀 Como executar

1. Clone o repositório:

```bash
git clone https://github.com/Keven-Nogueira-da-Silva/SpringUser.git
Acesse o projeto na sua IDE (IntelliJ, VS Code, Eclipse etc.)

Execute a aplicação com o comando:

bash
Copiar
Editar
./mvnw spring-boot:run
Ou rode pela IDE clicando em Run Application.

Acesse a interface do banco H2 (opcional):

http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb

User: sa

Password: (deixe em branco)

📬 Testes com Postman
▶️ POST /usuarios — Criar um usuário
URL: http://localhost:8080/usuarios
Método: POST
Headers:

Content-Type: application/json
Body (raw JSON):
{
  "nome": "Keven Nogueira",
  "email": "keven@email.com",
  "idade": 25
}
📥 GET /usuarios — Listar todos os usuários
URL: http://localhost:8080/usuarios
Método: GET

📁 Estrutura de Pastas
css
src/
├── main/
│   ├── java/
│   │   └── com.keven.usuario_api.usuario/
│   │       ├── Model.java
│   │       ├── UsuarioController.java
│   │       ├── UsuarioRepository.java
│   │       └── UsuarioService.java (se criado)
│   └── resources/
│       └── application.properties
└── test/
📄 Licença
Este projeto está sob a licença MIT.
Feito com ❤️ por Keven Nogueira da Silva

