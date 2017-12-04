/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.view;

import com.indocyber.kurir.dao.OngkirDAO;
import com.indocyber.kurir.model.Dimensi;
import com.indocyber.kurir.model.PaketModel;
import java.util.Date;

/**
 *
 * @author user
 */
public class kurirtes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimensi dimensi = new Dimensi();
        dimensi.setLebar(0.3);
        dimensi.setPanjang(1.0);
        dimensi.setTinggi(1.0);
        
        PaketModel package2 = new PaketModel();
        package2.setJenisLayanan("sds");
        package2.setDestinasi("semarang");
        package2.setUkuran(dimensi);
        package2.setAsuransi(true);
        package2.setNoPaket("1001");
        package2.setHargaBarang(1000000.0);
        package2.setJenisBarang("document");
        package2.setBeratBarang(2.0);
 //       package2.setPayment("cash");
        package2.setTglKirim(new Date());
        
        OngkirDAO ongkir =  new OngkirDAO();
        double onkirs = ongkir.hitungOngkir(package2);
        
        System.out.println("Biaya pengiriman ke: " + package2.getDestinasi()+ " sebesar: " + onkirs);
        System.out.println("ASuransi: "+ongkir.hitungAsuransi(package2));
        System.out.println("Total Ongkir: "+ongkir.totalOngkir(package2));
    }
    
}
