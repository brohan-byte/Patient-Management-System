*Overview*

This project is a microservices-based Patient Management System built using cloud-native principles. It combines synchronous gRPC communication with asynchronous event-driven processing using Kafka, enabling scalable and loosely coupled service interactions.

The system includes services for authentication, patient management, billing, and notifications, all exposed via an API gateway. It is fully containerized with Docker and uses Infrastructure as Code (IaC) with LocalStack for local AWS emulation.

*Architecture*

* API Gateway
    * Entry point for all client requests
    * Routes HTTP → gRPC calls
* Authentication Service
    * Handles user authentication and authorization
* Patient Service
    * Manages patient records (CRUD)
* Billing Service
    * Processes billing and payments
* Notification Service
    * Sends alerts based on system events
* Kafka (Event Bus)
    * Enables asynchronous communication between services
    * Decouples producers and consumers

*Features*

* Microservices-based modular design
* Hybrid communication model:
    * gRPC for synchronous calls
    * Kafka for asynchronous workflows
* Event-driven architecture for scalability
* Dockerized deployment
* Local AWS emulation with LocalStack
* Infrastructure provisioning via IaC


*Design Highlights*

* Event-driven architecture improves scalability
* Loose coupling via Kafka topics
* High performance using gRPC
* Cloud-ready with IaC
* Local-first development using LocalStack


*Event Flow Example*

1. Patient is created → Patient Service
2. Event published to Kafka (patient.created)
3. Billing Service consumes event → generates invoice
4. Notification Service consumes event → sends alert
