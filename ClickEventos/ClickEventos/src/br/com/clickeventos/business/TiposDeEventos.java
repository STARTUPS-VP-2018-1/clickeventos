/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.business;

import br.com.clickeventos.business.interfaces.TiposDeEventoInterface;
import java.util.List;

/**
 *
 * @author internet
 */
public class TiposDeEventos implements TiposDeEventoInterface {

    @Override
    public br.com.clickeventos.dominio.TiposDeEventos salvarTiposDeEventos(br.com.clickeventos.dominio.TiposDeEventos tiposDeEventos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<br.com.clickeventos.dominio.TiposDeEventos> buscarTiposDeEventosPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<br.com.clickeventos.dominio.TiposDeEventos> buscarTodosTiposDeEventos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
