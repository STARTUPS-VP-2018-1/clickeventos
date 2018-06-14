/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.business.interfaces;

import br.com.clickeventos.dominio.Login;

/**
 *
 * @author internet
 */
public interface LoginInterface {
    
    public boolean validaLogin (Login login);
    public Login validaLogin (String nomeUser , String senha );
    
    
    
}
