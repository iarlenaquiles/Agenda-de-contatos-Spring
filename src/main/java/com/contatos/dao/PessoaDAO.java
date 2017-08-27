package com.contatos.dao;

import java.io.IOException;
import java.util.List;

import com.contatos.model.Pessoa;

public interface PessoaDAO {

	public void adiciona(Pessoa pessoa) throws IOException;

	public List<Pessoa> getLista();
	
}
