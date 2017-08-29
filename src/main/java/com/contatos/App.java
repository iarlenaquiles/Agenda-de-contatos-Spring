package com.contatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.contatos.config.Propriedades;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		Propriedades p = new Propriedades();
		p.criarArquivo();
	}

}
