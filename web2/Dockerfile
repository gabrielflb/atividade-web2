# Usar uma imagem base do Java
FROM openjdk:21-jdk-slim

# Configura o diretório de trabalho no container
WORKDIR /app

# Copia o JAR gerado pelo Maven para o container
COPY target/web2-0.0.1-SNAPSHOT.jar web2.jar

# Expõe a porta 8080 (ou a porta configurada no seu Spring Boot)
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "web2.jar"]
