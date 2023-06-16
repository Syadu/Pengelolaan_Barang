/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOLokasi;
import DAOInterface.IDAOLokasi;
import Model.Lokasion;
import Model.TabelModelLokasi;
import View.Lokasi;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class ControllerLokasi {
    
    public ControllerLokasi(Lokasi dtLokasi)
    {
        this.dtLks = dtLokasi;
        iLokasi = new DAOLokasi();
    }
    
    public  void isiTable()
    {
        lstLks = iLokasi.getAll();
        TabelModelLokasi tabelLks = new TabelModelLokasi(lstLks);
        dtLks.getTabelData().setModel(tabelLks); 
    }
    
    public void insert()
    {
        Lokasion l = new Lokasion();
        l.setId_lokasi((dtLks.gettxtID().getText()));
        l.setNama_lokasi(dtLks.gettxtNama().getText());
        boolean res = iLokasi.insert(l);
        if(res)
            JOptionPane.showMessageDialog(null, "Input Berhasil");
        else
            JOptionPane.showMessageDialog(null, "Gagal/Data Duplikat");
    }
    
    public void reset()
    {
        if(!dtLks.gettxtID().isEnabled())
            dtLks.gettxtID().setEnabled(true);
        dtLks.gettxtID().setText("");
        dtLks.gettxtNama().setText("");
    }
    
    public void isiField(int row)
    {
        dtLks.gettxtID().setEnabled(false);
        dtLks.gettxtID().setText(lstLks.get(row).getId_lokasi());
        dtLks.gettxtNama().setText(lstLks.get(row).getNama_lokasi());
    }
    
    public void update()
    {
        Lokasion l = new Lokasion();
        l.setNama_lokasi(dtLks.gettxtNama().getText());
        l.setId_lokasi((dtLks.gettxtID().getText()));
        iLokasi.update(l);
        JOptionPane.showMessageDialog(null, "Update  Berhasil");
    }
    
    public void delete()
    {
        iLokasi.delete((dtLks.gettxtID().getText()));
        JOptionPane.showMessageDialog(null, "Delete  Berhasil");
    }
    
    public void cari()
    {
        lstLks = iLokasi.getAllByName(dtLks.gettxtCariNama().getText());
        TabelModelLokasi tabelLks = new TabelModelLokasi(lstLks);
        dtLks.getTabelData().setModel(tabelLks);
    }
    
    Lokasi dtLks;
    IDAOLokasi iLokasi;
    List<Lokasion> lstLks;
}
