
package Entity;

public class QlyNV {
    private String manv;
    private String tennv;
    private int luongCb;
    private String quequan;
    private String ngaysinh;
    private String gioitinh;
    private String hinhanh;

    public QlyNV() {
    }

    public QlyNV(String manv, String tennv, int luongCb, String quequan, String ngaysinh, String gioitinh, String hinhanh) {
        this.manv = manv;
        this.tennv = tennv;
        this.luongCb = luongCb;
        this.quequan = quequan;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.hinhanh = hinhanh;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public int getLuongCb() {
        return luongCb;
    }

    public void setLuongCb(int luongCb) {
        this.luongCb = luongCb;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    @Override
    public String toString() {
        return tennv ;
    }

    
   
}
