/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.view;

import com.indocyber.kurir.dao.NomorPaketGenerator;
import com.indocyber.kurir.dao.TarifDAO;
import com.indocyber.kurir.model.TarifModel;
import java.util.List;

/**
 *
 * @author user
 */
public class tes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<TarifModel> cost = TarifDAO.getPaket();
        
        TarifModel find = new TarifModel();
        find.setDestinasi("semarang");
        
        
        for (TarifModel deliveryCost : cost) {
            System.out.println("Kota: " + deliveryCost.getDestinasi()+" tarif: "+deliveryCost.getEkonomis());
        }
        NomorPaketGenerator no = new NomorPaketGenerator();
        String acak = NomorPaketGenerator.generateNomor();
        System.out.println("nomor: "+acak);
    }
    
}
