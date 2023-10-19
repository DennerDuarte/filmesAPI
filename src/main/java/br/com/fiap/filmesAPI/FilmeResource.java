package br.com.fiap.filmesAPI;

import java.util.List;

import br.com.fiap.filmesAPI.model.Filme;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import service.FilmeService;

@Path("filmes")
public class FilmeResource{
	
	private FilmeService service = new FilmeService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Filme> listAll(){
		return service.findAll();
	}
}

