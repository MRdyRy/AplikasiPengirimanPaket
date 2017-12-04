/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.dao;

import com.rudy.model.Address;
import com.rudy.model.Penerima;

/**
 *
 * @author Rudy
 */
public class PenerimaDao {

    Penerima pnerima;

    public Penerima createPenerima(String namaPenerima, String alamatPenerima, String kotaPenerima, String kodePosPenerima, String ProvinsiPenerima, String teleponPenenrima) {
        Penerima penerima = new Penerima(namaPenerima, new Address(alamatPenerima, kotaPenerima, kodePosPenerima, ProvinsiPenerima, teleponPenenrima));
        return penerima;
    }
}
