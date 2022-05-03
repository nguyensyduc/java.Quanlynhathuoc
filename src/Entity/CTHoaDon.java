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
public class CTHoaDon {
    private int id;
    private String masp;
    private int mahd;
    private int soluong;
    private int dongia;

    public CTHoaDon() {
    }

    public CTHoaDon(int id, String masp, int mahd, int soluong, int dongia) {
        this.id = id;
        this.masp = masp;
        this.mahd = mahd;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public int getMahd() {
        return mahd;
    }

    public void setMahd(int mahd) {
        this.mahd = mahd;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        return "CTHoaDon{" + "id=" + id + ", masp=" + masp + ", mahd=" + mahd + ", soluong=" + soluong + ", dongia=" + dongia + '}';
    }
    
}
