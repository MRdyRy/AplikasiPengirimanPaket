/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.model;

import java.util.Date;

/**
 *
 * @author Rudy
 */
public class Paket {
    private Pengirim pengirim;
    private Penerima penerima;
    private Date tglKirim;
    private String nomorPaket;
    private String jenisBarang;
    private double beratBarang;
    private String dimensiBarang;
    private double hargaBarang;
    private String jenisLayanan;
    private String isAsuransi;
    private String pembayaran;
    private double totalBiayaKirim;

    public Paket() {
    }

    public Paket(Pengirim pengirim, Penerima penerima, Date tglKirim, String nomorPaket, String jenisBarang, double beratBarang, String dimensiBarang, double hargaBarang, String jenisLayanan, String isAsuransi, String pembayaran) {
        this.pengirim = pengirim;
        this.penerima = penerima;
        this.tglKirim = tglKirim;
        this.nomorPaket = nomorPaket;
        this.jenisBarang = jenisBarang;
        this.beratBarang = beratBarang;
        this.dimensiBarang = dimensiBarang;
        this.hargaBarang = hargaBarang;
        this.jenisLayanan = jenisLayanan;
        this.isAsuransi = isAsuransi;
        this.pembayaran = pembayaran;
    }

    public Paket(Pengirim pengirim, Penerima penerima, Date tglKirim, String nomorPaket, String jenisBarang, double beratBarang, String dimensiBarang, double hargaBarang, String jenisLayanan, String isAsuransi, String pembayaran, double totalBiayaKirim) {
        this.pengirim = pengirim;
        this.penerima = penerima;
        this.tglKirim = tglKirim;
        this.nomorPaket = nomorPaket;
        this.jenisBarang = jenisBarang;
        this.beratBarang = beratBarang;
        this.dimensiBarang = dimensiBarang;
        this.hargaBarang = hargaBarang;
        this.jenisLayanan = jenisLayanan;
        this.isAsuransi = isAsuransi;
        this.pembayaran = pembayaran;
        this.totalBiayaKirim = totalBiayaKirim;
    }
    

    
    /**
     * @return the pengirim
     */
    public Pengirim getPengirim() {
        return pengirim;
    }

    /**
     * @param pengirim the pengirim to set
     */
    public void setPengirim(Pengirim pengirim) {
        this.pengirim = pengirim;
    }

    /**
     * @return the penerima
     */
    public Penerima getPenerima() {
        return penerima;
    }

    /**
     * @param penerima the penerima to set
     */
    public void setPenerima(Penerima penerima) {
        this.penerima = penerima;
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
     * @return the nomorPaket
     */
    public String getNomorPaket() {
        return nomorPaket;
    }

    /**
     * @param nomorPaket the nomorPaket to set
     */
    public void setNomorPaket(String nomorPaket) {
        this.nomorPaket = nomorPaket;
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
     * @return the dimensiBarang
     */
    public String getDimensiBarang() {
        return dimensiBarang;
    }

    /**
     * @param dimensiBarang the dimensiBarang to set
     */
    public void setDimensiBarang(String dimensiBarang) {
        this.dimensiBarang = dimensiBarang;
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
     * @return the isAsuransi
     */
    public String getIsAsuransi() {
        return isAsuransi;
    }

    /**
     * @param isAsuransi the isAsuransi to set
     */
    public void setIsAsuransi(String isAsuransi) {
        this.isAsuransi = isAsuransi;
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
     * @return the totalBiayaKirim
     */
    public double getTotalBiayaKirim() {
        return totalBiayaKirim;
    }

    /**
     * @param totalBiayaKirim the totalBiayaKirim to set
     */
    public void setTotalBiayaKirim(double totalBiayaKirim) {
        this.totalBiayaKirim = totalBiayaKirim;
    }
    
}
