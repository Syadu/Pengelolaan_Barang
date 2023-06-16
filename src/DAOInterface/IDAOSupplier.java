/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;

import Model.Supplier;
import java.util.List;

/**
 *
 * @author aulia
 */
public interface IDAOSupplier {
    // read data 
    public List<Supplier> getAll();
    
    // insert data
    public boolean insert (Supplier b);
    
    // update data
    public void update (Supplier b);
    
    // delete data
    public void delete(int id);
    
    // search data
    public List<Supplier> getAllByNama(String nama_supplier);
     
}
