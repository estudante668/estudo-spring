package com.estudo.cursos.controle;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.estudo.cursos.modelo.Cursos;
import com.estudo.cursos.modelo.Status;
import com.estudo.cursos.repositorio.Repositorio;

@RestController
@RequestMapping("/api/cursos")
public class Controle {

	Repositorio repositorio;
	
	public Controle(Repositorio repositorio) {
	 this.repositorio = repositorio;
	}

	
	@GetMapping
	public List<Cursos> listaCusros(){
		return repositorio.listaCusros();
	}
	
	
	@GetMapping("/{id}")
	public Cursos CusrosId(@PathVariable Integer id){
		return repositorio.listaCusrosId(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Conteudo não encotrado"));
	}
	
	public void atualizar( Cursos cursos) {
		Cursos c = new Cursos(2, "Fisca", "Eletricidade", Status.CURSANDO);
		repositorio.salvar();
	}
}
