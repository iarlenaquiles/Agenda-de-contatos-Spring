package com.contatos.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.stereotype.Component;

@Component
public class Propriedades {

	Properties prop = new Properties();

	private final String arquivo = "contatos.csv";

	public Propriedades() {
		try {
			prop.setProperty("caminho", System.getProperty("user.home") + "/" + arquivo);
			prop.store(new FileOutputStream(System.getProperty("user.home") + "/config.properties"), null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getCaminho() {
		try {
			prop.load(new FileInputStream(System.getProperty("user.home") + "/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty("caminho");
	}
}
