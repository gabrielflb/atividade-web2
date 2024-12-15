```
Gabriel Ferreira Lima brito
```

# Atividade DevOps - *Professor: Alex Gondim*

## Desenvolvi essa aplicação conforme a descrição da atividade.
- Utilizei o site <https://start.spring.io/> para fazer o download das dependencias.
- Depois de extrair, abri o promt na pasta do projeto e executei o comando "mvn clean install", o maven vai limpar e instalar as dependencias.
- Criei uma Api Rest que gerencia usuarios, com o banco de dados H2(um banco de dados em memória).
- Nessa Api Rest podemos fazer totalmente um CRUD de usuarios, quer será salva em tempo de execução no H2 utilizando JPA.

### Para rodar a aplicação deve se digitar o comando ```mvn spring-boot:run``` na pasta do projeto.

## Seguem as imagens dos testes dos end point utilizando Json:
- **GET**:
![GET](https://github.com/gabrielflb/atividade-web2/blob/main/web2/img/get.PNG)
- **POST**:
![POST](https://github.com/gabrielflb/atividade-web2/blob/main/web2/img/post.PNG)
- **PUT**:
![PUT](https://github.com/gabrielflb/atividade-web2/blob/main/web2/img/put.PNG)
- **DELETE**:
![DELETE](https://github.com/gabrielflb/atividade-web2/blob/main/web2/img/delete.PNG)

## Fazendo Deploy com Docker:
- Primeiramente fiz o download do Docker
- Depois de fazer o download instalei a dependencia:Apache Maven JAR Plugin versão 3.4.2. Em seguida executei o comando mvn clean package para ele limpar e criar a pasta target no meu projeto com o arquivo .JAR
- 
- 
