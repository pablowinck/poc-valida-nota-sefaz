package com.github.pablowinck.pocvalidasefaz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PocValidaSefazApplication implements CommandLineRunner {

    @Autowired
    private NFeService nFeService;

    public static void main(String[] args) {
        SpringApplication.run(PocValidaSefazApplication.class, args);
    }

    @Override
    public void run(String... args) {
        String xml = "";
        System.out.println("Nota fiscal válida? " + nFeService.validarNFe(xml));
    }
}
