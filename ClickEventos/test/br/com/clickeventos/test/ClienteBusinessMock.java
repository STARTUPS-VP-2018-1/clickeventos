/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.test;

import br.com.clickeventos.business.ClienteBusiness;
import br.com.clickeventos.dominio.Cliente;
import java.util.ArrayList;

/**
 *
 * @author internet
 */
public class ClienteBusinessMock {
    
    public static void main (String []agrs){
    
        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Leonardo");
        novoCliente.setSobrenome("Santos");
        novoCliente.setLocalizacao("Av Anhanha Mello");
        novoCliente.setTipoDeEvento("Aniversário");
        
       novoCliente.setTelefones(new ArrayList<Integer>());
       
       novoCliente.getTelefones().add(20202020);
       novoCliente.getTelefones().add(981848585);
       novoCliente.getTelefones().add(980805050);
     
      
       
       novoCliente.setEmails(new ArrayList<String>());
       
       novoCliente.getEmails().add("email.email@gmail.com");
       novoCliente.getEmails().add("email.email@hotmail.com");
       novoCliente.getEmails().add("email.email@terra.com");
       
       ClienteBusiness clienteBusiness = new ClienteBusiness();
       
       try {
           clienteBusiness.salvarCliente(novoCliente);
       }catch(UnsupportedOperationException exc){
           System.out.println(exc.getMessage());
         
    
       }
       }    
}
