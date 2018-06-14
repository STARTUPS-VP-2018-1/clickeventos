/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.test;

import br.com.clickeventos.business.ServicosAdicionaisBusiness;
import br.com.clickeventos.dominio.ServicosAdicionais;
import java.util.ArrayList;

/**
 *
 * @author Kalunga
 */
public class ServicosAdicionaisMock {
    
    
    public static void main (String[]agrs){
        
        
        ServicosAdicionais servicosAdicionais = new ServicosAdicionais();
        
        servicosAdicionais.setLocacaoVeiculos(new ArrayList<String>());
        servicosAdicionais.getLocacaoVeiculos().add("Limosine");
        
        servicosAdicionais.setContratoDeBandas(new ArrayList <String>());
        
        servicosAdicionais.getContratoDeBandas().add("Jorge e Mateus");
        servicosAdicionais.getContratoDeBandas().add("Simone e Silmara");
        
        servicosAdicionais.setOutros("Entrega dos presentes no domicilio");
        
        ServicosAdicionaisBusiness servicosAdicionaisBusiness= new ServicosAdicionaisBusiness();
        
        try {
            servicosAdicionaisBusiness.salvarServicos(servicosAdicionais);
        } catch (UnsupportedOperationException exc) {
            System.out.println(exc.getMessage());
        }
        
        
    }
    
}
