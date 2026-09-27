\# Plataforma — Rede Acadêmica Colaborativa



Projeto Integrador II · Ciência da Computação · IFPA Campus Tucuruí

Módulos I (Cooperação científica) e II (Mentoria entre pares)



\## Requisitos

\- Java 21 (Temurin)

\- Node 20+

\- Docker Desktop



\## Como rodar



1\. Banco e servidor de e-mail:

&#x20;  docker compose up -d



2\. API (apps/api), pelo IntelliJ ou:

&#x20;  cd apps/api

&#x20;  ./mvnw spring-boot:run



3\. Front (apps/web):

&#x20;  cd apps/web

&#x20;  npm install

&#x20;  npm run dev



\## Endereços

\- Front: http://localhost:5173

\- API: http://localhost:8080

\- Saúde da API: http://localhost:8080/actuator/health

\- Caixa de e-mails de teste: http://localhost:8025

