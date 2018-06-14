/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clickeventos.util;

/**
 *
 * @author Kalunga
 */
public class Util {
    
    
    public static boolean ValidaLogin(String login){
    if (login.contains("@")||login.contains("_")){
        return false;
    }
    return true;
}
}
