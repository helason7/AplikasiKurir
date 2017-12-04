/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.dao;

import com.indocyber.kurir.model.PaketModel;
import com.indocyber.kurir.model.TarifModel;
import java.util.List;

/**
 *
 * @author user
 */
public class OngkirDAO {
     
    final double asuransi = 0.03;
    public double hitungOngkir(PaketModel paket){
         Double biaya = 0.0;
        
        Double tarif;
        Double berat = paket.getBeratBarang();
        
        List<TarifModel> tarifList = TarifDAO.getPaket();
        
        for (TarifModel tarifPaket : tarifList) {
            
            if(tarifPaket.getDestinasi().equalsIgnoreCase(paket.getDestinasi())){
                if(paket.getJenisLayanan().equalsIgnoreCase("reguler")){
                    tarif = tarifPaket.getReguler();
                        biaya = tarif * berat;
                }
                else if(paket.getJenisLayanan().equalsIgnoreCase("ekonomis")){
                    tarif = tarifPaket.getEkonomis();
                        biaya = tarif * berat;
                }
                else if(paket.getJenisLayanan().equalsIgnoreCase("ons")){
                    tarif = tarifPaket.getOns();
                        biaya = tarif * berat;
                }
                else if(paket.getJenisLayanan().equalsIgnoreCase("sds")){
                    tarif = tarifPaket.getSds();
                        biaya = tarif * berat;
                }
                else if(paket.getDestinasi().equalsIgnoreCase("hds")){
                    tarif = tarifPaket.getHds();
                        biaya = tarif * berat;
                }
            }

        }
        
        return biaya;
    }
    
    public double hitungAsuransi(PaketModel paket){
        return paket.getHargaBarang() * asuransi;
    }
    
    public double totalOngkir(PaketModel paket){
        return hitungOngkir(paket)+hitungAsuransi(paket);
    }
}
