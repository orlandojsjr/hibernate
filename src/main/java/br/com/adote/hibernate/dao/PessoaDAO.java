/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.adote.hibernate.dao;

import br.com.adote.hibernate.model.Pessoa;
import java.util.List;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Orlando
 */
@TransacaoJPA
@RequestScoped
public class PessoaDAO extends GenericDAO {
    
    public void salvar(Pessoa pessoa) throws Exception {
        super.salvar(pessoa);
    }
    
    public List<Pessoa> listar() {
        return super.buscarTodos(Pessoa.class);
    }
}
