# Sales Microservice

## What this service does

This service manages **car sales records** and communicates with the **Gift Service** to find out which gift a customer receives based on their car purchase price.

## Port

Runs on **http://localhost:8081**

## How to Run

```bash
cd sales-application
mvn spring-boot:run
```

> Make sure Gift Service is also running on port 8082 before calling the `/gift` endpoint.

## Endpoints

| Method | URL                                  | Description                              |
|--------|--------------------------------------|------------------------------------------|
| GET    | http://localhost:8081/sales          | Returns all sample sales                 |
| GET    | http://localhost:8081/sales/1        | Returns sale with ID 1                   |
| GET    | http://localhost:8081/sales/1/gift   | Calls Gift Service and returns gift name |

## Sample Data

| ID | Customer | Car       | Price (₹) | Expected Gift     |
|----|----------|-----------|-----------|-------------------|
| 1  | Avinash  | BMW       | 25,00,000 | iPhone 16         |
| 2  | Rahul    | Mercedes  | 45,00,000 | iPhone 17         |
| 3  | Priya    | Audi      | 65,00,000 | iPhone 17 Pro Max |
