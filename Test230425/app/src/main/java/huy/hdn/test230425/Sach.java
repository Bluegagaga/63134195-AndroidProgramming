package huy.hdn.test230425;

public class Sach {
    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getTrang() {
        return trang;
    }

    public void setTrang(int trang) {
        this.trang = trang;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    int ma, trang, gia;
    String ten, mota;

    public Sach(int ma, String ten, int trang, int gia, String mota) {
        this.ma = ma;
        this.trang = trang;
        this.gia = gia;
        this.ten = ten;
        this.mota = mota;
    }
}
