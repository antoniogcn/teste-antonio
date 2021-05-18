#Valida Senha

Este projeto tem como objetivo validar senha

Input: Uma senha (string).
Output: Um booleano indicando se a senha é válida

Pontos de validação

- Nove ou mais caracteres
- Ao menos 1 digito
- Ao menos 1 letra Maiuscula
- Ao menos 1 letra Minuscula
- Ao menos 1 caracter especial
- Não possuir caracteres repetidos 

##Começando
Para ter acesso ao fonte é necessário clonar o projeto do GitHub num diretório de sua preferência:

- cd "diretorio de sua preferencia"
- git clone https://github.com/antoniogcn/teste-antonio.git

## Executar
Para executar o projeto, será necessário instalar os seguintes programas:

- JDK 1.8: Necessário para executar o projeto Java
- Maven 3.6.1: Necessário para realizar o build do projeto Java

Acessar o endpoint "/api/senha-valida" na porta 80

Ex : http://localhost:8080/api/senha-valida/?senha=At!1bcdefg

Acessar via Swagger 

Ex: http://localhost:8080/api/valida-senha/swagger-ui.html 

##Construção
Para construir o projeto com o Maven, executar os comando abaixo:

- mvn clean install

##testes
Para rodar os testes, utilize o comando abaixo:

- mvn test

## Persistência

- N/A


## Dependência

- N/A