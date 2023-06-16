/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;

import Model.Barang;
import java.util.List;


/**
 *
 * @author hp
 */
public interface IDAOBarang {
    //read data
    public List<Barang> getAll();
    //insert data
    public boolean insert(Barang b);
    //update data
    public void update(Barang b);
    //delete data
    public void delete(int id);
    //search data
    public List<Barang> getAllByName(String nama);
}
