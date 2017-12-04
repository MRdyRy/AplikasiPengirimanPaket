/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.model;

/**
 *
 * @author Rudy
 */
public class Tarif {
    private String namaProvinsi;
    private String namaKota;
    private double tarifReguler;
    private double tarifKilat;
    private double tarifSds;
    private double tarifOns;
    private double tarifHds;

    public Tarif() {
    }

    public Tarif (String namaKota)
    {
        this.namaKota=namaKota;
    }

    public Tarif (String namaProvinsi,String namaKota)
    {
        this.namaProvinsi = namaKota; 
        this.namaKota = namaKota;
    }
    public Tarif(String namaProvinsi, String namaKota, double tarifReguler, double tarifKilat, double tarifSds, double tarifOns, double tarifHds) {
        this.namaProvinsi = namaProvinsi;
        this.namaKota = namaKota;
        this.tarifReguler = tarifReguler;
        this.tarifKilat = tarifKilat;
        this.tarifSds = tarifSds;
        this.tarifOns = tarifOns;
        this.tarifHds = tarifHds;
    }
    
    
    
    public Tarif(String namaKota, double tarifReguler, double tarifKilat, double tarifSds, double tarifOns, double tarifHds) {
        this.namaKota = namaKota;
        this.tarifReguler = tarifReguler;
        this.tarifKilat = tarifKilat;
        this.tarifSds = tarifSds;
        this.tarifOns = tarifOns;
        this.tarifHds = tarifHds;
    }

    /**
     * @return the namaKota
     */
    public String getNamaKota() {
        return namaKota;
    }

    /**
     * @param namaKota the namaKota to set
     */
    public void setNamaKota(String namaKota) {
        this.namaKota = namaKota;
    }

    /**
     * @return the tarifReguler
     */
    public double getTarifReguler() {
        return tarifReguler;
    }

    /**
     * @param tarifReguler the tarifReguler to set
     */
    public void setTarifReguler(double tarifReguler) {
        this.tarifReguler = tarifReguler;
    }

    /**
     * @return the tarifKilat
     */
    public double getTarifKilat() {
        return tarifKilat;
    }

    /**
     * @param tarifKilat the tarifKilat to set
     */
    public void setTarifKilat(double tarifKilat) {
        this.tarifKilat = tarifKilat;
    }

    /**
     * @return the tarifSds
     */
    public double getTarifSds() {
        return tarifSds;
    }

    /**
     * @param tarifSds the tarifSds to set
     */
    public void setTarifSds(double tarifSds) {
        this.tarifSds = tarifSds;
    }

    /**
     * @return the tarifOns
     */
    public double getTarifOns() {
        return tarifOns;
    }

    /**
     * @param tarifOns the tarifOns to set
     */
    public void setTarifOns(double tarifOns) {
        this.tarifOns = tarifOns;
    }

    /**
     * @return the tarifHds
     */
    public double getTarifHds() {
        return tarifHds;
    }

    /**
     * @param tarifHds the tarifHds to set
     */
    public void setTarifHds(double tarifHds) {
        this.tarifHds = tarifHds;
    }

    /**
     * @return the namaProvinsi
     */
    public String getNamaProvinsi() {
        return namaProvinsi;
    }

    /**
     * @param namaProvinsi the namaProvinsi to set
     */
    public void setNamaProvinsi(String namaProvinsi) {
        this.namaProvinsi = namaProvinsi;
    }

    @Override
    public String toString() {
        return getNamaKota();
    }

    
    
}
