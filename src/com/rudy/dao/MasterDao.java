/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.dao;

import co.rudy.iface.ifaceMasterData;
import com.rudy.model.Paket;
import com.rudy.model.Tarif;
import com.rudy.model.MasterDataModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MasterDao implements ifaceMasterData {
    SimpleDateFormat sfg = new SimpleDateFormat("dd MMM YYYY");
    final String DATAMASTERTARIF = "E:/TarifKurir.txt";
    final String DATAMASTERPAKET = "E:/MasterPaket.txt";
    List<MasterDataModel> listDataMasterPaket = new ArrayList<>();
    List<MasterDataModel> listDataMasterTarif = new ArrayList<>();

    //return listdataMastermodel buat ditampilin ke masterdata form
    @Override
    public List<MasterDataModel> getAllDataPaket() {
        try {
            Scanner sc = new Scanner(new File(DATAMASTERPAKET));
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String[] dataArr = data.split(",");
                String namaPengirim = dataArr[0];
                String alamatPengirim = dataArr[1];
                String telpPengirim = dataArr[2];
                String namaPenerima = dataArr[3];
                String alamatPenerima = dataArr[4];
                String telpPenerima = dataArr[5];
                String noPaket = dataArr[6];
                String tglKirim = dataArr[7];
                String beratBarang = dataArr[8];
                String jenisLayanan = dataArr[9];
                String asuransi = dataArr[10];
                String jenisbrg = dataArr[11];
                String totalHarga = dataArr[12];

                listDataMasterPaket.add(new MasterDataModel(namaPengirim, alamatPengirim,telpPengirim,
                        namaPenerima, alamatPenerima,telpPenerima,
                        noPaket,tglKirim,beratBarang,jenisLayanan,asuransi,jenisbrg,totalHarga));
            }
        } catch (FileNotFoundException ef) {
        }
        return listDataMasterPaket;
    }

    @Override
    public List<MasterDataModel> getAllDataTarif() {
        try {
            Scanner sc = new Scanner(new File(DATAMASTERTARIF));
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String[] dataArr = data.split(",");
                String provinsi = dataArr[0];
                String kota = dataArr[1];
                String reguler = dataArr[2];
                String kilat = dataArr[3];
                String sds = dataArr[4];
                String ons = dataArr[5];
                String hds = dataArr[6];
                listDataMasterTarif.add(new MasterDataModel(provinsi, kota, reguler, kilat, sds, ons, hds));
            }
        } catch (Exception e) {
        }
        return listDataMasterTarif;
    }

    public List<String> getDataLine() {
        List<String> data = new ArrayList<>();
        try {
            Scanner sv = new Scanner(new File(DATAMASTERTARIF));
            while (sv.hasNextLine()) {
                data.add(sv.nextLine());
            }
        } catch (Exception e) {
        }
        return data;
    }
    
    public Tarif createMasterTarif(String provinsi,String kota, double reguler,double kilat,double sds,double ons,double hds)
    {
        Tarif tf = new Tarif(provinsi, kota, reguler, kilat, sds, ons, hds);
        try{
        String value = tf.getNamaProvinsi()+","+tf.getNamaKota()+","+tf.getTarifReguler()+","+tf.getTarifKilat()+","+tf.getTarifSds()+","+tf.getTarifOns()+","+tf.getTarifHds();
        File file = new File(DATAMASTERTARIF);
        if(!file.exists())
        {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bf = new BufferedWriter(fw);
        Scanner sdh = new Scanner(new File(DATAMASTERTARIF));
        if(sdh.hasNextLine())
        {
            bf.write("\r\n"+value);
            bf.close();
        }else{
            bf.write(value);
            bf.close();
        
        }
        JOptionPane.showMessageDialog(null, "Save Success !","Thank You :)",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return tf;
    }

}
