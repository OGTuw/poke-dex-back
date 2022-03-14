# Build
docker-compose exec app bash

sh gradlew build

java -jar build/libs/pokedex-0.0.1-SNAPSHOT.jar

# OpenAPI
http://localhost:8080/swagger-ui/index.html
