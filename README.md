# Introdução à API Java Simples com Spring e Banco de Dados

Este é um projeto simples que demonstra os conceitos básicos de construção de uma API Java usando o framework Spring e interagindo com um banco de dados relacional. O projeto inclui três entidades: Departamento, Benefício e Funcionário, que são usadas para mostrar as operações básicas CRUD (Create, Read, Update) que podem ser realizadas através dos endpoints da API. Como o foco é a construção das entidades relacionamento, optamos por deixar o delete de fora.

## Tecnologias utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* Banco de Dados PostgreSQL

## Como começar
Para executar este projeto em sua máquina local, siga as etapas abaixo:

1. Clone este repositório em sua máquina local: https://github.com/Wastiel/spring-database-intro-api.git
2. Abra o IntelliJ IDEA e importe o projeto
3. Crie um banco de dados no Postgres com o nome "tabelas". Você pode criar um novo banco de dados usando a ferramenta DBeaver:
4. Configure o arquivo "application.properties" para usar o banco de dados Postgres.
5. Execute o projeto. O Spring Boot criará automaticamente as tabelas e relacionamentos no banco de dados.
6. Você pode usar a ferramenta DBeaver para visualizar as tabelas criadas e os dados inseridos. Para fazer isso, abra a conexão criada no passo 3 e navegue até o banco de dados "tabelas"

## Vizualisando o modelo ER

No Dbeaver 22.3, é possível visualizar o modelo Entidade-Relacionamento (ER) seguindo os passos abaixo:

1. Abra o banco de tabelas e vá até o diretório "Tabelas".
2. Clique com o botão direito do mouse em "Tabelas" e selecione "Visualizar Diagramas".
3. O modelo ER será exibido na tela.

![Modelo ER da API](img/modelo_er.PNG?raw=true)

## Endpoints

A API expõe os seguintes endpoints:
 
* Beneficio
  - GET /beneficio/{id} retorna um beneificio especifico por ID
  - GET /beneficio Retorna uma lista de todos os beneficios
  - POST /beneficio - Cria um novo beneficio.
  - PUT /beneficio - Atualiza um beneficio recebendo um objeto beneficio
* Departamento
  - GET /departamento/{id} retorna um departamento especifico por ID
  - GET /departamento Retorna uma lista de todos os departamento
  - POST /departamento - Cria um novo departamento.
  - PUT /departamento - Atualiza um departamento recebendo um objeto departamento
* Funcionario
  - GET /funcionario/{id} retorna um funcionario especifico por ID
  - GET /funcionario Retorna uma lista de todos os funcionarios
  - POST /funcionario - Cria um novo funcionario.
  - PUT /funcionario - Atualiza um funcionario recebendo um objeto funcionario

Cada endpoint retorna um objeto JSON representando o departamento, benefício ou funcionário manipulado.

## Conclusão
Este projeto serve como uma introdução básica à construção de uma API Java com Spring e interação com um banco de dados relacional. Ele demonstra como realizar operações CRUD usando endpoints da API e fornece uma base para a construção de APIs mais complexas.

--------------------------------------------------

# Introduction to Simple Java API with Spring and Database - English Version

This is a simple project that demonstrates the basic concepts of building a Java API using the Spring framework and interacting with a relational database. The project includes three entities: Department, Benefit, and Employee, which are used to show the basic CRUD (Create, Read, Update) operations that can be performed through the API endpoints. As the focus is on building the entity relationships, we chose to leave out the delete operation.

## Technologies used

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database

## Getting Started

To run this project on your local machine, follow the steps below:

1. Clone this repository to your local machine: https://github.com/Wastiel/spring-database-intro-api.git
2. Open IntelliJ IDEA and import the project
3. Create a Postgres database with the name "tabelas". You can create a new database using the DBeaver tool:
4. Configure the "application.properties" file to use the Postgres database.
5. Run the project. Spring Boot will automatically create tables and relationships in the database.
6. You can use the DBeaver tool to view the created tables and inserted data. To do this, open the connection created in step 3 and navigate to the "tabelas" database.

## Viewing the ER model
In Dbeaver 22.3, you can view the Entity-Relationship (ER) model by following the steps below:

1. Open the tables database and go to the "Tables" directory.
2. Right-click on "Tables" and select "View Diagrams".
3. The ER model will be displayed on the screen.

![API ER model](img/modelo_er.PNG?raw=true)

## Endpoints

The API exposes the following endpoints:

* Benefit (Beneficio)
  - GET /beneficio/{id} returns a specific benefit by ID
  - GET /beneficio Returns a list of all benefits
  - POST /beneficio - Creates a new benefit.
  - PUT /beneficio - Updates a benefit by receiving a benefit object
* Department (Departamento)
  - GET /departamento/{id} returns a specific department by ID
  - GET /departamento Returns a list of all departments
  - POST /departamento - Creates a new department.
  - PUT /departamento - Updates a department by receiving a department object
* Employee (Funcionario)
  GET /funcionario/{id} returns a specific employee by ID
  GET /funcionario Returns a list of all employees
  POST /funcionario - Creates a new employee.
  PUT /funcionario - Updates an employee by receiving an employee object
  Each endpoint returns a JSON object representing the manipulated department, benefit, or employee.

## Conclusion
This project serves as a basic introduction to building a Java API with Spring and interacting with a relational database. It demonstrates how to perform CRUD operations using API endpoints and provides a foundation for building more complex APIs.
