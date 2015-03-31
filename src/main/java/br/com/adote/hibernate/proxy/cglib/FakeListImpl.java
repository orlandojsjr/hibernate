/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.adote.hibernate.proxy.cglib;

/**
 *
 * @author Orlando
 */
public class FakeListImpl <T> implements FakeListInterface<T> {

    private Object[] elements = new Object[100];

    private int size = 0;
    
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        return (T) elements[index];
    }
    
    public void add(T t) {
        elements[size++] = t;
    }
}
