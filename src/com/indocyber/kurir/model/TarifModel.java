/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.model;

/**
 *
 * @author user
 */
public class TarifModel {
    
    private String destinasi;
    private double ekonomis;
    private double ons;
    private double sds;
    private double reguler;
    private double hds;

    public TarifModel() {
    }

    public TarifModel(String destinasi, double ekonomis, double ons, double sds, double reguler, double hds) {
        this.destinasi = destinasi;
        this.ekonomis = ekonomis;
        this.ons = ons;
        this.sds = sds;
        this.reguler = reguler;
        this.hds = hds;
    }

    
    /**
     * @return the destinasi
     */
    public String getDestinasi() {
        return destinasi;
    }

    /**
     * @param destinasi the destinasi to set
     */
    public void setDestinasi(String destinasi) {
        this.destinasi = destinasi;
    }

    /**
     * @return the tarifAwal
     */
    public double getEkonomis() {
        return ekonomis;
    }

    /**
     * @param ekonomis the tarifAwal to set
     */
    public void setEkonomis(double ekonomis) {
        this.ekonomis = ekonomis;
    }

    /**
     * @return the ons
     */
    public double getOns() {
        return ons;
    }

    /**
     * @param ons the ons to set
     */
    public void setOns(double ons) {
        this.ons = ons;
    }

    /**
     * @return the sds
     */
    public double getSds() {
        return sds;
    }

    /**
     * @param sds the sds to set
     */
    public void setSds(double sds) {
        this.sds = sds;
    }

    /**
     * @return the reguler
     */
    public double getReguler() {
        return reguler;
    }

    /**
     * @param reguler the reguler to set
     */
    public void setReguler(double reguler) {
        this.reguler = reguler;
    }

    /**
     * @return the hds
     */
    public double getHds() {
        return hds;
    }

    /**
     * @param hds the hds to set
     */
    public void setHds(double hds) {
        this.hds = hds;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
        

}
