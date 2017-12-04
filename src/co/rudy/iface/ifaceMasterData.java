/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.rudy.iface;

import com.rudy.model.Paket;
import com.rudy.model.Tarif;
import com.rudy.model.MasterDataModel;
import java.util.List;

/**
 *
 * @author rudy
 */
public interface ifaceMasterData {
    public List<MasterDataModel> getAllDataPaket();
    public Tarif[] getAllDataTarif();
}
