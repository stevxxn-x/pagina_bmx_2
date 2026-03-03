package com.pagina.bmx; // Esto coincide con tus carpetas src/main/java/com/pagina/bmx

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication // Esta línea le dice a Java que este es un proyecto Spring Boot
@Controller            // Esta línea le dice que este archivo también manejará las rutas web
public class codigo_fuente {

    // Este es el método principal que "enciende" el servidor
    public static void main(String[] args) {
        SpringApplication.run(codigo_fuente.class, args);
    }

    // Cuando alguien entre a la página principal...
    @GetMapping("/")
    public String inicio() {
        // MUY IMPORTANTE: Retornamos "codigo" porque tu archivo se llama "codigo.html"
        // Spring Boot lo buscará automáticamente en la carpeta /templates/
        return "codigo"; 
    }
}