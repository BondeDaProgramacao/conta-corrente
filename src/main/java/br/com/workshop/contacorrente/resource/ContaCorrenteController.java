package br.com.workshop.contacorrente.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ContaCorrenteController {

    @GetMapping
    public String hello(){
        return "Hello there";
    }
}
