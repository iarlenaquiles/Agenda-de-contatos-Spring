package com.contatos.dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.contatos.config.Propriedades;
import com.contatos.model.Pessoa;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class PessoaCSVDao implements PessoaDAO {
	Propriedades p = new Propriedades();

	@Override
	public void adiciona(Pessoa pessoa) throws IOException {
		CSVWriter writer = new CSVWriter(new FileWriter(p.getCaminho(), true), ';', '"');

		String[] registro = pessoa.toString().split(";");

		writer.writeNext(registro);
		writer.close();

	}

	@Override
	public List<Pessoa> getLista() throws IOException {
		CSVReader reader = new CSVReader(new FileReader(p.getCaminho()), ';', '"');
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		String[] registro = null;
		while ((registro = reader.readNext()) != null) {
			Pessoa p = new Pessoa();
			p.setNome(registro[0]);
			p.setEndereco(registro[1]);
			p.setTelefone(registro[2]);
			p.setEmail(registro[3]);

			pessoas.add(p);
		}

		reader.close();
		return pessoas;
	}
}
