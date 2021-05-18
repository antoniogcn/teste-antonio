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

# Heroku

Acessar o endpoint "/api/senha-valida" via Heroku

http://antoniogcn.herokuapp.com/api/valida-senha/?senha=SuaSenhaParaValidar

Substituir SuaSenhaParaValidar pela que que se pretente validar 

Acessar via Swagger 

http://antoniogcn.herokuapp.com/api/valida-senha/swagger-ui.html#/senha-controller/validaUsingGET

#Fonte

Para ter acesso ao fonte é necessário clonar o projeto do GitHub num diretório de sua preferência:

- cd "diretorio de sua preferencia"
- git clone https://github.com/antoniogcn/teste-antonio.git

# Executar
Para executar o projeto, será necessário instalar os seguintes programas:

- JDK 1.8: Necessário para executar o projeto Java
- Maven 3.6.1: Necessário para realizar o build do projeto Java


##Construção

Para construir o projeto com o Maven, executar os comando abaixo:

- mvn clean install

##testes
Para rodar os testes, utilize o comando abaixo:

- mvn test