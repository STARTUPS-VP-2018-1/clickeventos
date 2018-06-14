/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.test;

import br.com.clickeventos.business.ClienteBusiness;
import br.com.clickeventos.business.EmpresaBusiness;
import br.com.clickeventos.business.LoginBusiness;
import br.com.clickeventos.business.interfaces.ClienteInterface;
import br.com.clickeventos.business.interfaces.EmpresasInterface;
import br.com.clickeventos.business.interfaces.LoginInterface;
import br.com.clickeventos.dominio.Login;
import br.com.clickeventos.util.Util;
import javax.swing.JOptionPane;

/**
 *
 * @author Kalunga
 */
public class LoginMock {
    
    public static void main (String []agrs){
        
        Login novoLogin = new Login ();
        novoLogin.setNomeUser("Danilo");
        novoLogin.setSenha("teste1234");
        novoLogin.setEmpresa(true);
        
        if(!Util.ValidaLogin(novoLogin.getNomeUser())){
        JOptionPane.showMessageDialog(null, "Usuario invalido");
    }
        LoginInterface loginBusiness = new LoginBusiness();
        ClienteInterface clienteBusiness = new ClienteBusiness();
        EmpresasInterface empresaBusiness = new EmpresaBusiness();
        
        
        if (loginBusiness.validaLogin(novoLogin)){
        if (clienteBusiness.buscarClientePorLogin(novoLogin)!=null){
            JOptionPane.showMessageDialog(null, "Usuario é um Cliente!");
        }
        
        if (empresaBusiness.buscarEmpresasPorLogin(novoLogin)!=null){
             JOptionPane.showMessageDialog(null, "Usuario é uma Empresa!");
        }
        else {
           JOptionPane.showMessageDialog(null, "Usuario não cadastrado!"); 
        }
    }
    
    }
    
}
