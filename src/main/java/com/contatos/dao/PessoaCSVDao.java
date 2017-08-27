package com.contatos.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.contatos.model.Pessoa;
import com.opencsv.CSVWriter;

public class PessoaCSVDao implements PessoaDAO {
	String csv = "pessoas1.csv";

	@Override
	public void adiciona(Pessoa pessoa) throws IOException {
		CSVWriter writer = new CSVWriter(new FileWriter(csv, true), ';', '"');
		
		String[] registro = pessoa.toString().split(";");
		
		writer.writeNext(registro);
		writer.close();
	}

	@Override
	public List<Pessoa> getLista() {
		return null;
	}

}
