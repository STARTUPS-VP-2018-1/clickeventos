/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.business;

import br.com.clickeventos.business.interfaces.EmpresasInterface;
import br.com.clickeventos.dominio.Empresas;
import br.com.clickeventos.dominio.Login;
import br.com.clickeventos.repositorio.Repositorio;
import java.util.List;

/**
 *
 * @author internet
 */
public class EmpresaBusiness implements EmpresasInterface{

    @Override
    public Empresas salvarEmpresas(Empresas empresas) {
       if (validarEmpresas (empresas)){
           Repositorio.empresasDBFake.add(empresas);
           System.out.println("Empresa Cadastrada com sucesso" );
       }else{
           System.err.println("Empresa com dados invalidos");
    }
       return null;
    }
    
    @Override
    public List<Empresas> buscarEmpresasPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empresas> buscarTodasEmpresas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    public boolean validarEmpresas(Empresas empresas){
        boolean empresaValida=false;
        if (empresas!=null){
            if (empresas.getNome() != null || !empresas.getNome().equals("")&& !empresas.getTipoDeEvento().equals("")){
               empresaValida=true;
        }
        }
        return empresaValida;
    }

    @Override
    public Empresas buscarEmpresasPorLogin(Login login) {
        for(Empresas empresas: Repositorio.empresasDBFake){
            if(empresas.getNomeUser().equals(login.getNomeUser())){
               return empresas; 
    }
        }
        return null;
    
}
}