package br.com.fiap.filmesAPI.data;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connectionFactory.ConnectionFactory;
import br.com.fiap.filmesAPI.model.Filme;

public class FilmeDAO {
	
	private Connection conexao;
	

    public FilmeDAO() {
        try {
			conexao = ConnectionFactory.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
       
    }
    
    public void inserir(Filme filme) throws SQLException {
        var sql = "INSERT INTO filmes (id, nome, descricao, tempo_duracao, diretor) VALUES ( ?, ?, ?, ?, ?) ";
        var comando = conexao.prepareStatement(sql);
        comando.setInt(1, filme.id());
        comando.setString(2, filme.nome());
        comando.setString(3, filme.descricao());
        comando.setInt(4, filme.tempo_duracao());
        comando.setString(5, filme.diretor());
        comando.executeUpdate();

    }

	public List<Filme> findAll() throws SQLException{
		
		var listaFilmes = new ArrayList<Filme>();
		
		var sql = conexao.prepareStatement("SELECT * FROM filmes");
		var resultado = sql.executeQuery();
		
		 while(resultado.next()){
	            listaFilmes.add (new Filme(
	                resultado.getInt("id"), 
	                resultado.getString("nome"), 
	                resultado.getString("descricao"), 
	                resultado.getInt("tempo_duracao"),
	                resultado.getString("diretor")
	            ));
	        }
		return null;
	}

}