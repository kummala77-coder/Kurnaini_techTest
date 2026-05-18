# Split Bill API

## Run Project

./mvnw spring-boot:run

## Run Test

./mvnw test

## Docker

docker build -t splitbill .
docker run -p 8080:8080 splitbill

## API Example

POST /api/groups
GET /api/settlements
