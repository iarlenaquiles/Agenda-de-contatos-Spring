package com.contatos;

import java.io.File;
import java.io.IOException;

import com.contatos.config.Propriedades;

public class Teste {

	public static void main(String[] args) throws IOException {
		Propriedades p = new Propriedades();

		File arquivo = new File(p.getCaminho());
		
		if(arquivo.exists()){
			System.out.println(arquivo);
		}else{
			arquivo.createNewFile();
		}
	}

}
