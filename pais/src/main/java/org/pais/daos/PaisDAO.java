package org.pais.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.pais.models.Pais;

public class PaisDAO {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void salvar(Pais pais) {
		this.entityManager.persist(pais);
	}
	
	public List<Pais> listar(){
		return this.entityManager.createQuery("select p from Pais p",Pais.class).getResultList();
	}
	
	public List<Pais> listarOrdem(String params, String ordem){
		return this.entityManager.createQuery("select p from Pais p order by "+params+" "+ ordem,Pais.class).getResultList();
	}
	
	@Transactional
	public void  eliminar(Pais pais) {
		pais = entityManager.merge(pais);
		this.entityManager.remove(pais);
	}
	
	@Transactional
	public void actualizar(Pais pais) {
		this.entityManager.merge(pais);
	}
}
