package com.kipper.firs_spring_app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello World";
    }
}
/* Classes de Configuration:

 - Usada para definir 'Beans' e instâncias de classe no contexto de uma aplicação Spring, ex:

  .O Spring precisa realizar uma injeção de uma Dependência que venha de uma classe externa (Que veio de outra
   biblioteca ex: SDK da Oracle, SDK da AWS), porém ele não saberia mapear através da anotação @Autowired.

  .Para essas situações, precisamos de criar uma classe de configuração com anotação @Configuration indicando que ele
   precisará utilizar essa configuração como base.

  .Dentro dessa classe configuration, definimos métodos publicos que retornam o tipo da classe que queremos
   configurar, ex:

        @Bean
        public SDKAWS sdkAWS() {
            return new SDKAWS();
        } e acima deste método, colocamos a anotação @Bean

 * @Bean -> Usada dentro das classes com anotação @Configuration para indicar que ele deve gerenciar o retorno do
   método como um 'bean', em resumo, cria instâncias de classe que não podem ser gerenciadas pelo Spring. */