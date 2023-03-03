/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 84335
 */
public class sanpham {
    private int Id;
    private String Masp,Tensp,Loai;
    private int Soluong;
    private float Gia;

    public sanpham() {
    }

    public sanpham(String Masp, String Tensp, String Loai, int Soluong, float Gia) {
        this.Masp = Masp;
        this.Tensp = Tensp;
        this.Loai = Loai;
        this.Soluong = Soluong;
        this.Gia = Gia;
    }

    public sanpham(int Id, String Masp, String Tensp, String Loai, int Soluong, float Gia) {
        this.Id = Id;
        this.Masp = Masp;
        this.Tensp = Tensp;
        this.Loai = Loai;
        this.Soluong = Soluong;
        this.Gia = Gia;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMasp() {
        return Masp;
    }

    public void setMasp(String Masp) {
        this.Masp = Masp;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }
    
}
