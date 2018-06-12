/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.dominio;

import java.util.Objects;

/**
 *
 * @author internet
 */
public class TiposDeEventos {
    
    
    private String tipoDeEvento;
    private String periodoDoEvento;
    private Integer quantidadeDeConvidados;
    private String culinaria;
    private String servicosAdicionais;

    public String getTipoDeEvento() {
        return tipoDeEvento;
    }

    public void setTipoDeEvento(String tipoDeEvento) {
        this.tipoDeEvento = tipoDeEvento;
    }

    public String getPeriodoDoEvento() {
        return periodoDoEvento;
    }

    public void setPeriodoDoEvento(String periodoDoEvento) {
        this.periodoDoEvento = periodoDoEvento;
    }

    public Integer getQuantidadeDeConvidados() {
        return quantidadeDeConvidados;
    }

    public void setQuantidadeDeConvidados(Integer quantidadeDeConvidados) {
        this.quantidadeDeConvidados = quantidadeDeConvidados;
    }

    public String getCulinaria() {
        return culinaria;
    }

    public void setCulinaria(String culinaria) {
        this.culinaria = culinaria;
    }

    public String getServicosAdicionais() {
        return servicosAdicionais;
    }

    public void setServicosAdicionais(String servicosAdicionais) {
        this.servicosAdicionais = servicosAdicionais;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.tipoDeEvento);
        hash = 47 * hash + Objects.hashCode(this.periodoDoEvento);
        hash = 47 * hash + Objects.hashCode(this.quantidadeDeConvidados);
        hash = 47 * hash + Objects.hashCode(this.culinaria);
        hash = 47 * hash + Objects.hashCode(this.servicosAdicionais);
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
        final TiposDeEventos other = (TiposDeEventos) obj;
        if (!Objects.equals(this.tipoDeEvento, other.tipoDeEvento)) {
            return false;
        }
        if (!Objects.equals(this.periodoDoEvento, other.periodoDoEvento)) {
            return false;
        }
        if (!Objects.equals(this.culinaria, other.culinaria)) {
            return false;
        }
        if (!Objects.equals(this.servicosAdicionais, other.servicosAdicionais)) {
            return false;
        }
        if (!Objects.equals(this.quantidadeDeConvidados, other.quantidadeDeConvidados)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
