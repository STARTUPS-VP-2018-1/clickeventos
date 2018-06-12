/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.business.interfaces;

import br.com.clickeventos.dominio.ServicosAdicionais;
import java.util.List;

/**
 *
 * @author Kalunga
 */
public interface ServicosAdicionaisInterface {
    
    public ServicosAdicionais salvarServicos(ServicosAdicionais nome);
    public List<ServicosAdicionais> buscarBandaPorNome(String nome);
    public List<ServicosAdicionais> buscarDjPorNome(String nome);
  
    
    
    
}
