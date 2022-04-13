/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.QlyNCC;
import MyConnection.MyConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class QlyNCCDao implements Dao<QlyNCC>{
    MyConnection myconnection = new MyConnection();
    String tableName= "btl_qlyncc";
    Connection conn;
    @Override
    public List<QlyNCC> getAll() {
        conn = myconnection.getConnection();
        List<QlyNCC> list = new ArrayList<>();
        PreparedStatement ps =null;
        ResultSet rs = null;
        try {
            String sql_getAll = "Select * from "+tableName;
            ps = conn.prepareStatement(sql_getAll);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new QlyNCC(rs.getString("mancc"), rs.getString("tenncc"), rs.getString("diachi"), rs.getString("sdt"), rs.getString("email"),rs.getString("image")));
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
    public List<QlyNCC> getcateid(int cateid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<QlyNCC> getid(String id){
        conn = myconnection.getConnection();
        List<QlyNCC> list = new ArrayList<>();
        PreparedStatement ps =null;
        ResultSet rs = null;
        try {
            String sql_getAll = "Select * from "+tableName+" where mancc='"+id+"'";
            ps = conn.prepareStatement(sql_getAll);
            rs = ps.executeQuery();
            while(rs.next()){
                String tenncc = rs.getString("tenncc");
                String diachi = rs.getString("diachi");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                String hinhanh = rs.getString("image");
                list.add(new QlyNCC(id, tenncc, diachi, sdt, email, email));
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
    public int insert(QlyNCC t) {
        Connection conn = myconnection.getConnection();
        PreparedStatement ps =null;
        ResultSet rs = null;
        try {
            String sql_insert = "insert into "+tableName+" values(?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql_insert,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getMancc());
            ps.setString(2, t.getTenncc());
            ps.setString(3, t.getDiachi());
            ps.setString(4, t.getSdt());
            ps.setString(5, t.getEmail());
            ps.setString(6, t.getImage());
            
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
    public List<QlyNCC> searh(QlyNCC t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(QlyNCC t) {
        conn = myconnection.getConnection();
        PreparedStatement ps =null;
        ResultSet rs = null;
        try {
            String sql_update = "update "+tableName+" set tenncc=?,diachi=?,sdt=?,email=?,image=? where mancc=?";
            ps = conn.prepareStatement(sql_update);
            ps.setString(1, t.getTenncc());
            ps.setString(2, t.getDiachi());
            ps.setString(3, t.getSdt());
            ps.setString(4, t.getEmail());
            ps.setString(5, t.getImage());
            ps.setString(6, t.getMancc());
            if(ps.executeUpdate()>0){
                return true;
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
        return false;
    }

    @Override
    public boolean delete(QlyNCC t) {
        conn = myconnection.getConnection();
        PreparedStatement ps =null;
        ResultSet rs = null;
        try {
            String sql_delete = "Delete from "+tableName+" where mancc='"+t.getMancc()+"'";
            ps = conn.prepareStatement(sql_delete);
            if(ps.executeUpdate()>0){
                return true;
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
        return false;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//    public static void main(String[] args) {
//        QlyNCCDao nccDao = new QlyNCCDao();
//        QlyNCC ncc = new QlyNCC("1", "1", "1", "1", "1", "2");
//        List<QlyNCC> list = nccDao.getAll();
//        for (QlyNCC qlyNCC : list) {
//            System.out.println(list);
//        }
//        nccDao.delete(ncc);
//    }
}
