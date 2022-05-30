package com.example.nguyenkhoa;

public class Thongtin {
    int img;
    String ngay;
    String tieude;

    public Thongtin(int img, String ngay, String tieude) {
        this.img = img;
        this.ngay = ngay;
        this.tieude = tieude;
    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }
}
