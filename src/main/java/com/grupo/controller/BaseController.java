/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.controller;

import java.util.List;

/**
 *
 * @author ccolome
 */

public interface BaseController<T, ID> {
    
    Boolean registrar(T objeto) ;
    
    List<T> listar();
    
    T obtener(ID id);
    
    Boolean actualizar(T objeto);
    
    Boolean eliminar(ID id);
}
