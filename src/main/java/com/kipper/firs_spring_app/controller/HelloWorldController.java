package com.kipper.firs_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* @RestController -> combina anotações de @Controller e @ResponseBody e indicará que esta Classe é um Controller Rest.

 * Controller Rest: no Spring é uma classe Java que expõe endpoints de API REST. Ele permite que outras
   aplicações ou serviços interajam com os dados e funcionalidades da aplicação.

   Como funciona:
    .O controller Rest é anotado com @RestController.
    .Os métodos da classe são anotados com @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, entre outras.
    .Os métodos recebem e/ou retornam objetos Java.
    .O Spring Boot converte automaticamente os objetos Java para JSON ou XML.

 * @Controller -> é uma anotação do Spring Boot que indica que uma classe é um controlador. Os controladores são classes
   Java que manipulam requisições HTTP e retornam respostas.  Poderá retornar uma página web html.

 * @ResponseBody -> transforma um objeto Java retornado do controller em uma representação de recurso solicitada por
   um cliente REST.
   O objeto retornado é automaticamente serializado em JSON e passado de volta para o objeto HttpResponse.*/

@RestController
@RequestMapping("/hello-world")/*Adiciona a solicitação de mapeamento e informa qual Request desejo mapear.
                                 Neste caso será mapeado o caminho ("/hello-world")*/
public class HelloWorldController {

    @GetMapping /*O método abaixo responderá as requisições de GET e "/hello-world", ou seja, mapeia o
                    caminho e PEGA(GET) o método helloWorld() */
    public String helloWorld() {
        return "Hello World!";
    }
}