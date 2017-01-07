//package br.com.dextra.loja.resource;
//
//import java.net.URI;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.PUT;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import javax.ws.rs.core.Response.ResponseBuilder;
//
//import com.google.gson.Gson;
//import com.thoughtworks.xstream.XStream;
//
//import br.com.dextra.loja.dao.CarrinhoDAO;
//import br.com.dextra.loja.modelo.Carrinho;
//import br.com.dextra.loja.modelo.Produto;
//
//@Path("carrinhos")
//public class CarrinhoResource {
//
//	@Path("{id}")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String busca(@PathParam("id") long id) {
//		Carrinho carrinho = new CarrinhoDAO().busca(id);
//		return carrinho.toJSON();
//	}
//
//	@POST
//	@Consumes(MediaType.APPLICATION_XML)
//	public Response adiciona(String conteudo) {
//		Carrinho carrinho = (Carrinho) new XStream().fromXML(conteudo);
//		new CarrinhoDAO().adiciona(carrinho);
//		URI uri = URI.create("/carrinhos/" + carrinho.getId());
//		return Response.created(uri).build();
//	}
//	
//	@Path("{id}/produtos/{produtoId}")
//	@DELETE
//	public Response removeProdudo(@PathParam("id") long id, @PathParam("produtoId") long produtoId){
//		Carrinho carrinho = new CarrinhoDAO().busca(id);
//		carrinho.remove(produtoId);
//		return Response.ok().build();
//	}
//	
//	
//	@Path("{id}")
//	@DELETE
//	public Response removeCarrinho(@PathParam("id") long id) {
//		new CarrinhoDAO().remove(id);
//		return Response.ok().build();
//	}
//	
//	@Path("{id}/produtos/{produtoId}")
//	@PUT
//	public Response alteraProduto(String novoProduto,
//			@PathParam("id") long id, 
//			@PathParam("produtoId") long produtoId) {
//		
//		Carrinho carrinho = new CarrinhoDAO().busca(id);
//		Produto produto = (Produto) new XStream().fromXML(novoProduto);
//		//Produto produto = (Produto) new Gson().fromJson(novoProduto,Produto.class);
//		carrinho.troca(produto);
//		return Response.ok().build();
//	}
//	
//	
//	@Path("{id}/produtos/{produtoId}/quantidade")
//	@PUT
//	@Consumes(MediaType.APPLICATION_XML)
//	public Response alteraQuantidadeProduto(String 
//			novaQuantidadeProduto,@PathParam("id") long id, 
//			@PathParam("produtoId") long produtoId) {
//		
//		Carrinho carrinho = new CarrinhoDAO().busca(id);
//		Produto produto = (Produto) new XStream()
//				.fromXML(novaQuantidadeProduto);
//		carrinho.trocaQuantidade(produto);
//		return Response.ok().build();
//	}
//	
//	
//	
//	@Path("{id}/produtos/{produtoId}/quantidadeJSON")
//    @PUT
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response alteraProduto(@PathParam("id") long id, @PathParam("produtoId") 
//    long produtoId, String conteudo) {
//        Carrinho carrinho = new CarrinhoDAO().busca(id);
//        Produto produto = (Produto) new Gson().
//        		fromJson(conteudo,Produto.class);
//        carrinho.trocaQuantidade(produto);
//        return Response.ok().build();
//    }
//    
//	
//}



package br.com.dextra.loja.resource;

import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.dextra.loja.dao.CarrinhoDAO;
import br.com.dextra.loja.modelo.Carrinho;
import br.com.dextra.loja.modelo.Produto;

@Path("carrinhos")
public class CarrinhoResource {

//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	/* Busca todo o conteudo do carrinho - forma estatica de busca 
//	public String busca() {
//		Carrinho carrinho = new CarrinhoDAO().busca(1l);
//		return carrinho.toXML();
//	}

//	 Busca por passagem de parametro - localhost:8080/carrinhos?id=1 
	@GET
	@Produces(MediaType.APPLICATION_XML)
	//@Produces(MediaType.APPLICATION_JSON)
	public String buscaPorQuery(@QueryParam("id") long id) {
		Carrinho carrinho = new CarrinhoDAO().busca(id);
		return carrinho.toXML();
		//return carrinho.toJSON();
	}

	@Path("{id}") // Deixou de utilizar o QueryParameter e pode usar /carrinhos/1 ou x ao invés de /carrinhos/id?=1 ou x
	@GET
	@Produces(MediaType.APPLICATION_XML)
	//@Produces(MediaType.APPLICATION_JSON)
	//public String buscaPorPath(@PathParam("id") long id) {
	public String busca(@PathParam("id") long id) {
		Carrinho carrinho = new CarrinhoDAO().busca(id);
		return carrinho.toXML(); //rodando em xml
		//return carrinho.toJSON();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_XML)
	//public String adiciona(String conteudo){
	public Response adiciona(String conteudo){
		Carrinho carrinho = (Carrinho) new XStream().fromXML(conteudo);
		new CarrinhoDAO().adiciona(carrinho);
		URI uri = URI.create("/carrinhos/" + carrinho.getId());
		return Response.created(uri).build();
		//return "sucesso";
	}
	
	@Path("{id}/produtos/{produtoId}")
	@DELETE
	public Response removeProdudo(@PathParam("id") long id, 
			@PathParam("produtoId") long produtoId){
		Carrinho carrinho = new CarrinhoDAO().busca(id);
		carrinho.remove(produtoId);
		return Response.ok().build();
	}
	
	
	@Path("{id}")
	@DELETE
	public Response removeCarrinho(@PathParam("id") long id) {
		new CarrinhoDAO().remove(id);
		return Response.ok().build();
	}
	
	@Path("{id}/produtos/{produtoId}")
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response alteraQuantidadeProdudo(String novaQuantidadeProduto, @PathParam("id") long id, @PathParam("produtoId") long produtoId){
		Carrinho carrinho = new CarrinhoDAO().busca(id);
		Produto produto = (Produto) new XStream().fromXML(novaQuantidadeProduto);
		carrinho.trocaQuantidade(produto);
		return Response.ok().build();
	}
	@Path("{id}/produtos/{produtoId}/quantidadeJSON")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response alteraProduto(@PathParam("id") long id, @PathParam("produtoId") 
    long produtoId, String conteudo) {
        Carrinho carrinho = new CarrinhoDAO().busca(id);
        Produto produto = (Produto) new Gson().fromJson(conteudo,Produto.class);
        carrinho.trocaQuantidade(produto);
        return Response.ok().build();
    }
}