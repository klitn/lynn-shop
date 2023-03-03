/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 84335
 */
public class SanphamCT {
    private int id;
    private String Masp;
    private int Soluong;
    private float Gia;

    public SanphamCT(String Masp, int Soluong, float Gia) {
        this.Masp = Masp;
        this.Soluong = Soluong;
        this.Gia = Gia;
    }

    public SanphamCT() {
    }

    public SanphamCT(int id, String Masp, int Soluong, float Gia) {
        this.id = id;
        this.Masp = Masp;
        this.Soluong = Soluong;
        this.Gia = Gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasp() {
        return Masp;
    }

    public void setMasp(String Masp) {
        this.Masp = Masp;
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
