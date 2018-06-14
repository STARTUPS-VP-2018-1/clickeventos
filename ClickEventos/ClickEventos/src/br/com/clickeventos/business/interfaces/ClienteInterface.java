/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.business.interfaces;

import br.com.clickeventos.dominio.Cliente;
import br.com.clickeventos.dominio.Login;
import java.util.List;

/**
 *
 * @author internet
 */
public interface ClienteInterface {
    public Cliente salvarCliente(Cliente cliente);
   
    public List<Cliente> buscarClientePorNome(String nome);
    
    public List<Cliente> buscarTodosClienteS();
    
    public Cliente buscarClientePorLogin (Login login);
}


