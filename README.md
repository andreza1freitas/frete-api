# 📦 API de Frete — Strategy Pattern com Spring Boot

![Java](https://img.shields.io/badge/Java-21-red)
![Spring%20Boot](https://img.shields.io/badge/Spring%20Boot-4.0.3-brightgreen)
![Spring%20Web](https://img.shields.io/badge/Spring-Web-success)
![Spring%20Data%20JPA](https://img.shields.io/badge/Spring-Data%20JPA-blue)
![H2](https://img.shields.io/badge/H2-Database-lightgrey)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-green)
![Maven](https://img.shields.io/badge/Maven-Build-orange)
![REST%20API](https://img.shields.io/badge/REST-API-informational)
![Design%20Pattern](https://img.shields.io/badge/Design-Strategy%20Pattern-purple)


## 📌 Sobre o projeto

Este projeto consiste em uma **API REST para cálculo e gerenciamento de fretes**, desenvolvida em Java com Spring Boot, aplicando o padrão de projeto **Strategy** como base arquitetural.

A aplicação foi projetada seguindo boas práticas de desenvolvimento, com foco em organização, flexibilidade e facilidade de manutenção. As regras de cálculo são encapsuladas por meio do **Strategy Pattern**, conforme os princípios apresentados no livro *Design Patterns: Elements of Reusable Object-Oriented Software*.

O sistema oferece persistência em banco de dados, operações CRUD completas e documentação interativa, permitindo fácil integração e utilização por outros sistemas.

<br>

## 🛠️ Tecnologias Utilizadas

| Tecnologia      | Versão              |
| --------------- | ------------------- |
| Java            | 21                  |
| Spring Boot     | 4.0.3               |
| Spring Web      | Padrão              |
| Spring Data JPA | Padrão              |
| Banco de Dados  | H2 (In-Memory)      |
| Documentação    | Swagger (SpringDoc) |
| Build Tool      | Maven               |

<br>

## 🏗️ Arquitetura do Projeto

Estrutura em camadas:

```nginx
controller → service → strategy → repository → database
```

Organização de pacotes:
```arduino
config/
controller/
entity/
repository/
service/
strategy/
```

Essa estrutura garante:

- Baixo acoplamento
- Alta coesão
- Facilidade de manutenção
- Escalabilidade

<br>

## 📐 Padrão de Projeto Utilizado

### **Strategy Pattern**

O padrão Strategy permite definir diferentes algoritmos de cálculo e selecioná-los dinamicamente.

No projeto:

- Cada tipo de frete é uma estratégia
- As regras ficam isoladas
- Não há uso de if/else para decisão

#### Benefícios

✔️ Código limpo <br>
✔️ Fácil extensão <br>
✔️ Manutenção simplificada <br>
✔️ Reuso de componentes

<br>

## 💡 Tipos de Frete Implementados

| Tipo     | Descrição      |
| -------- | -------------- |
| normal   | Frete comum    |
| expresso | Frete rápido   |
| retirada | Retirada local |

**Novos tipos podem ser adicionados sem alterar o código existente.**

<br>

## 🔗 Endpoints da API

| Método | Rota        | Descrição       |
| ------ | ----------- | --------------- |
| POST   | /frete      | Criar frete     |
| GET    | /frete      | Listar fretes   |
| PUT    | /frete/{id} | Atualizar frete |
| DELETE | /frete/{id} | Excluir frete   |

<br>

## 📖 Documentação Swagger

A API possui documentação automática.

Após iniciar o projeto, acesse:

```bash
http://localhost:8080/swagger
```

Recursos disponíveis:

- Teste de endpoints
- Visualização de parâmetros
- Exemplos de resposta
- Descrição das rotas

<br>

## 🗄️ Banco de Dados H2

O projeto utiliza banco em memória.

Acesse o console em:
```bash
http://localhost:8080/h2-console
```
Configuração:

```yaml
JDBC URL: jdbc:h2:mem:frete-db
User: sa
Password:
```
<br>

## 🚀 Como Executar o Projeto

#### Pré-requisitos

- Java 21
- Maven

#### Passos
clone o repositório:

```bash
git clone https://github.com/andreza1freitas/frete-api.git
```
Acesse o diretório:
```bash
cd frete-api
```

Execute:
```bash 
mvn spring-boot:run
```

A aplicação iniciará em:
```arduino
http://localhost:8080
```
<br>

## 🔮 Possíveis Evoluções futuras

- Autenticação JWT
- Docker
- MySQL/PostgreSQL

<br>

## 👩‍💻 Autora

**Andreza Freitas** <br>

Projeto desenvolvido para fins educacionais e profissionais.

### 📄 Licença

Este projeto é de uso livre para fins acadêmicos e educacionais.