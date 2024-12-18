 
# Backen que conecta con la instancia PSQL
```
 ./gradlew  build
```

-pruebas unitarias
```cli
./gradlew test --tests com.example.backend_prueba.BackendPruebaApplicationTests
```

## Ejecutar paquete
```java
java -jar build/libs/backend_prueba-0.0.1-SNAPSHOT.jar
```


## Estructura de los ficheros:

```
.src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── backend_prueba
│   │               ├── BackendPruebaApplication.java
│   │               ├── config
│   │               │   └── DataLoader.java
│   │               ├── controller
│   │               │   ├── TaskController.java
│   │               │   ├── UserController.java
│   │               │   └── UserGroupController.java
│   │               ├── model
│   │               │   ├── meta
│   │               │   │   ├── Embedding.java
│   │               │   │   └── Migration.java
│   │               │   └── public_
│   │               │       ├── Task.java
│   │               │       ├── UserGroup.java
│   │               │       └── User.java
│   │               └── repository
│   │                   ├── TaskRepository.java
│   │                   ├── UserGroupRepository.java
│   │                   └── UserRepository.java
│   └── resources
│       ├── application.properties
│       └── db
│           └── migration
│               └── V1__initial_schema.sql
└── test
    └── java
        └── com
            └── example
                └── backend_prueba
                    ├── BackendPruebaApplicationTests.java
                    ├── controller
                    │   ├── TaskControllerTest.java
                    │   ├── UserControllerTest.java
                    │   └── UserGroupControllerTest.java
                    ├── model
                    │   ├── TaskTest.java
                    │   └── UserTest.java
                    └── repository
                        ├── TaskRepositoryTest.java
                        ├── UserGroupRepositoryTest.java
                        └── UserRepositoryTest.java

```

