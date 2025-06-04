package huy.hdn.ck_63134195.model;

public class Data {
    int tien;
    String loai,nd, id, ngay;

    public int getTien() {
        return tien;
    }

    public void setTien(int tien) {
        this.tien = tien;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public Data(int tien, String loai, String nd, String id, String ngay) {
        this.tien = tien;
        this.loai = loai;
        this.nd = nd;
        this.id = id;
        this.ngay = ngay;
    }

}
