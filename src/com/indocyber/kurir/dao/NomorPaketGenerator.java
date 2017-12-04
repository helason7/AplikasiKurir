/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.dao;

/**
 *
 * @author user
 */
public class NomorPaketGenerator {
    
    public static String generateNomor(){
        String nomor = "";
        
        int code = (int) (Math.ceil(Math.random() * 1000) * 1);
        nomor += code;
        return nomor;
    }
}
