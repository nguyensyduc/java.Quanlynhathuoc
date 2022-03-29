/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.NhapSP;
import View.Dao;
import View.MyConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ADMIN
 */
public class NhapSPDao implements Dao<NhapSP>{
    MyConnection myconnection = new MyConnection();
    String tableName="btl_nhapthuoc";
    @Override
    public List<NhapSP> getAll() {
        Connection conn = myconnection.getConnection();
        List<NhapSP> list = new ArrayList<>();
        PreparedStatement ps= null;
        ResultSet rs = null;
        try {
            String sql_getAll="Select * from "+tableName;
            ps = conn.prepareStatement(sql_getAll);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new NhapSP(rs.getString("masp"), rs.getString("tensp"), rs.getInt("gia"), rs.getString("donvi"),rs.getString("soLuong"), rs.getString("ngaynhap"), rs.getString("ngayhethan"),rs.getString("loadImage"),rs.getString("ncc")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(rs!=null){
                    rs.close();
                }
                if(rs==null){
                    ps.close();
                }
                myconnection.closeConnection(conn);
            } catch (Exception e) {
            }
        }
        return list;
    }

    @Override
    public List<NhapSP> getcateid(int cateid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(NhapSP t) {
        Connection conn = myconnection.getConnection();
        PreparedStatement ps =null;
        ResultSet rs = null;
        try {
            String sql_insert = "insert into "+tableName+" values(?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql_insert);
            ps.setString(1, t.getMasp());
            ps.setString(2, t.getTensp());
            ps.setInt(3, t.getGia());
            ps.setString(4, t.getDonvi());
            ps.setString(5, t.getSoLuong());
            ps.setString(6, t.getNgaynhap());
            ps.setString(7, t.getNgayhethan());
            ps.setString(9, t.getNcc());
            ps.setString(8, t.getLoadImage());
            if(ps.executeUpdate()>0){
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(rs!=null){
                    rs.close();
                }
                if(rs==null){
                    ps.close();
                }
                myconnection.closeConnection(conn);
            } catch (Exception e) {
            }
        }
        return -1;
    }

    @Override
    public List<NhapSP> searh(NhapSP t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(NhapSP t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(NhapSP t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<String> LoadComboBox(){
        ArrayList<String> list = new ArrayList<String>();
        Connection conn = myconnection.getConnection();
        PreparedStatement ps =null;
        ResultSet rs = null;
        try {
            String combobox = "Select tenncc from btl_qlyncc";
            ps = conn.prepareStatement(combobox);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(rs.getString("tenncc"));
            }
        } catch (Exception e) {
        }
        return list;
    }
//    public void LoadComboBox(){
//        Connection conn = myconnection.getConnection();
//        PreparedStatement ps =null;
//        ResultSet rs = null;
//        try {
//            String sql_cbx = "select tensp from "+tableName;
//            ps = conn.prepareStatement(sql_cbx);
//            rs = ps.executeQuery();
//            while(rs.next()){
//                String s = rs.getString(1);
//            }
//        } catch (Exception e) {
//        }
//    }
//    public static void main(String[] args) {
//        NhapSPDao spDao = new NhapSPDao();
//        NhapSP sp = new NhapSP("T003","Durex",30000,"Hop","2021-02-28","2021-09-12","aaaa");
//        spDao.insert(sp);
//        List<NhapSP> list = spDao.getAll();
//        for (NhapSP c : list) {
//            System.out.println(list);
//        }
//    }
    
}
