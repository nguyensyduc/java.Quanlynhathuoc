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
public class QlyNCC {
    private String mancc;
    private String tenncc;
    private String diachi;
    private String sdt;
    private String email;
    private String image;

    public QlyNCC() {
    }

    public QlyNCC(String mancc, String tenncc, String diachi, String sdt, String email, String image) {
        this.mancc = mancc;
        this.tenncc = tenncc;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
        this.image = image;
    }

    public String getMancc() {
        return mancc;
    }

    public void setMancc(String mancc) {
        this.mancc = mancc;
    }

    public String getTenncc() {
        return tenncc;
    }

    public void setTenncc(String tenncc) {
        this.tenncc = tenncc;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "QlyNCC{" + "mancc=" + mancc + ", tenncc=" + tenncc + ", diachi=" + diachi + ", sdt=" + sdt + ", email=" + email + ", image=" + image + '}';
    }

    
    
    
}
