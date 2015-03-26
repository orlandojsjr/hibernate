/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.adote.hibernate.business.impl;

import br.com.adote.hibernate.business.PessoaBusiness;
import br.com.adote.hibernate.dao.PessoaDAO;
import br.com.adote.hibernate.model.Pessoa;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;

/**
 *
 * @author Orlando
 */
public class PessoaBusinessImpl implements PessoaBusiness {

    @Inject
    private PessoaDAO pessoaDAO;
    
    @Override
    public void cadastrar(Pessoa pessoa) {
        try {
            pessoaDAO.salvar(pessoa);
        } catch (Exception ex) {
            Logger.getLogger(PessoaBusinessImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Pessoa> listar() {
        return pessoaDAO.listar();
    }
    
}
