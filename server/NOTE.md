# Build
docker-compose exec app bash

sh gradlew build

java -jar build/libs/pokedex-0.0.1-SNAPSHOT.jar

# OpenAPI
http://localhost:8080/swagger-ui/index.html

# application.properties backup
spring.datasource.url=jdbc:postgresql://db:5432/pokemon
spring.datasource.username=admin
spring.datasource.password=admin
spring.datasource.driverClassName=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.show-sql=false
spring.jpa.hibernate.ddl-auto=none

server.servlet.context-path=/api

springdoc.api-docs.path=/api-docs
springdoc.swagger-ui.path=/swagger-ui.html
