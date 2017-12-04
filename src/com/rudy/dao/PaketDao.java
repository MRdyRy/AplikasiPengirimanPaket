/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.dao;

import co.rudy.iface.ifaceMasterData;
import com.rudy.model.*;
import java.util.Date;

/**
 *
 * @author Rudy
 */
public class PaketDao{
    Paket paket;
    Tarif tarif;
    Pengirim pengirim;
    Penerima penerima;
    final double ASURANSI = 0.03;
    public Paket kirimPaket(Pengirim pengirim, Penerima penerima, Date tglKirim, String nomorPaket, String jenisBarang, double beratBarang, String dimensiBarang, double hargaBarang, String jenisLayanan, String isAsuransi, String pembayaran,double biaya)
    {
        double totalBiaya = 0.0;
        if(isAsuransi.equalsIgnoreCase("ya"))
        {
            totalBiaya = (beratBarang*biaya)+(hargaBarang*ASURANSI);
        }else
        {
            totalBiaya = beratBarang * biaya;
        }
        
        paket = new Paket(
                new Pengirim(pengirim.getNamaPengirim(),
                new Address(pengirim.getAlamatPengirim().getAlamatPengirim()
                        ,pengirim.getAlamatPengirim().getKotaPengirim()
                        ,pengirim.getAlamatPengirim().getKodePosPengirim()
                        ,pengirim.getAlamatPengirim().getProvinsiPengirim()
                        ,pengirim.getAlamatPengirim().getTeleponPengirim()))
                ,new Penerima(penerima.getNamaPenerima(),
                 new Address(penerima.getAlamat().getAlamatPengirim()
                        ,penerima.getAlamat().getKotaPengirim()
                        ,penerima.getAlamat().getKodePosPengirim()
                        ,penerima.getAlamat().getProvinsiPengirim()
                        ,penerima.getAlamat().getTeleponPengirim()))
                ,tglKirim,nomorPaket,jenisBarang,beratBarang,dimensiBarang,hargaBarang,jenisLayanan,isAsuransi,pembayaran,totalBiaya);
       
        return paket;
    }

}
