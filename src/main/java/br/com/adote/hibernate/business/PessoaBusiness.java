/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.adote.hibernate.business;

import br.com.adote.hibernate.model.Pessoa;
import java.util.List;

/**
 *
 * @author Orlando
 */
public interface PessoaBusiness {
    
    void cadastrar(Pessoa pessoa);
    
    List<Pessoa> listar();
}
