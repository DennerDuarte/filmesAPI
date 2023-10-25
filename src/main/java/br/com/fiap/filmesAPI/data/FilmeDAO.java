package br.com.fiap.filmesAPI.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.filmesAPI.model.Filme;

public class FilmeDAO {

	List<Filme> filmes = new ArrayList<>();

	public FilmeDAO() {
		filmes = List.of(
				new Filme(1, "Mega Tubarão", "Filme de tubarão", 120, "David Backhan"),
				new Filme(2, "As Branquelas", "Filme de brancos", 140, "Keenem ivory Wayans")

		);
	}

	public List<Filme> findAll() {
		return filmes;
	}

	public Filme findById(Long id) {
		return filmes
				.stream()
				.filter(filme -> filme.id() == id)
				.findFirst()
				.orElse(null);
		
	}

}