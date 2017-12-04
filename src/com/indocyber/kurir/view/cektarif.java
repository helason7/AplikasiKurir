/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.view;

import com.indocyber.kurir.dao.CekTarifDAO;
import com.indocyber.kurir.model.TarifModel;

/**
 *
 * @author user
 */
public class cektarif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TarifModel tm = new TarifModel();
        tm.setDestinasi("semarang");
        
        CekTarifDAO  cek = new CekTarifDAO();
        cek.findEco(tm);
        
        System.out.println("tes: "+cek.findEco(tm));
    }
    
}
