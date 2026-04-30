Overview

This project is a microservices-based Patient Management System designed to demonstrate scalable backend architecture using modern cloud-native technologies.

It consists of independently deployable services for authentication, patient management, billing, and notifications, all exposed through a centralized API gateway. The system leverages gRPC for inter-service communication, is fully containerized with Docker, and uses Infrastructure as Code (IaC) with LocalStack to emulate AWS services locally.


Core Components

* API Gateway
    * Single entry point for all client requests
    * Routes HTTP → gRPC calls to backend services
* Authentication Service
    * User login, token generation, access control
* Patient Service
    * CRUD operations for patient records
* Billing Service
    * Handles invoices, payments, and billing logic
* Notification Service
    * Sends alerts (email/SMS simulation or integration-ready)

Features

* Modular microservices architecture
* High-performance gRPC communication
* Centralized routing via API Gateway
* Fully Dockerized services
* Local AWS emulation using LocalStack
* Infrastructure provisioning using IaC
* Scalable and cloud-ready design

Request Flow

1. Client sends HTTP request → API Gateway
2. API Gateway routes request → appropriate service
3. Services communicate internally via gRPC
4. Response is returned through the gateway
