/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.repositorio;

import br.com.clickeventos.dominio.Cliente;
import br.com.clickeventos.dominio.Empresas;
import br.com.clickeventos.dominio.TiposDeEventos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author internet
 */
public class Repositorio {
    
    public static List<TiposDeEventos> TiposDeEventosDBFake = new ArrayList<TiposDeEventos>();
    public static List<Cliente> clienteDBFake = new ArrayList<Cliente>();
    public static List<Empresas> empresasDBFake = new ArrayList<Empresas>();
    
    
    static {
        Cliente novoCliente = new Cliente ();
        novoCliente.setNomeUser("Leonardo");
        novoCliente.setSenha("teste123");
        
        Cliente novoCliente2= new Cliente("Lucas", "teste123");
        
        Empresas novasEmpresas=new Empresas("Buffet","teste123");
        
        Empresas novasEmpresas2 = new Empresas();
        novasEmpresas2.setNome("ChacaraBrasil");
        novasEmpresas2.setSenha("teste123");
      
        clienteDBFake.add(novoCliente);
        clienteDBFake.add(novoCliente2);
        empresasDBFake.add(novasEmpresas);
        empresasDBFake.add(novasEmpresas2);
        
        
    }
  
}
