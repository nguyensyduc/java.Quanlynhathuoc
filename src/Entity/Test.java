/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ADMIN
 */
public class Test {
    private String ten;
    private String ghichu;
    private String image;

    public Test() {
    }

    public Test(String ten, String ghichu, String image) {
        this.ten = ten;
        this.ghichu = ghichu;
        this.image = image;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Test{" + "ten=" + ten + ", ghichu=" + ghichu + ", image=" + image + '}';
    }
    
}
