# Kafka Producer Consumer in Spring
## This is a simple Kafka Producer and Consumer implementation in Spring

- To install Kafka on your local machine and get familiar with Kafka you can install Kafka adn Zookeeper using Docker, if you have not installed Docker you can use this link [Docker Desktop](https://docs.docker.com/desktop/).
- After installing Kafka, you need create and run your Kafka instance using this command  `docker-compose up -d` in the path which `docker-compose.yml` file exist, the `docker-compose.yml` file added below.
- I have prepared a Kafka docker-compose file following for you to be able to create and run Kafka and use it in the application :

**docker-compose.yml** file:
```
version: '2'
services:
  zookeeper: 
    image: confluentinc/cp-zookeeper:7.4.4
    container_name: zookeeper
    environment : 
      ZOOKEEPER_CLIENT_PORT: 2181 
      ZOOKEEPER_TICK_TIME: 2000
    ports: 
      - "22181:2181"

  kafka : 
    image: confluentinc/cp-kafka:7.4.4
    container_name: kafka
    depends_on: 
      - zookeeper 
    ports: 
      - "29092:29092" 
    environment: 
      KAFKA_BROKER ID: 1 
      KAFKA_ZOOKEEPER_CONNECT : zookeeper:2181 
      KAFKA_ADVERTISED_LISTENERS: PLAINTEXT://kafka:9092,PLAINTEXT_HOST://localhost:29092
      KAFKA_LISTENER_SECURITY_PROTOCOL_MAP: PLAINTEXT:PLAINTEXT,PLAINTEXT_HOST:PLAINTEXT 
      KAFKA_INTER_BROKER_LISTENER_NAME: PLAINTEXT 
      KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR: 1 
```
- After cloning and running the application you can test Kafka producer and consumer by calling the `http://localhost:8080/send?message=Hi World!` endpoint, you will see Kafka producer and consumer data on the console if everything is ok :) .
