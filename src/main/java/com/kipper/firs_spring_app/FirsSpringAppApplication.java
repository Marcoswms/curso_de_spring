package com.kipper.firs_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Anotação que define a porta de entrada do Spring boot e que concentrar as 3 anotações abaixo:

//@Configuration - Permite métodos que define 'Bins'.
//@EnableAutoConfiguration - Classe que vai ativar a autoconfiguração do SpringBoot
//@ComponentScan - Permite que o Spring escaneie os pacote do nosso projeto em busca das classes de configuração,
//                 componentes, classes de service e controladores.
public class FirsSpringAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirsSpringAppApplication.class, args);
    }
}