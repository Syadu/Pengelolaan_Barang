/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOInterface;

import Model.Lokasion;
import java.util.List;

/**
 *
 * @author hp
 */
 public interface IDAOLokasi {
    //read data
    public List<Lokasion> getAll();
    //insert data
    public boolean insert(Lokasion l);
    //update data
    public void update(Lokasion l);
    //delete data
    public void delete(String id);
    //search data
    public List<Lokasion> getAllByName(String nama);
}