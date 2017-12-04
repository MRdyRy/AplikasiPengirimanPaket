/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.dao;

import co.rudy.iface.ifaceMasterData;
import com.rudy.model.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
    final String DATAS = "E:/MasterPaket.txt";
    public Paket kirimPaket(Pengirim pengirim, Penerima penerima, Date tglKirim, String nomorPaket, String jenisBarang, double beratBarang, String dimensiBarang, double hargaBarang, String jenisLayanan, String isAsuransi, String pembayaran,double biaya) throws IOException
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
       
        File file = new File(DATAS);
        String value = paket.getPengirim().getNamaPengirim()+","+paket.getPengirim().getAlamatPengirim().getAlamatPengirim()
                +","+paket.getPengirim().getAlamatPengirim().getTeleponPengirim()
                +","+paket.getPenerima().getNamaPenerima()+","+paket.getPenerima().getAlamat().getAlamatPengirim()
                +","+paket.getPenerima().getAlamat().getTeleponPengirim()
                +","+paket.getNomorPaket()
                +","+paket.getTglKirim()+","+paket.getBeratBarang()+","+paket.getJenisLayanan()+","+paket.getIsAsuransi()
                +","+paket.getJenisBarang()+","+paket.getTotalBiayaKirim();
        if(!file.exists())
        {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bf = new BufferedWriter(fw);
        Scanner sdh = new Scanner(new File(DATAS));
        if(sdh.hasNextLine())
        {
            bf.write("\r\n"+value);
            bf.close();
        }else{
            bf.write(value);
            bf.close();
        }
        JOptionPane.showMessageDialog(null, "Save Success !","Thank You :)",JOptionPane.INFORMATION_MESSAGE);
        return paket;
    }

}
