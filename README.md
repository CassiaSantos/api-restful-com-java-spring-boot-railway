# api-restful-com-java-spring-boot-railway
Esse repositório armazena uma API Restful projetada com Java 22, Spring Boot e Railway. A mesma foi desenvolvida no Bootcamp Java Back-end, uma parceria do Banco Santader e Digitall Inovation One. Com ela, conseguimos cadastrar e recuperar dados usuário de um banco e sua conta.

## Diagrama de Classe - UML
```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```
