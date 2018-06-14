/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.business.interfaces;

import java.util.List;
import br.com.clickeventos.dominio.Empresas;
import br.com.clickeventos.dominio.Login;

/**
 *
 * @author internet
 */
public interface EmpresasInterface {
    
    public Empresas salvarEmpresas(Empresas empresas);
    
    public List<Empresas> buscarEmpresasPorNome(String nome);
    
    public List<Empresas> buscarTodasEmpresas();
    
    public Empresas buscarEmpresasPorLogin (Login login );
}

