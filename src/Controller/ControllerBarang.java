/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOBarang;
import DAOInterface.IDAOBarang;
import Model.Barang;
import Model.TabelModelBarang;
import View.DataBarang;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class ControllerBarang {
    
    
    public ControllerBarang(DataBarang dtBarang)
    {
        this.dtBrg = dtBarang;
        iBarang = new DAOBarang();
    }
    
    public void isiTable()
    {
        lstBrg = iBarang.getAll();
        TabelModelBarang tabelBrg = new TabelModelBarang(lstBrg);
        dtBrg.getTabelData().setModel(tabelBrg);
    }
    
    public void insert()
    {
        Barang b = new Barang();
        b.setId(Integer.valueOf(dtBrg.gettxtID().getText()));
        b.setNama(dtBrg.gettxtNama().getText());
        b.setHarga(Integer.valueOf(dtBrg.gettxtHarga().getText()));
        b.setStok(Integer.valueOf(dtBrg.gettxtStok().getText()));
        boolean res = iBarang.insert(b);
        if(res)
            JOptionPane.showMessageDialog(null, "Input Berhasil");
        else
            JOptionPane.showMessageDialog(null, "Gagal/Data Duplikat");
    }
    
    public void reset()
    {
        if(!dtBrg.gettxtID().isEnabled())
            dtBrg.gettxtID().setEnabled(true);
        dtBrg.gettxtID().setText("");
        dtBrg.gettxtNama().setText("");
        dtBrg.gettxtHarga().setText("");
        dtBrg.gettxtStok().setText("");
    }
    
    public void isiField(int row)
    {
        dtBrg.gettxtID().setEnabled(false);
        dtBrg.gettxtID().setText(lstBrg.get(row).getId().toString());
        dtBrg.gettxtNama().setText(lstBrg.get(row).getNama());
        dtBrg.gettxtHarga().setText(lstBrg.get(row).getHarga().toString());
        dtBrg.gettxtStok().setText(lstBrg.get(row).getStok().toString());
    }
   
    public void update()
    {
        Barang b = new Barang();
        b.setNama(dtBrg.gettxtNama().getText());
        b.setHarga(Integer.valueOf(dtBrg.gettxtHarga().getText()));
        b.setStok(Integer.valueOf(dtBrg.gettxtStok().getText()));
        b.setId(Integer.valueOf(dtBrg.gettxtID().getText()));
        iBarang.update(b);
        JOptionPane.showMessageDialog(null, "Update Berhasil");
    }
    
    public void delete()
    {
        iBarang.delete(Integer.parseInt(dtBrg.gettxtID().getText()));
        JOptionPane.showMessageDialog(null, "Delete  Berhasil");
    }
    
    public void cari()
    {
        lstBrg = iBarang.getAllByName(dtBrg.gettxtCariNama().getText());
        TabelModelBarang tabelBrg = new TabelModelBarang(lstBrg);
        dtBrg.getTabelData().setModel(tabelBrg);
    }
    
    DataBarang dtBrg;
    IDAOBarang iBarang;
    List<Barang> lstBrg;
}