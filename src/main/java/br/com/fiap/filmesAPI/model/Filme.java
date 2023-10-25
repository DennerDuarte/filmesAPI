package br.com.fiap.filmesAPI.model;

public record Filme (
	int id,
	String nome,
	String descricao,
	int tempo_duracao,
	String diretor
	
){}
