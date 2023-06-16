/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOSupplier;
import DAOInterface.IDAOSupplier;
import Model.Supplier;
import Model.TabelModelSupplier;
import View.FormSupplier;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author aulia
 */
public class ControllerSupplier {

    public ControllerSupplier(FormSupplier frmSupplier)
    {
        this.frmSupplier = frmSupplier;
        iSupplier = new DAOSupplier();
    }
    
    public void isiTable()
    {
        lstSlr = iSupplier.getAll();
        TabelModelSupplier tabelSlr = new TabelModelSupplier(lstSlr);
        frmSupplier.getTabelData().setModel(tabelSlr);
    }
    
    public void insert()
    {
        Supplier b = new Supplier();
        b.setId_supplier(Integer.valueOf(frmSupplier.gettxtID().getText()));
        b.setNama_supplier(frmSupplier.gettxtNama().getText());
        b.setNo_hp(frmSupplier.gettxtNo_Hp().getText());
        b.setAlamat(frmSupplier.gettxtAlamat().getText());
        boolean res = iSupplier.insert(b);
        if(res)
            JOptionPane.showMessageDialog(null, "Input Berhasil");
        else
            JOptionPane.showMessageDialog(null, "Gagal/Data Duplikat");
    }
    
    public void update()
    {
        Supplier b = new Supplier();
        b.setNama_supplier(frmSupplier.gettxtNama().getText());
        b.setNo_hp(frmSupplier.gettxtNo_Hp().getText());
        b.setAlamat(frmSupplier.gettxtAlamat().getText());
        b.setId_supplier(Integer.valueOf(frmSupplier.gettxtID().getText()));
        iSupplier.update(b);
        JOptionPane.showMessageDialog(null, "Update Berhasil");
    }
    
    public void delete()
    {
        iSupplier.delete(Integer.parseInt(frmSupplier.gettxtID().getText()));
        JOptionPane.showMessageDialog(null, "Delete Berhasil");
    }
    
    public void isiField(int row)
    {
        frmSupplier.gettxtID().setEnabled(false);
        frmSupplier.gettxtID().setText(String.valueOf(lstSlr.get(row).getId_supplier()));
        frmSupplier.gettxtNama().setText(lstSlr.get(row).getNama_supplier());
        frmSupplier.gettxtNo_Hp().setText(lstSlr.get(row).getNo_hp());
        frmSupplier.gettxtAlamat().setText(lstSlr.get(row).getAlamat());
    }
    
    public void search()
    {
        lstSlr = iSupplier.getAllByNama (frmSupplier.gettxtCariNama().getText());
        TabelModelSupplier tabelSlr = new TabelModelSupplier(lstSlr);
        frmSupplier.getTabelData().setModel(tabelSlr);
    }
    
    public void reset()
    {
        if(!frmSupplier.gettxtID().isEnabled())
            frmSupplier.gettxtID().setEnabled(true);
        frmSupplier.gettxtID().setText(" ");
        frmSupplier.gettxtNama().setText(" ");
        frmSupplier.gettxtNo_Hp().setText(" ");
        frmSupplier.gettxtAlamat().setText(" ");
    }
   
    FormSupplier frmSupplier;
    IDAOSupplier iSupplier;
    List<Supplier> lstSlr;
}
