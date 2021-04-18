package org.pais.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;

import org.jboss.resteasy.annotations.providers.jaxb.Wrapped;
import org.pais.daos.PaisDAO;
import org.pais.models.Pais;

@Path("paises")
public class PaisResource {

		@Inject
		private PaisDAO paisDao;
		
		@GET
		@Path("lista")
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Wrapped(element="paises")
		public List<Pais> lista(){
			return this.paisDao.listar();
		}
		
		@GET
		@Path("lista/ordenar")
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Wrapped(element="paises")
		public List<Pais> OrdenarCrescente(){
			List <Pais> listaPais =  new ArrayList<Pais>(this.paisDao.listar());
			listaPais.sort((Pais p1, Pais p2)->p1.getId().compareTo(p2.getId()));
			return listaPais;
		}
		
		@GET
		@Path("lista/ordenar/desc")
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Wrapped(element="paises")
		public List<Pais> OrdenarDecrescente(){
			List <Pais> listaPais =  new ArrayList<Pais>(this.paisDao.listar());
			listaPais.sort((Pais p1, Pais p2)->p2.getId().compareTo(p1.getId()));
			return listaPais;
		}
		@GET
		@Path("lista/ordenar/nome")
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Wrapped(element="paises")
		public List<Pais> OrdenarNomeCrescente(){
			List <Pais> listaPais =  new ArrayList<Pais>(this.paisDao.listar());
			listaPais.sort((Pais p1, Pais p2)->p1.getNome().compareTo(p2.getNome()));
			return listaPais;
		}
		
		@GET
		@Path("lista/ordenar/nome/desc")
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Wrapped(element="paises")
		public List<Pais> OrdenarNomeDecrescente(){
			List <Pais> listaPais =  new ArrayList<Pais>(this.paisDao.listar());
			listaPais.sort((Pais p1, Pais p2)->p2.getNome().compareTo(p1.getNome()));
			return listaPais;
		}
		
		@GET
		@Path("lista/ordenar/area")
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Wrapped(element="paises")
		public List<Pais> OrdenarAreaCrescente(){
			List <Pais> listaPais =  new ArrayList<Pais>(this.paisDao.listar());
			listaPais.sort((Pais p1, Pais p2)->p1.getArea().compareTo(p2.getArea()));
			return listaPais;
		}
		
		@GET
		@Path("lista/ordenar/area/desc")
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Wrapped(element="paises")
		public List<Pais> OrdenarAreaDecrescente(){
			List <Pais> listaPais =  new ArrayList<Pais>(this.paisDao.listar());
			listaPais.sort((Pais p1, Pais p2)->p2.getArea().compareTo(p1.getArea()));
			return listaPais;
		}
		
		@GET
		@Path("lista/ordenar/capital")
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Wrapped(element="paises")
		public List<Pais> OrdenarCapitalCrescente(){
			List <Pais> listaPais =  new ArrayList<Pais>(this.paisDao.listar());
			listaPais.sort((Pais p1, Pais p2)->p1.getCapital().compareTo(p2.getCapital()));
			return listaPais;
		}
		
		@GET
		@Path("lista/ordenar/capital/desc")
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Wrapped(element="paises")
		public List<Pais> OrdenarCapitalDecrescente(){
			List <Pais> listaPais =  new ArrayList<Pais>(this.paisDao.listar());
			listaPais.sort((Pais p1, Pais p2)->p2.getCapital().compareTo(p1.getCapital()));
			return listaPais;
		}
		@GET
		@Path("lista/ordenar/regiao")
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Wrapped(element="paises")
		public List<Pais> OrdenarRegiaoCrescente(){
			List <Pais> listaPais =  new ArrayList<Pais>(this.paisDao.listar());
			listaPais.sort((Pais p1, Pais p2)->p1.getRegiao().compareTo(p2.getRegiao()));
			return listaPais;
		}
		
		@GET
		@Path("lista/ordenar/regiao/desc")
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Wrapped(element="paises")
		public List<Pais> OrdenarRegiaoDecrescente(){
			List <Pais> listaPais =  new ArrayList<Pais>(this.paisDao.listar());
			listaPais.sort((Pais p1, Pais p2)->p2.getRegiao().compareTo(p1.getRegiao()));
			return listaPais;
		}
		
		@GET
		@Path("lista/ordenar/subRegiao")
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Wrapped(element="paises")
		public List<Pais> OrdenarSubRegiaoCrescente(){
			List <Pais> listaPais =  new ArrayList<Pais>(this.paisDao.listar());
			listaPais.sort((Pais p1, Pais p2)->p1.getSubRegiao().compareTo(p2.getSubRegiao()));
			return listaPais;
		}
		
		@GET
		@Path("lista/ordenar/subRegiao/desc")
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Wrapped(element="paises")
		public List<Pais> OrdenarSubRegiaoDecrescente(){
			List <Pais> listaPais =  new ArrayList<Pais>(this.paisDao.listar());
			listaPais.sort((Pais p1, Pais p2)->p2.getSubRegiao().compareTo(p1.getSubRegiao()));
			return listaPais;
		}
		@POST
		@Path("adiciona")
		@Consumes({ MediaType.APPLICATION_JSON })
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
		public List<Pais> adicionarPais(Pais pais) {
			System.out.println(pais);
			this.paisDao.salvar(pais);
			return paisDao.listar();
		}
		
		@DELETE
		@Path("elimina")
		@Consumes({ MediaType.APPLICATION_JSON })
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		public List<Pais> eliminarPais(Pais pais) {
			System.out.println(pais);
			this.paisDao.eliminar(pais);
			return paisDao.listar();
		}
		
		@PUT
		@Path("actualiza")
		@Consumes({ MediaType.APPLICATION_JSON })
		@Produces({ MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML})
		public List<Pais> actualizarPais(Pais pais) {
			System.out.println(pais);
			this.paisDao.actualizar(pais);
			return paisDao.listar();
		}
}
