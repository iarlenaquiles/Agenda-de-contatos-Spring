package com.contatos;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.contatos.config.Propriedades;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		Propriedades p = new Propriedades();
		File arquivo = new File(p.getCaminho());

		if (!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				System.out.println("Erro ao criar o arquivo");
				e.printStackTrace();
			}
		}
	}

}
