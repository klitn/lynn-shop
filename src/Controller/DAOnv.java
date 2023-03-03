/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Nhanvien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 84335
 */
public class DAOnv {
    private Connection conn;
	public DAOnv() {
		
		try {
			String url="jdbc:mysql://localhost:3306/qlicuahang";
			String user="root";
			String password="";
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<Nhanvien> getListNV(){
		ArrayList<Nhanvien> list= new ArrayList<>();
		String sql="SELECT * FROM nhanvien";
                        
                        
		try {
			
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				 Nhanvien n = new Nhanvien();
				 n.setId(rs.getInt("ID"));
				 n.setManv(rs.getString("Manv"));
				 n.setTennv(rs.getString("Tennv"));
				 n.setChucvu(rs.getString("Vitri"));
				 n.setDate(rs.getString("Ngaysinh"));
				 n.setGt(rs.getString("Gioitinh"));
				 n.setDiachi(rs.getString("Diachi"));
				 n.setSDT(rs.getInt("SDT"));
				 n.setEmail(rs.getString("Email"));
				 n.setLuong(rs.getInt("Luong"));
				 list.add(n);
			 }
		} catch (Exception e) {
			// TODO: handle exception
                        e.printStackTrace();
		}
		return list;
	
	}
	
        public  ArrayList<String> LoadDataToCombobox(){
		ArrayList<String> list= new ArrayList<>();
		String sql="SELECT * FROM nhanvien WHERE Vitri LIKE '(BH) Bán Hàng'";
                        
                        
		try {
			
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				 
				 list.add(rs.getString("Manv"));
			 }
		} catch (SQLException e) {
			// TODO: handle exception
                        e.printStackTrace();
		}
		return list;
	
	}
       
        public void AddNV(Nhanvien n){
            
 String sql = "INSERT INTO nhanvien(Manv, Tennv, Vitri, Ngaysinh, Gioitinh, Diachi, SDT, Email, Luong)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
               try {
                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setString(1,n.getManv());
                ps.setString(2, n.getTennv());
                ps.setString(3, n.getChucvu());
                ps.setString(4, n.getDate());
                ps.setString(5,n.getGt());
                ps.setString(6, n.getDiachi());
                ps.setInt(7, n.getSDT());
                ps.setString(8,n.getEmail());
                ps.setInt(9, n.getLuong());
                ps.executeUpdate();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public void DeleteNV(int id){
            String sql="DELETE FROM nhanvien WHERE ID=?";
            try {
                PreparedStatement ps=conn.prepareCall(sql);
                ps.setInt(1, id);
                ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        public ArrayList<Nhanvien> findbyName(String Name){
            ArrayList<Nhanvien> list = new ArrayList<>();
            String sql="SELECT * FROM nhanvien WHERE Tennv like ?";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1,"%"+Name+"%");
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
				 Nhanvien n = new Nhanvien();
				 n.setId(rs.getInt("ID"));
				 n.setManv(rs.getString("Manv"));
				 n.setTennv(rs.getString("Tennv"));
				 n.setChucvu(rs.getString("Vitri"));
				 n.setDate(rs.getString("Ngaysinh"));
				 n.setGt(rs.getString("Gioitinh"));
				 n.setDiachi(rs.getString("Diachi"));
				 n.setSDT(rs.getInt("SDT"));
				 n.setEmail(rs.getString("Email"));
				 n.setLuong(rs.getInt("Luong"));
				 list.add(n);
			 }
            } catch (Exception e) {
            }
        return list;
        }
        public ArrayList<Nhanvien> findbyManv(String Manv){
            ArrayList<Nhanvien> list = new ArrayList<>();
            String sql="SELECT * FROM nhanvien WHERE Manv like ?";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1,"%"+Manv+"%");
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
				 Nhanvien n = new Nhanvien();
				 n.setId(rs.getInt("ID"));
				 n.setManv(rs.getString("Manv"));
				 n.setTennv(rs.getString("Tennv"));
				 n.setChucvu(rs.getString("Vitri"));
				 n.setDate(rs.getString("Ngaysinh"));
				 n.setGt(rs.getString("Gioitinh"));
				 n.setDiachi(rs.getString("Diachi"));
				 n.setSDT(rs.getInt("SDT"));
				 n.setEmail(rs.getString("Email"));
				 n.setLuong(rs.getInt("Luong"));
				 list.add(n);
			 }
            } catch (Exception e) {
            }
        return list;
        }
        
	public static void main(String[] args) {
		new DAOnv();
	}
	
	
	
	
}
