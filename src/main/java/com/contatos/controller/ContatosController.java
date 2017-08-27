package com.contatos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContatosController {
	
	@RequestMapping("/")
	public String listarContatos() {
		return "lista-contatos";
	}
}
