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
public class HoaDon {
    private int mahd;
    private String manv;
    private String thoigianban;
    private int tongtien;

    public HoaDon() {
    }

    public HoaDon(int mahd, String manv, String thoigianban, int tongtien) {
        this.mahd = mahd;
        this.manv = manv;
        this.thoigianban = thoigianban;
        this.tongtien = tongtien;
    }

    public int getMahd() {
        return mahd;
    }

    public void setMahd(int mahd) {
        this.mahd = mahd;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getThoigianban() {
        return thoigianban;
    }

    public void setThoigianban(String thoigianban) {
        this.thoigianban = thoigianban;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "mahd=" + mahd + ", manv=" + manv + ", thoigianban=" + thoigianban + ", tongtien=" + tongtien + '}';
    }
    
    
}
