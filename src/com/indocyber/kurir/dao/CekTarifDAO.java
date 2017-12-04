/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.dao;

import com.indocyber.kurir.model.TarifModel;

/**
 *
 * @author user
 */
public class CekTarifDAO {

    private double berat;
    /**
     * @return the berat
     */
    public double getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(double berat) {
        this.berat = berat;
    }
    
    public  String findKota(TarifModel tm){
        return tm.getDestinasi();
    }
    public  double findOns(TarifModel tm){
        return tm.getOns();
    }
    public  double findHds(TarifModel tm){
        return tm.getHds();
    }
    public  double findEco(TarifModel tm){
        return tm.getEkonomis();
    }
    public  double findReg(TarifModel tm){
        return tm.getReguler();
    }
    public  double findSds(TarifModel tm){
        return tm.getSds();
    }
}
