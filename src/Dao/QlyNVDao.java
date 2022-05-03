/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.HoaDon;
import Entity.QlyNV;
import MyConnection.MyConnection;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class QlyNVDao implements Dao<QlyNV>{
    MyConnection myconnection = new MyConnection();
    String tablename="btl_qlynv";

    @Override
    public List<QlyNV> getAll() {
        Connection conn = myconnection.getConnection();
        List<QlyNV> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql_getAll = "Select * from " + tablename;
            ps = conn.prepareStatement(sql_getAll);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new QlyNV(rs.getString("manv"),rs.getString("tennv"),rs.getInt("luongCb"),rs.getString("quequan"),rs.getString("ngaysinh"),rs.getString("gioitinh"),rs.getString("hinhanh")));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(rs!=null)
                    rs.close();
                if(rs==null)
                    ps.close();
            } catch (Exception e) {
            }
        }
        return list;
    }

    @Override
    public List<QlyNV> getcateid(int cateid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<QlyNV> getmanv(String id){
        Connection conn = myconnection.getConnection();
        String sql = "SELECT * FROM "+tablename+" where manv='"+id+"'";
        ResultSet rs = null;
        List<QlyNV> list = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String tennv = rs.getString("tennv");
                int luongCb = rs.getInt("luongCb");
                String que = rs.getString("quequan");
                String ngaysinh = rs.getString("ngaysinh");
                String gioitinh = rs.getString("gioitinh");
                String hinhanh = rs.getString("hinhanh");
                list.add(new QlyNV(id, tennv, luongCb, que, ngaysinh, gioitinh, hinhanh));
                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            myconnection.closeConnection(conn);
        }
        return list;
    }
    
    public QlyNV getid(String id){
        Connection conn = myconnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql_getAll = "Select * from " + tablename+" where manv='"+id+"'";
            ps = conn.prepareStatement(sql_getAll);
            rs = ps.executeQuery();
            while(rs.next()){
                String manv = rs.getString("manv");
                String tennv = rs.getString("tennv");
                int luongcb = rs.getInt("luongCb");
                String que= rs.getString("quequan");
                String ngaysinh=rs.getString("ngaysinh");
                String gioitinh =  rs.getString("gioitinh");
                String hinhanh=rs.getString("hinhanh");
                return (new QlyNV(manv, tennv, luongcb, que, ngaysinh, gioitinh, hinhanh));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(rs!=null)
                    rs.close();
                if(rs==null)
                    ps.close();
            } catch (Exception e) {
            }
        }
        return null;
    }
    
    
    @Override
    public int insert(QlyNV t) {
        Connection conn = myconnection.getConnection();
        PreparedStatement ps =null;
        ResultSet rs = null;
        try {
            String sql_insert = "insert into "+tablename+" values(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql_insert,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getManv());
            ps.setString(2, t.getTennv());
            ps.setInt(3, t.getLuongCb());
            ps.setString(4, t.getQuequan());
            ps.setString(5, t.getNgaysinh());
            ps.setString(6, t.getGioitinh());
            ps.setString(7, t.getHinhanh());
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
//    public ArrayList<QlyNV> checkManv(String manv, String tennv, int luongCb,String ngaysinh,String que,String gioitinh){
//        ArrayList<QlyNV> list=null;
//        Connection conn = myconnection.getConnection();
//        PreparedStatement psCheck =null;
//        ResultSet rsCheck = null;
//        
//        try {
//            String sqlCheck = "Select * from "+tablename+" where manv=? and tennv=? and luongCb=? and quequan=? and ngaysinh=? and gioitinh=?";
//            psCheck = conn.prepareStatement(sqlCheck);
//            psCheck.setString(1, manv);
//            psCheck.setString(2, tennv);
//            psCheck.setInt(3, luongCb);
//            psCheck.setString(4, que);
//            psCheck.setString(5, ngaysinh);
//            psCheck.setString(6, gioitinh);
//            rsCheck=psCheck.executeQuery();
//            list = new ArrayList<>();
//            while(rsCheck.next()){
//                QlyNV nv = new QlyNV();
//                nv.setManv(rsCheck.getString(1));
//                nv.setTennv(rsCheck.getString(2));
//                nv.setLuongCb(rsCheck.getInt(3));
//                nv.setQuequan(rsCheck.getString(4));
//                nv.setNgaysinh(rsCheck.getString(5));
//                nv.setGioitinh(rsCheck.getString(6));
//                list.add(nv);
//            }
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
//    
    
    
    @Override
    public List<QlyNV> searh(QlyNV t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(QlyNV t) {
        Connection conn = myconnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql_update="update "+tablename+" set tennv=? ,luongCb=?,quequan=?,ngaysinh=?,gioitinh=?,hinhanh=? where manv =?";
            ps = conn.prepareStatement(sql_update);  
            ps.setString(1, t.getTennv());
            ps.setInt(2, t.getLuongCb());
            ps.setString(3, t.getQuequan());
            ps.setString(4, t.getNgaysinh());
            ps.setString(5, t.getGioitinh());
            ps.setString(6, t.getHinhanh());
            ps.setString(7, t.getManv());
            if(ps.executeUpdate()>0)
                return true;
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
        return false;
    }

    @Override
    public boolean delete(QlyNV t) {
        Connection conn = myconnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql_delete = "delete from "+tablename+" where manv='"+t.getManv()+"'";
            ps = conn.prepareStatement(sql_delete);
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(rs!=null){
                    rs.close();
                }
                if(rs==null){
                    ps.close();
                }
            } catch (Exception e) {
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public boolean CheckID(QlyNV t){
        Connection conn = myconnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql_Check = "Select * from " + tablename+" where manv ='"+t.getManv()+"'";
            ps = conn.prepareStatement(sql_Check);
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(rs!=null)
                    rs.close();
                if(rs==null)
                    ps.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
//    public ArrayList<String> LoadComboBox(){
//        ArrayList<String> list = new ArrayList<String>();
//        Connection conn = myconnection.getConnection();
//        PreparedStatement ps =null;
//        ResultSet rs = null;
//        try {
//            String combobox = "Select tennv from btl_qlynv";
//            ps = conn.prepareStatement(combobox);
//            rs = ps.executeQuery();
//            while(rs.next()){
//                list.add(rs.getString("tennv"));
//            }
//        } catch (Exception e) {
//        }
//        return list;
//    }
//    public static void main(String[] args) {
//        QlyNVDao nvdao = new QlyNVDao();
//        QlyNV nv = new QlyNV("TT002", "Nguyễn Đoàn Đăng", 4000000, "Yên Bái", "01/11/2001", "Nam");
////        nvdao.insert(nv);
//        nvdao.delete(nv);
////        List<QlyNV> list = nvdao.getAll();
////        for(QlyNV c : list){
////            System.out.println(list); 
////        }
//    }
}
