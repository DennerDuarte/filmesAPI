package service;

import java.util.List;

import br.com.fiap.filmesAPI.data.FilmeDAO;
import br.com.fiap.filmesAPI.model.Filme;

public class FilmeService{
	
	private FilmeDAO dao = new FilmeDAO();
	
	public List<Filme> findAll() {
		return dao.findAll();
	}
	
}