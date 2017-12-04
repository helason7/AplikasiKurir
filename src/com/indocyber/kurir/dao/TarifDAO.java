/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.dao;

import com.indocyber.kurir.model.PaketModel;
import com.indocyber.kurir.model.TarifModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class TarifDAO {
    
    public TarifModel getKota(String kota){
        TarifModel city =  new TarifModel();
        try {
            Scanner scan;
            scan = new Scanner(new File(PaketModel.class.getResource("/com/indocyber/kurir/asset/tarif.txt").getFile()));
            
            while (scan.hasNextLine()){
                String next = scan.nextLine();
                String[] data =  next.split(",");
                
                if(data[0].equalsIgnoreCase(kota)){
                    city.setDestinasi(data[0]);
                    city.setEkonomis(Double.parseDouble(data[1]));
                    city.setHds(Double.parseDouble(data[2]));
                    city.setOns(Double.parseDouble(data[3]));
                    city.setSds(Double.parseDouble(data[4]));
                    city.setEkonomis(Double.parseDouble(data[5]));
                    city.setEkonomis(Double.parseDouble(data[1]));
                    
                    break;
                    
                }
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } return  city;
    }
    
    public static List<TarifModel> getPaket(){
        List<TarifModel> paketList = new ArrayList<>();
        
        try {
//           Scanner scan = new Scanner(new File("C:/Java/Latihan/tarif.txt"));
            Scanner scan = new Scanner(new File(PaketModel.class.getResource("/com/indocyber/kurir/asset/tarif.txt").getFile()));
            while (scan.hasNextLine()) {
                String next = scan.nextLine();
                String[]data = next.split(",");
                
                TarifModel paket = new TarifModel();
                paket.setDestinasi(data[0]);
                paket.setEkonomis(Double.parseDouble(data[1]));
                paket.setReguler(Double.parseDouble(data[2]));
                paket.setHds(Double.parseDouble(data[3]));
                paket.setOns(Double.parseDouble(data[4]));
                paket.setSds(Double.parseDouble(data[5]));
                
                paketList.add(paket);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TarifModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return paketList;
    }
  
}
