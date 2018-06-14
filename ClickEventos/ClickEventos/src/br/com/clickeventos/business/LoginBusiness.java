/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.business;

import br.com.clickeventos.business.interfaces.LoginInterface;
import br.com.clickeventos.dominio.Cliente;
import br.com.clickeventos.dominio.Empresas;
import br.com.clickeventos.dominio.Login;
import br.com.clickeventos.repositorio.Repositorio;

/**
 *
 * @author Kalunga
 */
public class LoginBusiness implements LoginInterface{

    @Override
    public boolean validaLogin (Login login) {
        for (Cliente cliente : Repositorio.clienteDBFake){
            if (cliente.getNomeUser().equals(login.getNomeUser())&& cliente.getSenha().equals(cliente.getSenha())){
            return true;
        }
    }
      

    for (Empresas empresas : Repositorio.empresasDBFake){
        if(empresas.getNomeUser().equals(login.getNomeUser())&& empresas.getSenha().equals(login.getSenha())){;
        return true;
        }
    }
    return false;
}
    
    
    
    
    public Login validaLogin(String nomeUser, String senha) {
     Login login = null;       
     for (Cliente cliente : Repositorio.clienteDBFake){
         if(cliente.getNomeUser().equals(nomeUser)&& cliente.getSenha().equals(senha)){
             login = new Login();
             login.setNomeUser(nomeUser);
             login.setSenha(senha);
             login.setEmpresa(false);
         }
         
     }
     for (Empresas empresas : Repositorio.empresasDBFake){
         if(empresas.getNomeUser().equals(nomeUser)&& empresas.getSenha().equals(senha)){
             login = new Login();
             login.setNomeUser(nomeUser);
             login.setSenha(senha);
             login.setEmpresa(true);
         }
     }
       return login;
     
   
    }
  
    
}
