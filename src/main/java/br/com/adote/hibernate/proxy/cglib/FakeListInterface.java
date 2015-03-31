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
public interface FakeListInterface <T> {
    
    int getSize();
    
    T get(int index);
    
    void add(T t);
    
}
