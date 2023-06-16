 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAOSupplier;
import KoneksiDB.KoneksiDB;
import Model.Supplier;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aulia
 */
 public class DAOSupplier implements IDAOSupplier {
    
    public DAOSupplier()
    {
         con = KoneksiDB.getconnection(); 
    }
    
    @Override
    public List<Supplier> getAll()
    {
        List<Supplier> lstSlr = null;
        
        try
        {
            lstSlr = new ArrayList<Supplier>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            
            while (rs.next())
            {
                Supplier slr = new Supplier();
                slr.setId_supplier(rs.getInt("id_supplier"));
                slr.setNama_supplier(rs.getString("nama_supplier"));
                slr.setNo_hp(rs.getString("no_hp"));
                slr.setAlamat(rs.getString("alamat"));
                lstSlr.add(slr);
            }
        }
        catch(SQLException e)
        {
            System.out.println("error : " + e);
        }
        
        return lstSlr;
    }
    
    @Override
    public boolean insert(Supplier b) 
    {
        boolean result=true;
        PreparedStatement statement = null;
        try
        {
            statement = (PreparedStatement) con.prepareStatement(strInsert);
            statement.setInt(1, b.getId_supplier());
            statement.setString(2, b.getNama_supplier());
            statement.setString(3, b.getNo_hp());
            statement.setString(4, b.getAlamat());
            statement.execute();          
        }
        
        catch(SQLException e)
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
    public void delete(int id) 
    {
        PreparedStatement statement = null;
        try
        {
            statement = (PreparedStatement) con.prepareStatement(strDelete);
            statement.setInt(1, id);
            statement.execute();          
        }
        
        catch(SQLException e)
        {
            System.out.println("error e : " + e);
            System.out.println("gagal delete");
        }
        
        finally
        {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("error : " + ex);
                System.out.println("gagal delete");
            }
        }
    }
    
    @Override
    public void update(Supplier b) 
    {
        PreparedStatement statement = null;
        try
        {
            statement = (PreparedStatement) con.prepareStatement(strUpdate);
            statement.setString(1, b.getNama_supplier());
            statement.setString(2, b.getNo_hp());
            statement.setString(3, b.getAlamat());
            statement.setInt(4, b.getId_supplier());
            statement.execute();          
        }
        
        catch(SQLException e)
        {
            System.out.println("gagal update");
        }
        
        finally
        {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("gagal update");
            }
        }
    }
    
    Connection con;
    
    @Override
    public List<Supplier> getAllByNama(String nama_supplier) 
    {
        List<Supplier> lstSlr = null;
        
        try
        {
            lstSlr = new ArrayList<Supplier>();
            PreparedStatement st = (PreparedStatement) con.prepareStatement(strSearch);
            st.setString(1, "%"+nama_supplier+"%");
            ResultSet rs = st.executeQuery();
            
            while (rs.next())
            {
                Supplier slr = new Supplier();
                slr.setId_supplier(rs.getInt("id_supplier"));
                slr.setNama_supplier(rs.getString("nama_supplier"));
                slr.setNo_hp(rs.getString("no_hp"));
                slr.setAlamat(rs.getString("alamat"));
                lstSlr.add(slr);
            }
        }
        catch(SQLException e)
        {
            System.out.println("error : " + e);
        }
        
        return lstSlr;
    }
    
    //SQL Query
    String strRead = "select * from supplier order by id_supplier asc;;";
    String strInsert = "insert into supplier(id_supplier, nama_supplier, no_hp, alamat) values (?, ?, ?, ?);";
    String strUpdate = "update supplier set nama_supplier=?, no_hp=?, alamat=? where id_supplier=?;";
    String strDelete = "delete from supplier where id_supplier=?;";
    String strSearch = "select * from supplier where nama_supplier like ?;"; 
    
}
