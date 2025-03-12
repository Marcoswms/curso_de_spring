package com.kipper.firs_spring_app.domain;

// @Getter -> Gera o método 'get' automaticamente
// @Setter -> Gera o método 'set' automaticamente
// @Data -> Gera o 'get' quanto o 'set', 'equals', 'hashCod', 'toString'.Nem sempre precisamos de todos estes metodos.
// @AllArgsConstructor -> Gerá o 'Constuctor' automaticamente

public class User {
    private String name;
    private String email;

    public User() {
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}