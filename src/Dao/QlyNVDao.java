/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.QlyNV;
import View.Dao;
import View.MyConnection;
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
                list.add(new QlyNV(rs.getString("manv"),rs.getString("tennv"),rs.getInt("luongCb"),rs.getString("quequan"),rs.getString("ngaysinh"),rs.getString("gioitinh")));
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

    @Override
    public int insert(QlyNV t) {
        Connection conn = myconnection.getConnection();
        PreparedStatement ps =null;
        ResultSet rs = null;
        try {
            String sql_insert = "insert into "+tablename+" values('"+t.getManv()+"','"+t.getTennv()+"',"+t.getLuongCb()+",'"+t.getQuequan()+"','"+t.getNgaysinh()+"','"+t.getGioitinh()+"')";
            ps = conn.prepareStatement(sql_insert,Statement.RETURN_GENERATED_KEYS);
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
            String sql_update="update "+tablename+" set tennv='"+t.getTennv()+"' ,luongCb="+t.getLuongCb()+",quequan='"+t.getQuequan()+"' ,ngaysinh='"
                    +t.getNgaysinh()+"' ,gioitinh='"+t.getGioitinh()+"'"+" where manv ='"+t.getManv()+"';";
            ps = conn.prepareStatement(sql_update);
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
