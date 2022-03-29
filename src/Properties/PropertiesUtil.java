/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class PropertiesUtil {
    public void rememberProperties(String userName, String password){
        OutputStream os = null;
        Properties prop = new Properties();
        try {
            os= new FileOutputStream("resourcesBTL/remember.properties");
            prop.setProperty("userName", userName);
            prop.setProperty("password", password);
            prop.store(os, "Remember password");
        }catch(Exception e){
            e.printStackTrace();
            try {   
                os.close();
            } catch (IOException ex) {
                Logger.getLogger(PropertiesUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void addRemember(String username,String password){
        InputStream is;
        OutputStream os;
        Properties prop = new Properties();
        try {
            is = getClass().getClassLoader().getResourceAsStream("remember.properties");
            os = new FileOutputStream("remember.properties");
            prop.setProperty("username", username);
            prop.setProperty("password", password);
            prop.store(os,"Remember password");
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        PropertiesUtil pr = new PropertiesUtil();
        pr.addRemember("admin", "1");
    }
}
