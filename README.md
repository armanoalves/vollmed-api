# API da aplicação Voll.med

Projeto de desenvolvimento de uma API de agendamento de consultas, utilizando de Spring Boot e suas bibliotecas para a construção de uma API Rest, que segue os padrões de segurança.

## Aprendizados

### Curso 01 - Aula 01

- Criar um projeto Spring Boot utilizando o site do Spring Initializr;

- Importar o projeto no IntelliJ e executar uma aplicação Spring Boot pela classe contendo o método `main`;

- Criar uma classe Controller e mapear uma URL nela utilizando as anotações `@RestController` e `@RequestMapping`;

- Realizar uma requisição de teste no browser acessando a URL mapeada no Controller.

### Curso 01 - Aula 02

- Mapear requisições POST em uma classe Controller;

- Enviar requisições POST para a API utilizando o Insomnia;

- Enviar dados para API no formato JSON;

- Utilizar a anotação `@RequestBody` para receber os dados do corpo da requisição em um parâmetro no Controller;

- Utilizar o padrão DTO (Data Transfer Object), via Java Records, para representar os dados recebidos em uma requisição POST.

### Curso 01 - Aula 03

- Adicionar novas dependências no projeto;

- Mapear uma entidade JPA e criar uma interface Repository para ela;

- Utilizar o Flyway como ferramenta de Migrations do projeto;

- Realizar validações com Bean Validation utilizando algumas de suas anotações, como a `@NotBlank`.

### Curso 01 - Aula 04

- Utilizar a anotação `@GetMapping` para mapear métodos em Controllers que produzem dados;

- Utilizar a interface `Pageable` do Spring para realizar consultas com paginação;

- Controlar a paginação e a ordenação dos dados devolvidos pela API com os parâmetros `page`, `size` e `sort`;

- Configurar o projeto para que os comandos SQL sejam exibidos no console.

### Curso 01 - Aula 05

- Mapear requisições PUT com a anotação `@PutMapping`;

- Escrever um código para atualizar informações de um registro no banco de dados;

- Mapear requisições DELETE com a anotação `@DeleteMapping`;

- Mapear parâmetros dinâmicos em URL com a anotação `@PathVariable`;

- Implementar o conceito de exclusão lógica com o uso de um atributo booleano.

### Curso 2 - Aula 01

- Utilizar a classe `ResponseEntity`, do Spring, para personalizar os retornos dos métodos de uma classe Controller;

- Modificar o código HTTP devolvido nas respostas da API;

- Adicionar cabeçalhos nas respostas da API;

- Utilizar os códigos HTTP mais apropriados para cada operação realizada na API.

### Curso 2 - Aula 02 

- Criar uma classe para isolar o tratamento de exceptions da API, com a utilização da anotação `@RestControllerAdvice`;

- Utilizar a anotação `@ExceptionHandler`, do Spring, para indicar qual exception um determinado método da classe de tratamento de erros deve capturar;

- Tratar erros do tipo 404 (Not Found) na classe de tratamento de erros;

- Tratar erros do tipo 400 (Bad Request), para erros de validação do Bean Validation, na classe de tratamento de erros;

- Simplificar o JSON devolvido pela API em casos de erro de validação do Bean Validation.

### Curso 2 - Aula 03

- Funciona o processo de autenticação e autorização em uma API Rest;

- Adicionar o Spring Security ao projeto;

- Funciona o comportamento padrão do Spring Security em uma aplicação;

- Implementar o processo de autenticação na API, de maneira Stateless, utilizando as classes e configurações do Spring Security.