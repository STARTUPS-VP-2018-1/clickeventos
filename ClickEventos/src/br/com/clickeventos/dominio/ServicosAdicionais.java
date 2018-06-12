/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.dominio;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Kalunga
 */
public class ServicosAdicionais {
    
    
private List<String> locacaoVeiculos;
private String locaoHelicoptero;
private List<String> contratoDeBandas;
private List<String> contratoDeDjs;
private String outros;

    public List<String> getLocacaoVeiculos() {
        return locacaoVeiculos;
    }

    public void setLocacaoVeiculos(List<String> locacaoVeiculos) {
        this.locacaoVeiculos = locacaoVeiculos;
    }

    public String getLocaoHelicoptero() {
        return locaoHelicoptero;
    }

    public void setLocaoHelicoptero(String locaoHelicoptero) {
        this.locaoHelicoptero = locaoHelicoptero;
    }

    public List<String> getContratoDeBandas() {
        return contratoDeBandas;
    }

    public void setContratoDeBandas(List<String> contratoDeBandas) {
        this.contratoDeBandas = contratoDeBandas;
    }

    public List<String> getContratoDeDjs() {
        return contratoDeDjs;
    }

    public void setContratoDeDjs(List<String> contratoDeDjs) {
        this.contratoDeDjs = contratoDeDjs;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.locacaoVeiculos);
        hash = 67 * hash + Objects.hashCode(this.locaoHelicoptero);
        hash = 67 * hash + Objects.hashCode(this.contratoDeBandas);
        hash = 67 * hash + Objects.hashCode(this.contratoDeDjs);
        hash = 67 * hash + Objects.hashCode(this.outros);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ServicosAdicionais other = (ServicosAdicionais) obj;
        if (!Objects.equals(this.locaoHelicoptero, other.locaoHelicoptero)) {
            return false;
        }
        if (!Objects.equals(this.outros, other.outros)) {
            return false;
        }
        if (!Objects.equals(this.locacaoVeiculos, other.locacaoVeiculos)) {
            return false;
        }
        if (!Objects.equals(this.contratoDeBandas, other.contratoDeBandas)) {
            return false;
        }
        if (!Objects.equals(this.contratoDeDjs, other.contratoDeDjs)) {
            return false;
        }
        return true;
    }

}