package com.kipper.firs_spring_app.service;

import org.springframework.stereotype.Service;

/*Classes Service -> Contém a lógica da nossa aplicação, as regras de negócio.
  O 'controller' só recebe a requisição e passa o processamento para as classes de 'Service'

* @Service -> Indicará que essa é uma classe de Service e está sendo gerenciada pelo Spring.
* */
@Service
public class HelloWorldService {
    //classes que farão a conexão com o banco de dados ficam concentradas nesta classa com Service

    public String helloWorld(String name) {
        return "Hello World " + name;
    }
}//No controller, acessar a classe de Service, pois ela contém a lógica.