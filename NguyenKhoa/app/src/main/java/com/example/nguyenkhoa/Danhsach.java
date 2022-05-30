package com.example.nguyenkhoa;

public class Danhsach {
    int logo;
    String ten;
    String ca;
    int icon;

    public Danhsach(int logo, String ten, String ca, int icon) {
        this.logo = logo;
        this.ten = ten;
        this.ca = ca;
        this.icon = icon;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
