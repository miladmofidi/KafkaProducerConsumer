# Kafka Producer Consumer in Spring
## This is a simple Kafka Producer and Consumer implementation in Spring

To get familiar with Kafka you can install Kafka using Docker, I have prepared a Kafka docker-compose file following for you to be able to install Docker and use it in the application :

docker-compose.yml
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

