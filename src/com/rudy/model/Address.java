/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.model;

/**
 *
 * @author Rudy
 */
public class Address {

    private String alamat;
    private String kota;
    private String kodePos;
    private String provinsi;
    private String telepon;

    public Address() {
    }

    public Address(String alamatPengirim, String kotaPengirim, String kodePosPengirim, String provinsiPengirim, String teleponPengirim) {
        this.alamat = alamatPengirim;
        this.kota = kotaPengirim;
        this.kodePos = kodePosPengirim;
        this.provinsi = provinsiPengirim;
        this.telepon = teleponPengirim;
    }

    /**
     * @return the AlamatPengirim
     */
    public String getAlamatPengirim() {
        return alamat;
    }

    /**
     * @param AlamatPengirim the alamatPenerima to set
     */
    public void setAlamatPengirim(String alamatPengirim) {
        this.alamat = alamatPengirim;
    }

    /**
     * @return the kotaPenerima
     */
    public String getKotaPengirim() {
        return kota;
    }

    /**
     * @param kotaPenerima the kotaPenerima to set
     */
    public void setKotaPengirim(String kotaPengirim) {
        this.kota = kotaPengirim;
    }

    /**
     * @return the kodePosPengirim
     */
    public String getKodePosPengirim() {
        return kodePos;
    }

    /**
     * @param kodePosPengirim the kodePosPenerima to set
     */
    public void setKodePosPengirim(String kodePosPengirim) {
        this.kodePos = kodePosPengirim;
    }

    /**
     * @return the provinsiPenerima
     */
    public String getProvinsiPengirim() {
        return provinsi;
    }

    /**
     * @param provinsiPenerima the provinsiPenerima to set
     */
    public void setProvinsiPengirim(String provinsiPengirim) {
        this.provinsi = provinsiPengirim;
    }

    /**
     * @return the teleponPengirim
     */
    public String getTeleponPengirim() {
        return telepon;
    }

    /**
     * @param teleponPengirim the teleponPenerima to set
     */
    public void setTeleponPengirim(String teleponPengirim) {
        this.telepon = teleponPengirim;
    }
}
