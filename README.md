# Spring Boot Graphql for Books API

[![Java CI with Gradle](https://github.com/mehkey/spring-boot-graphql/actions/workflows/gradle.yml/badge.svg)](https://github.com/mehkey/spring-boot-graphql/actions/workflows/gradle.yml)

## GraphQL API

```graphql
type Query {
    bookById(id: ID): Book
}

type Book {
    id: ID
    name: String
    pageCount: Int
    author: Author
}

type Author {
    id: ID
    firstName: String
    lastName: String
}
```

## localhost:8080/graphqli

![ScreenShot](./pic.png)

## Resource

