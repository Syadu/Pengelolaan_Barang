/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hp
 */
public class TabelModelLokasi extends AbstractTableModel{
    
    public TabelModelLokasi(List<Lokasion> lstLks)
    {
        this.lstLks = lstLks;
    }
    
    @Override
    public int getRowCount() {
        return this.lstLks.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nama";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) 
        {
            case 0:
                return lstLks.get(rowIndex).getId_lokasi();
            case 1:
                return lstLks.get(rowIndex).getNama_lokasi();
            default:
                return null;
        }
    }
    
    List<Lokasion> lstLks;
    
}
