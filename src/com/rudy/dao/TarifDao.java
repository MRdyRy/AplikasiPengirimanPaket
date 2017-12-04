/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.dao;

import com.rudy.model.Tarif;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Rudy
 */
public class TarifDao {

    final String DATAS = "E:/TarifKurir.txt";
    String[] dt;

    public List<String> getLineData() {
        List<String> trf = new ArrayList<>();
        try {
            Scanner ss = new Scanner(new File(DATAS));
//            int i = 0;
            while (ss.hasNextLine()) {
                trf.add(ss.nextLine());
//                this.dt[i] = ss.nextLine();
//                i++;
            }
        } catch (Exception e) {
            
        }
        return trf;
    }

    public Tarif[] getAllTarif() {
        Tarif[] tf = new Tarif[getLineData().size()];
        for (int i = 0; i < getLineData().size(); i++) {
            String[] datatarifsatubaris = getLineData().get(i).split(",");
            String provinsi = datatarifsatubaris[0].toString().trim();
            String kotaTarif = datatarifsatubaris[1].toString().trim();
            double tarifReguler = Double.valueOf(datatarifsatubaris[2].toString());
            double tarifKilat = Double.valueOf(datatarifsatubaris[3].toString());
            double tarifSds = Double.valueOf(datatarifsatubaris[4].toString());
            double tarifOns = Double.valueOf(datatarifsatubaris[5].toString());
            double tarifHds = Double.valueOf(datatarifsatubaris[6].toString());
            tf[i]= new Tarif(provinsi, kotaTarif, tarifReguler, tarifKilat, tarifSds, tarifOns, tarifHds);
//            tf.add(new Tarif(provinsi, kotaTarif, tarifReguler, tarifKilat, tarifSds, tarifOns, tarifHds));
        }
        return tf;
    }

    public List<Tarif> getListKota() {
        List<Tarif> tarif = new ArrayList<>();
        try {
            Scanner baca = new Scanner(new File(DATAS));
            while (baca.hasNextLine()) {
                String data = baca.nextLine();
                String[] dataTarif = data.split(",");
                String provinsi = dataTarif[0].trim();
                String kotaTarif = dataTarif[1].trim();
                double tarifReguler = Double.valueOf(dataTarif[2]);
                double tarifKilat = Double.valueOf(dataTarif[3]);
                double tarifSds = Double.valueOf(dataTarif[4]);
                double tarifOns = Double.valueOf(dataTarif[5]);
                double tarifHds = Double.valueOf(dataTarif[6]);
                tarif.add(new Tarif(provinsi, kotaTarif, tarifReguler, tarifKilat, tarifSds, tarifOns, tarifHds));

            }
        } catch (Exception f) {
            f.printStackTrace();
        }
        return tarif;
    }

    public String[] getKotaArray() {
        String[] datas = new String[getListKota().size()];
        for (int i = 0; i < getListKota().size(); i++) {
            System.out.println(" " + getListKota().get(i).getNamaKota());
            datas[i] = getListKota().get(i).getNamaKota();
        }
        return datas;
    }

    public String[] getProvinsiArray() {
        String[] prov = new String[getListKota().size()];
        for (int i = 0; i < getListKota().size(); i++) {
            prov[i] = getListKota().get(i).getNamaProvinsi();
        }
        return prov;
    }

    public double[] getTarifReguler() {
        double[] trfReguler = new double[getListKota().size()];
        for (int i = 0; i < getListKota().size(); i++) {
            trfReguler[i] = getListKota().get(i).getTarifReguler();
        }
        return trfReguler;
    }

    public double[] getTarifSds() {
        double[] trfSds = new double[getListKota().size()];
        for (int i = 0; i < getListKota().size(); i++) {
            trfSds[i] = getListKota().get(i).getTarifSds();
        }
        return trfSds;
    }

    public double[] getTarifKilat() {
        double[] trfKilat = new double[getListKota().size()];
        for (int i = 0; i < getListKota().size(); i++) {
            trfKilat[i] = getListKota().get(i).getTarifKilat();
        }
        return trfKilat;
    }

    public double[] getTarifOns() {
        double[] trfOns = new double[getListKota().size()];
        for (int i = 0; i < getListKota().size(); i++) {
            trfOns[i] = getListKota().get(i).getTarifOns();
        }
        return trfOns;
    }
    
}
