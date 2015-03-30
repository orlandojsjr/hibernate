/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adote.hibernate.proxy;

import br.com.adote.hibernate.model.Pessoa;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @author Orlando
 */
public class ProxyPessoa {

    public PessoaInterface create() {

        final Pessoa example = new Pessoa();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(">>>>>>>>>> Chamando proxy <<<<<<<<<<<<");
                System.out.println(String.format("Método: %s",  method.getName()));
                if(args != null) {
                 System.out.println(String.format("Args: %s", args[0]));
                }
                return method.invoke(example, args);
            }
        };
        return (PessoaInterface) Proxy.newProxyInstance(ProxyPessoa.class.getClassLoader(), new Class[]{PessoaInterface.class}, invocationHandler);
    }
    
    public static void main(String[] args) {
        PessoaInterface  pessoaInterface = new ProxyPessoa().create();
        pessoaInterface.setNome("Orlando");
        System.out.println(String.format("Nome: %s", pessoaInterface.getNome()));
    }
}
