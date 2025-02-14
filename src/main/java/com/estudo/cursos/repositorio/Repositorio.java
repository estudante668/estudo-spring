package com.estudo.cursos.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.estudo.cursos.modelo.Cursos;
import com.estudo.cursos.modelo.Status;

import jakarta.annotation.PostConstruct;

@Repository
public class Repositorio {

	private final List<Cursos> lista = new ArrayList<>();
	
	public Repositorio() {
		
	}
	
	@PostConstruct
	public void inicio() {
		 Cursos cursos = new Cursos(1, "Filosofia", "Logica", Status.CONCLUIDO);
		 lista.add(cursos);
	};
	
	public List<Cursos> listaCusros(){
		return lista;
	}
	
	public Optional<Cursos> listaCusrosId(Integer id){
		return lista.stream().filter(c -> c.id().equals(id)).findFirst();
	}

	public void salvar(Cursos cursos) {
		lista.add(cursos);	
	}
}
