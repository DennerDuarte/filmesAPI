package service;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.filmesAPI.data.FilmeDAO;
import br.com.fiap.filmesAPI.model.Filme;

public class FilmeService{
	
	private FilmeDAO dao = new FilmeDAO();
	
	

	public boolean save(Filme filme) {
		if (filme.id() == 0) return false;
		if (filme.nome().length() < 5) return false;
		if (filme.descricao().length() < 10) return false;
		
		
		return true;
		
	}

	public boolean update(Filme filme) {
		
		return true;
	}

	public List<Filme> findAll() {
		
		try {
			return dao.findAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
}