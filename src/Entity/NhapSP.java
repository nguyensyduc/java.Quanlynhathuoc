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
public class NhapSP {
    private String masp;
    private String tensp;
    private int gia;
    private String donvi;
    private int soLuong;
    private String ngaynhap;
    private String ngayhethan;
    private String loadImage;
    private String ncc;

    public NhapSP() {
    }

    public NhapSP(String masp, String tensp, int gia, String donvi, int soLuong, String ngaynhap, String ngayhethan, String loadImage, String ncc) {
        this.masp = masp;
        this.tensp = tensp;
        this.gia = gia;
        this.donvi = donvi;
        this.soLuong = soLuong;
        this.ngaynhap = ngaynhap;
        this.ngayhethan = ngayhethan;
        this.loadImage = loadImage;
        this.ncc = ncc;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getNgayhethan() {
        return ngayhethan;
    }

    public void setNgayhethan(String ngayhethan) {
        this.ngayhethan = ngayhethan;
    }

    public String getLoadImage() {
        return loadImage;
    }

    public void setLoadImage(String loadImage) {
        this.loadImage = loadImage;
    }

    public String getNcc() {
        return ncc;
    }

    public void setNcc(String ncc) {
        this.ncc = ncc;
    }

    @Override
    public String toString() {
        return tensp ;
    }

    

    
}
