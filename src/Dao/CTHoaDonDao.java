/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.CTHoaDon;
import MyConnection.MyConnection;
import java.sql.Connection;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class CTHoaDonDao implements Dao<CTHoaDon>{
    MyConnection myConnection = new MyConnection();
    Connection conn;
    @Override
    public List<CTHoaDon> getAll() {
        conn = myConnection.getConnection();
        String sql = "SELECT * FROM btl_cthoadon";
        ResultSet rs = null;
        List<CTHoaDon> list = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String masp = rs.getString("masp");
                int mahd = rs.getInt("mahd");
                int soluong = rs.getInt("soluong");
                int dongia = rs.getInt("dongia");
                list.add(new CTHoaDon(id, masp, mahd, soluong, dongia));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            myConnection.closeConnection(conn);
        }
        return list;
    }

    @Override
    public List<CTHoaDon> getcateid(int cateid) {
        conn = myConnection.getConnection();
        String sql = "SELECT * FROM btl_cthoadon where id = "+cateid;
        ResultSet rs = null;
        List<CTHoaDon> list = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String masp = rs.getString("masp");
                int mahd = rs.getInt("mahd");
                int soluong = rs.getInt("soluong");
                int dongia = rs.getInt("dongia");
                list.add(new CTHoaDon(id, masp, mahd, soluong, dongia));
                return list;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            myConnection.closeConnection(conn);
        }
        return null;    
    }

    @Override
    public int insert(CTHoaDon t) {
        conn = myConnection.getConnection();
        String sql = "INSERT INTO btl_cthoadon(masp,mahd,soluong,dongia) VALUES(?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getMasp());
            ps.setInt(2, t.getMahd());
            ps.setInt(3, t.getSoluong());
            ps.setInt(4, t.getDongia());
            if(ps.executeUpdate()>0){
                return 1;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            myConnection.closeConnection(conn);
        }
        return -1;
    }

    @Override
    public List<CTHoaDon> searh(CTHoaDon t) {
        conn = myConnection.getConnection();
        String sql = "SELECT * FROM btl_cthoadon where id like '%"+t.getId()+"%'";
        ResultSet rs = null;
        List<CTHoaDon> list = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String masp = rs.getString("masp");
                int mahd = rs.getInt("mahd");
                int soluong = rs.getInt("soluong");
                int dongia = rs.getInt("dongia");
                list.add(new CTHoaDon(id, masp, mahd, soluong, dongia));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            myConnection.closeConnection(conn);
        }
        return list;
    }

    @Override
    public boolean update(CTHoaDon t) {
        conn = myConnection.getConnection();
        String sql = "UPDATE btl_hoadon SET masp= ?,mahd = ?,soluong = ?,dongia = ? WHERE id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getMasp());
            ps.setInt(2, t.getMahd());
            ps.setInt(3, t.getSoluong());
            ps.setInt(4, t.getDongia());
            ps.setInt(5, t.getId());
            if (ps.executeUpdate() > 0){
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            myConnection.closeConnection(conn);
        }
        return false;
    }

    @Override
    public boolean delete(CTHoaDon t) {
        conn = myConnection.getConnection();
        String sql = "DELETE FROM btl_hoadon WHERE id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getId());
            if (ps.executeUpdate() > 0){
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            myConnection.closeConnection(conn);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
