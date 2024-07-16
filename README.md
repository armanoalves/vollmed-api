# API da aplicação Voll.med

Projeto de desenvolvimento de uma API de agendamento de consultas, utilizando de Spring Boot e suas bibliotecas para a construção de uma API Rest, que segue os padrões de segurança.

## Aprendizados

### Aula 01

- Criar um projeto Spring Boot utilizando o site do Spring Initializr;

- Importar o projeto no IntelliJ e executar uma aplicação Spring Boot pela classe contendo o método `main`;

- Criar uma classe Controller e mapear uma URL nela utilizando as anotações `@RestController` e `@RequestMapping`;

- Realizar uma requisição de teste no browser acessando a URL mapeada no Controller.

### Aula 02

- Mapear requisições POST em uma classe Controller;

- Enviar requisições POST para a API utilizando o Insomnia;

- Enviar dados para API no formato JSON;

- Utilizar a anotação `@RequestBody` para receber os dados do corpo da requisição em um parâmetro no Controller;

- Utilizar o padrão DTO (Data Transfer Object), via Java Records, para representar os dados recebidos em uma requisição POST.

### Aula 03

- Adicionar novas dependências no projeto;

- Mapear uma entidade JPA e criar uma interface Repository para ela;

- Utilizar o Flyway como ferramenta de Migrations do projeto;

- Realizar validações com Bean Validation utilizando algumas de suas anotações, como a `@NotBlank`.