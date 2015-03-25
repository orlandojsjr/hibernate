/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.adote.hibernate.controller;

import br.com.adote.hibernate.dao.PessoaDAO;
import br.com.adote.hibernate.model.Pessoa;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import javax.inject.Inject;

/**
 *
 * @author Orlando
 */
@Controller
public class IndexController {
    
    @Inject
    private PessoaDAO pessoaDAO;
    
    @Get("/")
    public void index() throws Exception {
       Pessoa p = new Pessoa();
       p.setNome("teste");
       pessoaDAO.salvar(p);
    }
    
}
