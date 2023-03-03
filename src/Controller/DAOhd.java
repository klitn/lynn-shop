/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Hoadon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author 84335
 */
public class DAOhd {
    private Connection conn;
    public DAOhd() {
		
		try {
			String url="jdbc:mysql://localhost:3306/qlicuahang";
			String user="root";
			String password="";
			conn = (Connection) DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
                
    }
    public ArrayList<Hoadon> getListHD(){
		ArrayList<Hoadon> list= new ArrayList<>();
		String sql="SELECT * FROM hoadon"
                        +"";
                        
		try {
			
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				Hoadon h = new Hoadon();
				 h.setMaHD(rs.getInt("ID"));
                                 h.setDateOrder(rs.getString("NgayDatHang"));
                                 h.setThanhtien(rs.getInt("Thanhtien"));
                                 h.setTenkh(rs.getString("TenKhachHang"));
                                 h.setSDT(rs.getString("SDT"));
                                 h.setManv(rs.getString("Manv"));
				 list.add(h);
 
			 }
		} catch (Exception e) {
			// TODO: handle exception
                        e.printStackTrace();
		}
		return list;
	
	}
    public void AddHD(Hoadon h){
            String sql = "INSERT INTO hoadon(NgayDatHang, Thanhtien, TenKhachHang, SDT, Manv)"
					+ "VALUES (?, ?, ?, ?, ?)";
               try {
                PreparedStatement ps=conn.prepareStatement(sql);
               
               ps.setString(1, h.getDateOrder());
               ps.setInt(2, h.getThanhtien());
               ps.setString(3, h.getTenkh());
               ps.setString(4, h.getSDT());
               ps.setString(5, h.getManv());
               ps.executeUpdate();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
    public void DeleteHD(int id){
            String sql="DELETE FROM hoadon WHERE ID=?";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, id);
                ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    public ArrayList<Hoadon> findbyDate(String Date){
            ArrayList<Hoadon> list = new ArrayList<>();
            String sql="SELECT * FROM hoadon WHERE NgayDatHang like ?";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1,"%"+Date+"%");
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
		
                Hoadon h = new Hoadon();
				 h.setMaHD(rs.getInt("ID"));
                                 h.setDateOrder(rs.getString("NgayDatHang"));
                                 h.setThanhtien(rs.getInt("Thanhtien"));
                                 h.setTenkh(rs.getString("TenKhachHang"));
                                 h.setSDT(rs.getString("SDT"));
                                 h.setManv(rs.getString("Manv"));
				 list.add(h);
			 }
            } catch (Exception e) {
            }
        return list;
        }
    public static void main(String[] args) {
        new DAOhd();
    }
    
}
