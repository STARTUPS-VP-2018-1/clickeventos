/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Buffet;

import java.util.Objects;

/**
 *
 * @author Kalunga
 */
public class Buffet {
    
    private String name;
    private String tipoDeEvento;
    private String localização;
    private String email;
    private double contato;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipoDeEvento() {
        return tipoDeEvento;
    }

    public void setTipoDeEvento(String tipoDeEvento) {
        this.tipoDeEvento = tipoDeEvento;
    }

    public String getLocalização() {
        return localização;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getContato() {
        return contato;
    }

    public void setContato(double contato) {
        this.contato = contato;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.tipoDeEvento);
        hash = 53 * hash + Objects.hashCode(this.localização);
        hash = 53 * hash + Objects.hashCode(this.email);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.contato) ^ (Double.doubleToLongBits(this.contato) >>> 32));
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
        final Buffet other = (Buffet) obj;
        if (Double.doubleToLongBits(this.contato) != Double.doubleToLongBits(other.contato)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.tipoDeEvento, other.tipoDeEvento)) {
            return false;
        }
        if (!Objects.equals(this.localização, other.localização)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
    
    
}
