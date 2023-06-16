/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aulia
 */
 public class TabelModelSupplier extends AbstractTableModel{
     
    public TabelModelSupplier(List<Supplier> lstSpl){
        this.lstSpl = lstSpl;
    } 

    @Override
    public int getRowCount() {
//        System.out.println(lstSpl);
        return this.lstSpl.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "ID Supplier";
            case 1 -> "Nama Supplier";
            case 2 -> "No HP";
            case 3 -> "Alamat";
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> lstSpl.get(rowIndex).getId_supplier();
            case 1 -> lstSpl.get(rowIndex).getNama_supplier();
            case 2 -> lstSpl.get(rowIndex).getNo_hp();
            case 3 -> lstSpl.get(rowIndex).getAlamat();
            default -> null;
        };
    }
     
    List<Supplier> lstSpl;
 }
