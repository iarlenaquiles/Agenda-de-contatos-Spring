package com.contatos.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.contatos.dao.PessoaCSVDao;
import com.contatos.dao.PessoaDAO;
import com.contatos.model.Pessoa;

@Controller
public class ContatosController {

	private PessoaDAO pessoaDao = new PessoaCSVDao();

	@RequestMapping("/")
	public String listarContatos() {
		return "lista-contatos";
	}

	@GetMapping("/contatos/add")
	public String insereForm() {
		return "inserir-contato";
	}

	@PostMapping("/contatos")
	public String addContato(HttpServletRequest request, Model model, RedirectAttributes redirect) throws IOException {
		Pessoa pessoa = getPessoaFromParams(request);
		pessoaDao.adiciona(pessoa);
		redirect.addFlashAttribute("mensagem", "Contato inserido com sucesso!");
		return "redirect:/";
	}

	private Pessoa getPessoaFromParams(HttpServletRequest request) {
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");

		return new Pessoa(nome,endereco,telefone, email);
	}

}
