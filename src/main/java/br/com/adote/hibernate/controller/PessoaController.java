/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.adote.hibernate.controller;

import br.com.adote.hibernate.business.PessoaBusiness;
import br.com.adote.hibernate.model.Pessoa;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import javax.inject.Inject;

/**
 *
 * @author Orlando
 */
@Controller
@Path("/pessoa")
public class PessoaController {
    @Inject
    private PessoaBusiness pessoaBusiness;
    @Inject
    private Result result;
    
    @Get("/cadastro")
    public void cadastro() {
        result.include("pessoas", pessoaBusiness.listar());
    }
    
    @Post("/cadastro")
    public void cadastrar(Pessoa pessoa) {
        pessoaBusiness.cadastrar(pessoa);
        result.redirectTo(this).cadastro();
    }
    
    @Get("/sucesso")
    public void sucesso() {
    }
    
}
