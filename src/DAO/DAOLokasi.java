
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAOLokasi;
import KoneksiDB.KoneksiDB;
import Model.Lokasion;
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
public class DAOLokasi implements IDAOLokasi{
    
    public DAOLokasi(){
        con = KoneksiDB.getconnection();
    }

    @Override
    public List<Lokasion> getAll() {
        List<Lokasion> lstLks = null;
        try{
            lstLks = new ArrayList<Lokasion>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(stRead);
            while(rs.next()){
                Lokasion l = new Lokasion();
                l.setId_lokasi(rs.getString("id_lokasi"));
                l.setNama_lokasi(rs.getString("lokasi"));
                lstLks.add(l);
            }
        }
        catch(SQLException e)
        {
            System.err.println("error: "+e);
        }
        return lstLks;
    }

    @Override
    public boolean insert(Lokasion l) {
        boolean result=true;
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strInsert);
            statement.setString(1, l.getId_lokasi());
            statement.setString(2, l.getNama_lokasi());
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
    public void update(Lokasion l) {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strUpdate);
            statement.setString(1, l.getNama_lokasi());
            statement.setString(2, l.getId_lokasi());
            statement.execute(); 
        }catch(SQLException e)
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

    @Override
    public void delete(String id) {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strDelete);
            statement.setString(1, id);
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
    public List<Lokasion> getAllByName(String nama) {
        List<Lokasion> lstBrg = null;
        try
        {
            lstBrg = new ArrayList<Lokasion>();
            PreparedStatement st = con.prepareStatement(strSearch);
            st.setString(1, "%"+nama+"%");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                Lokasion b = new Lokasion();
                b.setId_lokasi(rs.getString("id_lokasi"));
                b.setNama_lokasi(rs.getString("lokasi"));
                lstBrg.add(b);
            }
        }
        catch(SQLException e)
        {
            System.err.println("error: "+e);
        }
        return lstBrg;
    }
    
    Connection con;
    //SQL Query
    String stRead = "select * from lokasi order by id_lokasi asc;";
    String strInsert = "insert into lokasi (id_lokasi,lokasi) values (?, ?);";
    String strUpdate = "update lokasi set lokasi=?, wilayah=? where id_lokasi=?";
    String strDelete = "delete from lokasi where id_lokasi=?";
    String strSearch = "select * from lokasi where lokasi like ?;";
}
