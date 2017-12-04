/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.model;

/**
 *
 * @author Rudy
 */
public class Pengirim {
    private String namaPengirim;
    private Address alamatPengirim;

    public Pengirim() {
    }

    public Pengirim(String namaPengirim, Address alamatPengirim) {
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
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
    public Address getAlamatPengirim() {
        return alamatPengirim;
    }

    /**
     * @param alamatPengirim the alamatPengirim to set
     */
    public void setAlamatPengirim(Address alamatPengirim) {
        this.alamatPengirim = alamatPengirim;
    }
}
