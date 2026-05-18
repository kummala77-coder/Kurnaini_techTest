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







\## Hardest Design Decision

The hardest design decision was choosing how to implement the settlement calculation while keeping the system simple, maintainable, and accurate. I decided to use a greedy settlement optimization approach because it reduces the number of transactions between participants and keeps the logic relatively easy to understand. The trade-off I accepted is that this approach may not always produce the absolute mathematically optimal settlement in very complex scenarios, but it provides a practical and efficient solution for real-world use cases

