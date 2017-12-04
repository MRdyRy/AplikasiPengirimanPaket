/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.dao;

import com.rudy.model.Tanggal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rudy
 */
public class TanggalDao{
    Tanggal tgl;
    SimpleDateFormat sf = new SimpleDateFormat("dd MMMM YYYY");
    public Tanggal Hari()
    {   Date skrg = new Date();
        tgl = new Tanggal(sf.format(skrg));
        return tgl; 
    }
}
