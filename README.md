# Sistema de Análise de Empréstimos

## 📋 Descrição
Este é um sistema de análise de empréstimos que avalia e retorna os tipos de empréstimos disponíveis para um cliente, juntamente com suas respectivas taxas de juros, baseado em um conjunto específico de regras de negócio.

## 🎯 Objetivo
O sistema tem como objetivo analisar o perfil do cliente (incluindo salário, idade e localização) e determinar quais tipos de empréstimos estão disponíveis, seguindo critérios predefinidos.

## 🛠️ Tecnologias Utilizadas
- Java 24
- Spring Boot
- Maven

## 🔧 Como Executar
1. Clone o repositório
2. Certifique-se de ter o Java 24 instalado
3. Execute `mvn clean install`
4. Inicie a aplicação com `mvn spring-boot:run`
5. A API estará disponível em `http://localhost:8080`

## 🚀 Funcionalidades
- Análise automática do perfil do cliente
- Cálculo de empréstimos disponíveis
- Retorno das taxas de juros para cada tipo de empréstimo
- Resposta em formato estruturado com nome do cliente e empréstimos disponíveis

## 🧶 Endpoints Disponíveis
### 1. Endpoint para verificação de empréstimos disponíveis
``` 
POST /customer-loans
```
**Request:**
```json
{
    "name": "Nome do Cliente", 
    "document": "275.484.389-23",
    "age": 28,
    "income": 3000.00,
    "location": "SP"
}
```
**Response:**
```json
{
  "customerName": "Nome do Cliente",
  "loans": [
    {
      "type": "PERSONAL",
      "interest": 4.0
    },
    {
      "type": "GUARANTED",
      "interest": 3.0
    }
  ]
}
```

### 🎁 Tipos de Empréstimos Retornados
- `PERSONAL`: Empréstimo Pessoal
- `CONSIGNMENT`: Empréstimo Consignado
- `GUARANTED`: Empréstimo com Garantia

### 📌 Detalhes dos Campos da Requisição

| Campo | Tipo | Obrigatório | Descrição |
|-------|------|-------------|-----------|
| name | string | Sim | Nome completo do cliente |
| document | string | Sim | CPF do cliente (formato: XXX.XXX.XXX-XX) |
| age | number | Sim | Idade do cliente (mínimo 18 anos) |
| income | number | Sim | Renda mensal do cliente em reais |
| location | string | Sim | UF do estado de residência (2 caracteres) |

## 📊 Regras de Negócio

### 🙋‍♀️ Empréstimo Pessoal
- Concedido se o salário for igual ou inferior a R$ 3.000
- Concedido se o salário estiver entre R$ 3.000 e R$ 5.000, desde que o cliente:
  - Tenha menos de 30 anos
  - Resida em São Paulo (SP)

### ✨ Empréstimo Consignado
- Concedido se o salário for igual ou superior a R$ 5.000

### 🥙 Empréstimo com Garantia
- Concedido se o salário for igual ou inferior a R$ 3.000
- Concedido se o salário estiver entre R$ 3.000 e R$ 5.000, desde que o cliente:
  - Tenha menos de 30 anos
  - Resida em São Paulo (SP)

## 📝 Licença
Este projeto está sob a licença [MIT](LICENSE).

## ✨ Autor
[VersettiDev]
