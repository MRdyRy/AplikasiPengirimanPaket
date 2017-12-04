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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MasterDao implements ifaceMasterData {

    final String DATAMASTERTARIF = "E:/TarifKurir.txt";
    final String DATAMASTERPAKET = "E:/MasterPaket.txt";
    List<MasterDataModel> listDataMasterPaket = new ArrayList<>();

    //return listdataMastermodel buat ditampilin ke masterdata form
    
    @Override
    public List<MasterDataModel> getAllDataPaket() {
        try {
            Scanner sc = new Scanner(new File(DATAMASTERPAKET));
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String [] dataArr = data.split(",");
                String namaPengirim = dataArr[0];
                String alamatPengirim = dataArr[1];
                String kotapengirim = dataArr[2];
                String provinsiPengirim = dataArr[3];
                String telpPengirim = dataArr[4];
                String namaPenerima = dataArr[5];
                String alamatPenerima = dataArr[6];
                String kotaPenerima = dataArr[7];
                String provinsiPenerima = dataArr[8];
                String telpPenerima = dataArr[9];
                String noPaket = dataArr[10];
                String jenisbrg = dataArr[11];
                String beratBarang = dataArr[12];
                String tglKirim = dataArr[13];
                String dimensiPaket = dataArr[14];
                String hargaBarang = dataArr[15];
                String pembayaran = dataArr[16];
                String jenisLayanan = dataArr[17];
                String asuransi = dataArr[18];
                String totalHarga = dataArr[19];
                listDataMasterPaket.add(new MasterDataModel(namaPengirim,alamatPengirim,kotapengirim,provinsiPengirim,telpPengirim
                                        ,namaPenerima,alamatPenerima,kotaPenerima,provinsiPenerima,telpPenerima
                                        ,noPaket,jenisbrg,beratBarang,tglKirim,dimensiPaket,hargaBarang,pembayaran,jenisLayanan,asuransi,totalHarga));
            }
        } catch (FileNotFoundException ef) {
        }
        return listDataMasterPaket;
        }

    @Override
    public Tarif[] getAllDataTarif() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
