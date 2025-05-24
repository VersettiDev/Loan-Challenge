# Sistema de Análise de Empréstimos

## 📋 Descrição
Este é um sistema de análise de empréstimos que avalia e retorna os tipos de empréstimos disponíveis para um cliente, juntamente com suas respectivas taxas de juros, baseado em um conjunto específico de regras de negócio.

## 🎯 Objetivo
O sistema tem como objetivo analisar o perfil do cliente (incluindo salário, idade e localização) e determinar quais tipos de empréstimos estão disponíveis, seguindo critérios predefinidos.

## 📊 Regras de Negócio

### Empréstimo Pessoal
- Concedido se o salário for igual ou inferior a R$ 3.000
- Concedido se o salário estiver entre R$ 3.000 e R$ 5.000, desde que o cliente:
  - Tenha menos de 30 anos
  - Resida em São Paulo (SP)

### Empréstimo Consignado
- Concedido se o salário for igual ou superior a R$ 5.000

### Empréstimo com Garantia
- Concedido se o salário for igual ou inferior a R$ 3.000
- Concedido se o salário estiver entre R$ 3.000 e R$ 5.000, desde que o cliente:
  - Tenha menos de 30 anos
  - Resida em São Paulo (SP)

## 🚀 Funcionalidades
- Análise automática do perfil do cliente
- Cálculo de empréstimos disponíveis
- Retorno das taxas de juros para cada tipo de empréstimo
- Resposta em formato estruturado com nome do cliente e empréstimos disponíveis

## 🛠️ Tecnologias Utilizadas
- Java 24
- Spring Boot
- Maven

## 📥 Formato da Requisição
```json
{
    "name": "Nome do Cliente", 
    "document": "275.484.389-23",
    "age": 28,
    "income": 3000.00,
    "location": "SP"
}
```


## 📤 Formato da Resposta
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

## 🔧 Como Executar
1. Clone o repositório
2. Certifique-se de ter o Java 24 instalado
3. Execute `mvn clean install`
4. Inicie a aplicação com `mvn spring-boot:run`
5. A API estará disponível em `http://localhost:8080`

## ⚠️ Possíveis Erros e Tratamentos

### Erros de Validação (400 Bad Request)

### Tipos de Erros e Soluções

#### 1. Validação de Dados do Cliente
- **Nome Inválido**
  - Causa: Nome em branco ou nulo
  - Solução: Enviar um nome válido com pelo menos 3 caracteres

- **CPF Inválido**
  - Causa: Formato incorreto ou CPF inexistente
  - Solução: Enviar um CPF válido no formato XXX.XXX.XXX-XX

- **Idade Inválida**
  - Causa: Idade menor que 18 anos ou valor negativo
  - Solução: Enviar idade válida (maior ou igual a 18)

- **Renda Inválida**
  - Causa: Valor negativo ou zero
  - Solução: Enviar valor positivo maior que zero

- **Localização Inválida**
  - Causa: UF não reconhecida ou em formato inválido
  - Solução: Enviar UF válida com 2 caracteres (ex: SP, RJ, MG)


## 📝 Licença
Este projeto está sob a licença [MIT](LICENSE).

## ✨ Autor
[VersettiDev]
