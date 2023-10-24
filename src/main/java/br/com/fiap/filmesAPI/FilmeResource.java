package br.com.fiap.filmesAPI;

import java.util.List;

import br.com.fiap.filmesAPI.model.Filme;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import service.FilmeService;

@Path("filmes")
public class FilmeResource{
	
	private FilmeService service = new FilmeService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Filme> listAll(){
		return service.findAll();
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("id") Long id) {
		var filme = service.findById(id);
		
		if (filme == null) {
			return Response.status(404).build();
		}
		
		return Response.ok(filme).build();
	}
}

