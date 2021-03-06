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
 * @author internet
 */
public class Empresas extends Login {
    
        
    
    private String nome;
    private String tipoDeEvento;
    private String localizacao;
    private List<Integer> telefones;
    private List<String> emails;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeEvento() {
        return tipoDeEvento;
    }

    public void setTipoDeEvento(String tipoDeEvento) {
        this.tipoDeEvento = tipoDeEvento;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public List<Integer> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Integer> telefones) {
        this.telefones = telefones;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.tipoDeEvento);
        hash = 59 * hash + Objects.hashCode(this.localizacao);
        hash = 59 * hash + Objects.hashCode(this.telefones);
        hash = 59 * hash + Objects.hashCode(this.emails);
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
        final Empresas other = (Empresas) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.tipoDeEvento, other.tipoDeEvento)) {
            return false;
        }
        if (!Objects.equals(this.localizacao, other.localizacao)) {
            return false;
        }
        if (!Objects.equals(this.telefones, other.telefones)) {
            return false;
        }
        if (!Objects.equals(this.emails, other.emails)) {
            return false;
        }
        return true;
    }

}