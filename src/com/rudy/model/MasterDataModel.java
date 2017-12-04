/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.model;

import co.rudy.iface.ifaceMasterData;

/**
 *
 * @author user
 */
public class MasterDataModel{

    private String namaPengirim;
    private String alamatPengirim;
    private String kotapengirim;
    private String provinsiPengirim;
    private String telpPengirim;
    private String namaPenerima;
    private String alamatPenerima;
    private String kotaPenerima;
    private String provinsiPenerima;
    private String telpPenerima;
    private String noPaket;
    private String jenisbrg;
    private String beratBarang;
    private String tglKirim;
    private String dimensiPaket;
    private String hargaBarang;
    private String pembayaran;
    private String jenisLayanan;
    private String asuransi;
    private String totalHarga;

    public MasterDataModel() {
    }

    public MasterDataModel(String namaPengirim, String alamatPengirim, String kotapengirim, String provinsiPengirim, String telpPengirim, String namaPenerima, String alamatPenerima, String kotaPenerima, String provinsiPenerima, String telpPenerima, String noPaket, String jenisbrg, String beratBarang, String tglKirim, String dimensiPaket, String hargaBarang, String pembayaran, String jenisLayanan, String asuransi, String totalHarga) {
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.kotapengirim = kotapengirim;
        this.provinsiPengirim = provinsiPengirim;
        this.telpPengirim = telpPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.kotaPenerima = kotaPenerima;
        this.provinsiPenerima = provinsiPenerima;
        this.telpPenerima = telpPenerima;
        this.noPaket = noPaket;
        this.jenisbrg = jenisbrg;
        this.beratBarang = beratBarang;
        this.tglKirim = tglKirim;
        this.dimensiPaket = dimensiPaket;
        this.hargaBarang = hargaBarang;
        this.pembayaran = pembayaran;
        this.jenisLayanan = jenisLayanan;
        this.asuransi = asuransi;
        this.totalHarga = totalHarga;
    }

    
    /**
     * @return the namaPengirim
     */
    public String getNamaPengirim() {
        return namaPengirim;
    }

    /**
     * @param namaPengirim the namaPengirim to set
     */
    public void setNamaPengirim(String namaPengirim) {
        this.namaPengirim = namaPengirim;
    }

    /**
     * @return the alamatPengirim
     */
    public String getAlamatPengirim() {
        return alamatPengirim;
    }

    /**
     * @param alamatPengirim the alamatPengirim to set
     */
    public void setAlamatPengirim(String alamatPengirim) {
        this.alamatPengirim = alamatPengirim;
    }

    /**
     * @return the kotapengirim
     */
    public String getKotapengirim() {
        return kotapengirim;
    }

    /**
     * @param kotapengirim the kotapengirim to set
     */
    public void setKotapengirim(String kotapengirim) {
        this.kotapengirim = kotapengirim;
    }

    /**
     * @return the provinsiPengirim
     */
    public String getProvinsiPengirim() {
        return provinsiPengirim;
    }

    /**
     * @param provinsiPengirim the provinsiPengirim to set
     */
    public void setProvinsiPengirim(String provinsiPengirim) {
        this.provinsiPengirim = provinsiPengirim;
    }

    /**
     * @return the telpPengirim
     */
    public String getTelpPengirim() {
        return telpPengirim;
    }

    /**
     * @param telpPengirim the telpPengirim to set
     */
    public void setTelpPengirim(String telpPengirim) {
        this.telpPengirim = telpPengirim;
    }

    /**
     * @return the namaPenerima
     */
    public String getNamaPenerima() {
        return namaPenerima;
    }

    /**
     * @param namaPenerima the namaPenerima to set
     */
    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }

    /**
     * @return the alamatPenerima
     */
    public String getAlamatPenerima() {
        return alamatPenerima;
    }

    /**
     * @param alamatPenerima the alamatPenerima to set
     */
    public void setAlamatPenerima(String alamatPenerima) {
        this.alamatPenerima = alamatPenerima;
    }

    /**
     * @return the kotaPenerima
     */
    public String getKotaPenerima() {
        return kotaPenerima;
    }

    /**
     * @param kotaPenerima the kotaPenerima to set
     */
    public void setKotaPenerima(String kotaPenerima) {
        this.kotaPenerima = kotaPenerima;
    }

    /**
     * @return the provinsiPenerima
     */
    public String getProvinsiPenerima() {
        return provinsiPenerima;
    }

    /**
     * @param provinsiPenerima the provinsiPenerima to set
     */
    public void setProvinsiPenerima(String provinsiPenerima) {
        this.provinsiPenerima = provinsiPenerima;
    }

    /**
     * @return the telpPenerima
     */
    public String getTelpPenerima() {
        return telpPenerima;
    }

    /**
     * @param telpPenerima the telpPenerima to set
     */
    public void setTelpPenerima(String telpPenerima) {
        this.telpPenerima = telpPenerima;
    }

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
     * @return the jenisbrg
     */
    public String getJenisbrg() {
        return jenisbrg;
    }

    /**
     * @param jenisbrg the jenisbrg to set
     */
    public void setJenisbrg(String jenisbrg) {
        this.jenisbrg = jenisbrg;
    }

    /**
     * @return the beratBarang
     */
    public String getBeratBarang() {
        return beratBarang;
    }

    /**
     * @param beratBarang the beratBarang to set
     */
    public void setBeratBarang(String beratBarang) {
        this.beratBarang = beratBarang;
    }

    /**
     * @return the tglKirim
     */
    public String getTglKirim() {
        return tglKirim;
    }

    /**
     * @param tglKirim the tglKirim to set
     */
    public void setTglKirim(String tglKirim) {
        this.tglKirim = tglKirim;
    }

    /**
     * @return the dimensiPaket
     */
    public String getDimensiPaket() {
        return dimensiPaket;
    }

    /**
     * @param dimensiPaket the dimensiPaket to set
     */
    public void setDimensiPaket(String dimensiPaket) {
        this.dimensiPaket = dimensiPaket;
    }

    /**
     * @return the hargaBarang
     */
    public String getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(String hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the pembayaran
     */
    public String getPembayaran() {
        return pembayaran;
    }

    /**
     * @param pembayaran the pembayaran to set
     */
    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
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
     * @return the asuransi
     */
    public String getAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(String asuransi) {
        this.asuransi = asuransi;
    }

    /**
     * @return the totalHarga
     */
    public String getTotalHarga() {
        return totalHarga;
    }

    /**
     * @param totalHarga the totalHarga to set
     */
    public void setTotalHarga(String totalHarga) {
        this.totalHarga = totalHarga;
    }
}
