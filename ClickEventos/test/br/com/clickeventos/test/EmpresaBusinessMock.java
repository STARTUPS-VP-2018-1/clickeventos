/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.test;

import br.com.clickeventos.business.EmpresaBusiness;
import br.com.clickeventos.dominio.Empresas;
import java.util.ArrayList;

/**
 *
 * @author Kalunga
 */
public class EmpresaBusinessMock {

    public static void main (String [] agrs){
        
        Empresas novasEmpresas = new Empresas ();
        
        novasEmpresas.setNome("Buffet 1");
        novasEmpresas.setTipoDeEvento("Aniversários");
        novasEmpresas.setLocalizacao("Av AnhanhaMello nº 1");
        
        novasEmpresas.setEmails( new ArrayList <String>());
        
        novasEmpresas.getEmails().add("Buffet1@gmail.com");
        novasEmpresas.getEmails().add("Buffet1@hotmail.com");
        novasEmpresas.getEmails().add("Buffet1-contato@gmail.com");
        
        novasEmpresas.setTelefones(new ArrayList<Integer>());
        
        novasEmpresas.getTelefones().add(20100011);
        novasEmpresas.getTelefones().add(21211212);
        novasEmpresas.getTelefones().add(20201919);
        
        EmpresaBusiness empresaBusiness=new EmpresaBusiness();
        
        try {
            empresaBusiness.salvarEmpresas(novasEmpresas);
        } catch (UnsupportedOperationException exc) {
            System.out.println(exc.getMessage());
        }
        
        
        
        
        
    }    
    
}
