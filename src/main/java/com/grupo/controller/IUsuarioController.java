/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.controller;

import com.grupo.entity.Usuario;

/**
 *
 * @author ccolome
 */
public interface IUsuarioController extends BaseController<Usuario, Integer> {

    Usuario obtener(String username);
}
