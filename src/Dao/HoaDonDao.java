/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.HoaDon;
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
public class HoaDonDao implements Dao<HoaDon>{
    MyConnection myconnection = new MyConnection();
    Connection conn;
    @Override
    public List<HoaDon> getAll() {
        conn = myconnection.getConnection();
        String sql = "SELECT * FROM btl_hoadon";
        ResultSet rs = null;
        List<HoaDon> list = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int mahd = rs.getInt("mahd");
                String manv = rs.getString("manv");
                String thoigianban = rs.getString("thoigianban");
                int tongtien = rs.getInt("tongtien");
                list.add(new HoaDon(mahd, manv, thoigianban, tongtien));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            myconnection.closeConnection(conn);
        }
        return list;
        
    }

    @Override
    public List<HoaDon> getcateid(int cateid) {
        conn = myconnection.getConnection();
        String sql = "SELECT * FROM btl_hoadon where mahd="+cateid;
        ResultSet rs = null;
        List<HoaDon> list = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String manv = rs.getString("manv");
                String thoigianban = rs.getString("thoigianban");
                int tongtien = rs.getInt("tongtien");
                list.add(new HoaDon(cateid, manv, thoigianban, tongtien));
                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            myconnection.closeConnection(conn);
        }
        return list;
    }

    @Override
    public int insert(HoaDon t) {
        conn = myconnection.getConnection();
        String sql = "INSERT INTO btl_hoadon VALUES(?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getMahd());
            ps.setString(2, t.getManv());
            ps.setString(3, t.getThoigianban());
            ps.setInt(4, t.getTongtien());
            if(ps.executeUpdate()>0){
                return 1;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            myconnection.closeConnection(conn);
        }
        return -1;
    }

    @Override
    public List<HoaDon> searh(HoaDon t) {
        conn = myconnection.getConnection();
        String sql = "SELECT * FROM btl_hoadon where mahd like '%"+t.getMahd()+"%'";
        ResultSet rs = null;
        List<HoaDon> list = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int mahd = rs.getInt("mahd");
                String manv = rs.getString("manv");
                String thoigianban = rs.getString("thoigianban");
                int tongtien = rs.getInt("tongtien");
                list.add(new HoaDon(mahd, manv, thoigianban, tongtien));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            myconnection.closeConnection(conn);
        }
        return list;
    }

    @Override
    public boolean update(HoaDon t) {
        conn = myconnection.getConnection();
        String sql = "UPDATE btl_hoadon SET manv = ?,thoigianban = ?,tongtien = ? WHERE mahd = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getManv());
            ps.setString(2, t.getThoigianban());
            ps.setInt(3, t.getTongtien());
            ps.setInt(4, t.getMahd());

            if (ps.executeUpdate() > 0){
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            myconnection.closeConnection(conn);
        }
        return false;
    }

    @Override
    public boolean delete(HoaDon t) {
        conn = myconnection.getConnection();
        String sql = "DELETE FROM btl_hoadon WHERE mahd = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getMahd());

            if (ps.executeUpdate() > 0){
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            myconnection.closeConnection(conn);
        }
        return false;
    }
    
    
    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//    public static void main(String[] args) {
//        HoaDonDao hdDao = new HoaDonDao();
//        HoaDon hd = new HoaDon(1, "NV001", "11-11-11", 0);
////        List<HoaDon> list1 = hdDao.searh(new HoaDon(1,"","",0));
////        for (HoaDon hoaDon : list1) {
////            System.out.println(hoaDon);
////        }
//        hdDao.insert(hd);
//    }
//    
}
