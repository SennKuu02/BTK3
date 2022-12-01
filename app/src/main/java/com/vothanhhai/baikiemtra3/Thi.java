package com.vothanhhai.baikiemtra3;

public class Thi {
    String tenThi, moTa;
    private int resourceId;

    public Thi(String tenThi, String moTa, int resourceId) {
        this.tenThi = tenThi;
        this.moTa = moTa;
        this.resourceId = resourceId;
    }

    public String getTenThi() {
        return tenThi;
    }

    public void setTenThi(String tenThi) {
        this.tenThi = tenThi;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
