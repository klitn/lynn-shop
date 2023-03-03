/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author 84335
 */
public class Hoadon {
    private int MaHD;
    private String DateOrder;
    private int Thanhtien;
    private String Tenkh;
    private String SDT;
    private String Manv;

    public Hoadon() {
    }

    public Hoadon(String DateOrder, int Thanhtien, String Tenkh, String SDT, String Manv) {
        this.DateOrder = DateOrder;
        this.Thanhtien = Thanhtien;
        this.Tenkh = Tenkh;
        this.SDT = SDT;
        this.Manv = Manv;
    }

    public Hoadon(int MaHD, String DateOrder, int Thanhtien, String Tenkh, String SDT, String Manv) {
        this.MaHD = MaHD;
        this.DateOrder = DateOrder;
        this.Thanhtien = Thanhtien;
        this.Tenkh = Tenkh;
        this.SDT = SDT;
        this.Manv = Manv;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getDateOrder() {
        return DateOrder;
    }

    public void setDateOrder(String DateOrder) {
        this.DateOrder = DateOrder;
    }

    public int getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(int Thanhtien) {
        this.Thanhtien = Thanhtien;
    }

    public String getTenkh() {
        return Tenkh;
    }

    public void setTenkh(String Tenkh) {
        this.Tenkh = Tenkh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }
    
}
    
    
