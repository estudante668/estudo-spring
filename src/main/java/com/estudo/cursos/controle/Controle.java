package com.estudo.cursos.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cursos")
public class Controle {

	@GetMapping
	public String msg() {
		return "Servidor ativo";
	}
}
