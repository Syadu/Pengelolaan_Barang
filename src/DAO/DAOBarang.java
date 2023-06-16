/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAOBarang;
import KoneksiDB.KoneksiDB;
import Model.Barang;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class DAOBarang implements IDAOBarang{
    
    public DAOBarang()
    {
        con = KoneksiDB.getconnection();
    }
    
    @Override
    public List<Barang> getAll() 
    {
        List<Barang> lstBrg = null;
        try
        {
            lstBrg = new ArrayList<Barang>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(stRead);
            while(rs.next())
            {
                Barang b = new Barang();
                b.setId(rs.getInt("id_barang"));
                b.setNama(rs.getString("nama_barang"));
                b.setHarga(rs.getInt("harga"));
                b.setStok(rs.getInt("stok"));
                
                lstBrg.add(b);
            }
        }
        catch(SQLException e)
        {
            System.err.println("error: "+e);
        }
        return lstBrg;
    }
    
    @Override
    public boolean insert(Barang b) 
    {
        boolean result=true;
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strInsert);
            statement.setInt(1, b.getId());
            statement.setString(2, b.getNama());
            statement.setInt(3, b.getHarga());
            statement.setInt(4, b.getStok());
            statement.execute(); 
        }catch(SQLException e)
        {
            System.out.println("gagal input");
            result = false;
        }
        finally
        {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("gagal input");
                result = false;
            }
        }
        return result;
    }
    
    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strDelete);
            statement.setInt(1, id);
            statement.execute(); 
        }catch(SQLException e)
        {
            System.out.println("gagal delete");
        }
        finally
        {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("gagal delete");
            }
        }
    }
    
    
    @Override
    public List<Barang> getAllByName(String nama) {
        List<Barang> lstBrg = null;
        try
        {
            lstBrg = new ArrayList<Barang>();
            PreparedStatement st = con.prepareStatement(strSearch);
            st.setString(1, "%"+nama+"%");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                Barang b = new Barang();
                b.setId(rs.getInt("id_barang"));
                b.setNama(rs.getString("nama_barang"));
                b.setHarga(rs.getInt("harga"));
                b.setStok(rs.getInt("stok"));
                lstBrg.add(b);
            }
        }
        catch(SQLException e)
        {
            System.err.println("error: "+e);
        }
        return lstBrg;
    }
    
    @Override
    public void update(Barang b) 
    {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strUpdate);
            statement.setString(1, b.getNama());
            statement.setInt(2, b.getHarga());
            statement.setInt(3, b.getStok());
            statement.setInt(4, b.getId());
            statement.execute(); 
        }catch(SQLException e)
        {
            System.out.println("gagal update"+e);
        }
        finally
        {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("gagal update"+ex);
            }
        }
    }
    
    Connection con;
    //SQL Query
    String stRead = "select * from barang order by id_barang asc;";
    String strInsert = "insert into barang (id_barang,nama_barang,harga,stok) values (?,?,?,?);";
    String strUpdate = "update barang set nama_barang=?, harga=?, stok=? where id_barang=?";
    String strDelete = "delete from barang where id_barang=?;";
    String strSearch = "select * from barang where nama_barang like ?;";  
}
