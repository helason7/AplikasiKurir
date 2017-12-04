/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.model;

import java.util.Date;

/**
 *
 * @author user
 */
public class PaketModel {
    
    private String noPaket;
    private String destinasi;
    private String jenisBarang;
    private double beratBarang;
    private double hargaBarang;
    private String jenisLayanan;
    private Date tglKirim;
    private boolean asuransi;
    private Dimensi ukuran;

    /**
     * @return the noPaket
     */
    public String getNoPaket() {
        return noPaket;
    }

    /**
     * @param noPaket the noPaket to set
     */
    public void setNoPaket(String noPaket) {
        this.noPaket = noPaket;
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
     * @return the jenisBarang
     */
    public String getJenisBarang() {
        return jenisBarang;
    }

    /**
     * @param jenisBarang the jenisBarang to set
     */
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    /**
     * @return the beratBarang
     */
    public double getBeratBarang() {
        return beratBarang;
    }

    /**
     * @param beratBarang the beratBarang to set
     */
    public void setBeratBarang(double beratBarang) {
        this.beratBarang = beratBarang;
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the jenisLayanan
     */
    public String getJenisLayanan() {
        return jenisLayanan;
    }

    /**
     * @param jenisLayanan the jenisLayanan to set
     */
    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    /**
     * @return the tglKirim
     */
    public Date getTglKirim() {
        return tglKirim;
    }

    /**
     * @param tglKirim the tglKirim to set
     */
    public void setTglKirim(Date tglKirim) {
        this.tglKirim = tglKirim;
    }

    /**
     * @return the asuransi
     */
    public boolean isAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    /**
     * @return the ukuran
     */
    public Dimensi getUkuran() {
        return ukuran;
    }

    /**
     * @param ukuran the ukuran to set
     */
    public void setUkuran(Dimensi ukuran) {
        this.ukuran = ukuran;
    }
    
}
