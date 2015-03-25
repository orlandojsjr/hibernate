/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adote.hibernate.dao;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author orlando
 */

public class GenericDAO {

    @Inject
    private EntityManager em;

    public GenericDAO() {
    }

    public GenericDAO(EntityManager em) {
        this.em = em;
    }
    
    protected void salvar(Serializable object) throws Exception {        
        em.persist(object);        
    }

    protected <T extends Serializable> T consultar(Class<T> clazz, Serializable id) throws Exception {
        T retorno = em.find(clazz, id);
        return retorno;
    }

    protected void alterar(Serializable serializable) throws Exception {
        em.merge(serializable);
    }

    protected void excluir(Serializable serializable) throws Exception {
        em.remove(em.merge(serializable));
    }    
}
