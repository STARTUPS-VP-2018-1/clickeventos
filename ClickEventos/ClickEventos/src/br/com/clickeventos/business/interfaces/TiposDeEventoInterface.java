/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.business.interfaces;

import br.com.clickeventos.dominio.TiposDeEventos;
import java.util.List;

/**
 *
 * @author internet
 */
public interface TiposDeEventoInterface {
    
    
    
    public TiposDeEventos salvarTiposDeEventos(TiposDeEventos tiposDeEventos);
    
    public List<TiposDeEventos> buscarTiposDeEventosPorNome(String nome);
    
    public List<TiposDeEventos> buscarTodosTiposDeEventos();
}
