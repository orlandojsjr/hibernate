/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adote.hibernate.proxy.cglib;

import br.com.adote.hibernate.model.Pessoa;
import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


/**
 *
 * @author Orlando
 */
public class CGLibProxy <T>{

    public FakeListInterface<T> create() {
        final FakeListImpl<T> example = new FakeListImpl<T>();
        FakeListInterface exampleProxy = (FakeListInterface) Enhancer.create(FakeListInterface.class, new MethodInterceptor() {
            @Override
            public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println(">>>>>>>> CGLib Proxy <<<<<<<<<<<");
                System.out.println(String.format("Method: %s", method.getName()));
                return method.invoke(example, args);
            }
        });
        return exampleProxy;
    }
        
    public static void main(String[] args) {
        FakeListInterface<Pessoa> list = new CGLibProxy<Pessoa>().create();        
        list.add(new Pessoa(1));
        list.add(new Pessoa(2));
        list.add(new Pessoa(3));
        int qtdeItens = list.getSize();        
        Pessoa p = list.get(2);
        System.out.println(String.format("Id: %d ", p.getId()));
        System.out.println(String.format("Qtde Itens na lista: %d ", qtdeItens));
        
    }
}
