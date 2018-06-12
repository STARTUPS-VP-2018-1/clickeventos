/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.business;

import br.com.clickeventos.business.interfaces.ServicosAdicionaisInterface;
import br.com.clickeventos.dominio.ServicosAdicionais;
import java.util.List;

/**
 *
 * @author Kalunga
 */
public class ServicosAdicionaisBusiness implements ServicosAdicionaisInterface{

    @Override
    public ServicosAdicionais salvarServicos(ServicosAdicionais servicosAdicionais) {
        if (validarServicos(servicosAdicionais)){
           System.out.println("Servico salvo");
    }else{
        System.err.println("Não encontrado");
        }
        return null;
}


    @Override
    public List<ServicosAdicionais> buscarBandaPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ServicosAdicionais> buscarDjPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public boolean validarServicos(ServicosAdicionais servicosAdicionais){
    boolean servicoValido=false;
    if (servicosAdicionais != null){
        servicoValido=true;
    }
    return servicoValido;
    
    
    
    
    
}
   
}
