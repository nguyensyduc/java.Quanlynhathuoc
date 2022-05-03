
package MyConnection;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MyConnection {
    String hostname;
    String dbname;
    String userName;
    String password;
    String jdbc;
    String port;
    String className;
    String connectionURL;
    String kindOfDB;
    public static MyConnection instance;

    public MyConnection() {
        try{
            InputStream inputStream = new FileInputStream("resourcesTHUOC/databaseConnect.txt");
            Properties prop = new Properties();
            prop.load(inputStream);
            kindOfDB = prop.getProperty("kindOfDB");
            hostname = prop.getProperty("hostName");
            dbname = prop.getProperty("dbName");
            userName = prop.getProperty("userName");
            password = prop.getProperty("password");
            jdbc = prop.getProperty("jdbc");
            port = prop.getProperty("port");
            className = prop.getProperty("className");
            connectionURL = jdbc + hostname + port + dbname;
       }catch(Exception e){
       }
    }
    public static MyConnection Getinstance(){
       if(instance==null){
           instance=new MyConnection();
       }
       return instance;
   }
   public Connection getConnection(){
       Connection conn =null;
       try{
           conn = DriverManager.getConnection(connectionURL,userName,password);
           Class.forName("com.mysql.jdbc.Driver");
       }catch(Exception e){
           e.printStackTrace();
       }
       return conn;
   }
   public boolean closeConnection(Connection conn){
       try{
           conn.close();
           return true;
       }catch(Exception e){
           return false;
       }
   }
    public static void main(String[] args) {
        Connection conn = MyConnection.Getinstance().getConnection();
        if(conn!=null){
            System.out.println("ok");
        }
        else{
            System.out.println("not oke");
        }
    }
}
