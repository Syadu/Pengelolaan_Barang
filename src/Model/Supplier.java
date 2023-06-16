/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author aulia
 */
public class Supplier {

    /**
     * @return the id_supplier
     */
    public Integer getId_supplier() {
        return id_supplier;
    }

    /**
     * @param id_supplier the id_supplier to set
     */
    public void setId_supplier(Integer id_supplier) {
        this.id_supplier = id_supplier;
    }

    /**
     * @return the nama_supplier
     */
    public String getNama_supplier() {
        return nama_supplier;
    }

    /**
     * @param nama_supplier the nama_supplier to set
     */
    public void setNama_supplier(String nama_supplier) {
        this.nama_supplier = nama_supplier;
    }

    /**
     * @return the no_hp
     */
    public String getNo_hp() {
        return no_hp;
    }

    /**
     * @param no_hp the no_hp to set
     */
    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
  
     private Integer id_supplier;
     private String nama_supplier;
     private String no_hp;
     private String alamat;
}
