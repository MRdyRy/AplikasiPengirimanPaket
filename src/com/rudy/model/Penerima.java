/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.model;

/**
 *
 * @author Rudy
 */
public class Penerima {
    private String namaPenerima;
    private Address alamat;

    public Penerima() {
    }

    public Penerima(String namaPenerima, Address alamat) {
        this.namaPenerima = namaPenerima;
        this.alamat = alamat;
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
     * @return the alamat
     */
    public Address getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(Address alamat) {
        this.alamat = alamat;
    }
    
}
