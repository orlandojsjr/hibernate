/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.adote.hibernate.dao;

import br.com.adote.hibernate.model.Pessoa;
import javax.annotation.Resource;

/**
 *
 * @author Orlando
 */
public class PessoaDAO extends GenericDAO {
    
    public void salvar(Pessoa pessoa) throws Exception {
        super.salvar(pessoa);
    }
}
