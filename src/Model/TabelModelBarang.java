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
public class TabelModelBarang extends AbstractTableModel{
    
    public TabelModelBarang(List<Barang> lstBrg) 
    {
        this.lstBrg = lstBrg;
    }
    
    @Override
    public int getRowCount() {
        return this.lstBrg.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column)
    {
        switch (column) 
        {
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2: 
                return "Harga";
            case 3:
                return "Stok";         
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) 
        {
            case 0:
                return lstBrg.get(rowIndex).getId();
            case 1:
                return lstBrg.get(rowIndex).getNama();
            case 2:
                return lstBrg.get(rowIndex).getHarga();
            case 3:
                return lstBrg.get(rowIndex).getStok();
            default:
                return null;
        }
    }
    
    List<Barang> lstBrg;
}
