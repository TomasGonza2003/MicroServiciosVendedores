package com.Vendedores.bibliotecaduoc; 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Opcional: Si tienes entidades o repositorios en subpaquetes específicos y quieres ser explícito
// import org.springframework.boot.autoconfigure.domain.EntityScan;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// Opcional: Si es necesario especificar paquetes para escanear
// @EntityScan("com.Vendedores.bibliotecaduoc.entidad")
// @EnableJpaRepositories("com.Vendedores.bibliotecaduoc.Repository")
public class VendedoresApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendedoresApplication.class, args);
    }

}