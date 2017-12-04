/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.dao;

import com.rudy.model.Address;
import com.rudy.model.Pengirim;

/**
 *
 * @author Rudy
 */
public class PengirimDao {
    Pengirim pkirim;
    public Pengirim createPengirim(String namaPengirim, String alamatPengirim, String kotaPengirim, String kodePosPengirim, String ProvinsiPengirim, String teleponPengirim)
    {
        Pengirim pengirim = new Pengirim(namaPengirim, new Address(alamatPengirim, kotaPengirim, kodePosPengirim, ProvinsiPengirim, teleponPengirim) );
        return pengirim;
    }
}
