/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.dao;

import com.indocyber.kurir.model.KotaProvinsi;
import com.indocyber.kurir.model.PaketModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ProvinsiDAO {
    
    public static List<KotaProvinsi> getKotaProvinsi(){
        List<KotaProvinsi> List = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(PaketModel.class.getResource("/com/indocyber/kurir/asset/dataProvinsi.txt").getFile()));
            while (sc.hasNextLine()){
                String next = sc.nextLine();
                String[] data = next.split(",");
                
                KotaProvinsi kp = new KotaProvinsi();
                kp.setProvinsi(data[0]);
                kp.setKota(data[1]);
                
                List.add(kp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return List;
    }
    

}
