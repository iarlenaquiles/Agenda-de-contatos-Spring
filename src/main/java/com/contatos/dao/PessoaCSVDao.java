package com.contatos.dao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.contatos.config.Propriedades;
import com.contatos.model.Pessoa;

public class PessoaCSVDao implements PessoaDAO {
	Propriedades p = new Propriedades();
	String linha = "";

	@Override
	public void adiciona(Pessoa pessoa) throws IOException {
		p.criarArquivo();
		FileOutputStream out = new FileOutputStream(p.getCaminho(), true);
		PrintStream print = new PrintStream(out);

		print.println(pessoa.toString());
		print.close();
	}

	@Override
	public List<Pessoa> getLista() throws IOException {
		p.criarArquivo();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		FileInputStream fis = new FileInputStream(p.getCaminho());
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader buffer = new BufferedReader(isr);

		while ((linha = buffer.readLine()) != null) {
			String[] pessoa = linha.split(";");
			pessoas.add(getPessoa(pessoa));
		}
		return pessoas;
	}

	private Pessoa getPessoa(String[] registro) {
		return new Pessoa(registro[0], registro[1], registro[2], registro[3]);
	}
}
