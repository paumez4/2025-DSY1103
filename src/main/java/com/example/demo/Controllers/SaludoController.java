package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("saludo")
public class SaludoController {
    
    @GetMapping("hola")
    public String darHola(
        @RequestParam(name="nombre",defaultValue = "don nadie") String nombre
    ){
        return "Hola, Saludos "+nombre+"!";
    }

    @GetMapping("adios")
    public String darChao(){
        return "Chao pescao";
    }
}
