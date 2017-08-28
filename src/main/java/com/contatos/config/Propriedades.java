package com.contatos.config;

import static java.nio.file.FileSystems.getDefault;

import java.nio.file.Path;

import org.springframework.stereotype.Component;

@Component
public class Propriedades {

	private Path caminho;
	private final String arquivo = "contatos.csv";

	public Propriedades() {
		this.caminho = getDefault().getPath(System.getenv("HOME"));
	}

	public String getCaminho() {
		return caminho + "/" + arquivo;
	}
}
