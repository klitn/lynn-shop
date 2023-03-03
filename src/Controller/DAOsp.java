/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.sanpham;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 84335
 */
public class DAOsp {
    private Connection conn;
	public DAOsp() {
		
		try {
			String url="jdbc:mysql://localhost:3306/qlicuahang";
			String user="root";
			String password="";
			conn = (Connection) DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
        public ArrayList<sanpham> getListSP(){
		ArrayList<sanpham> list= new ArrayList<>();
		String sql="SELECT * FROM sanpham"
                        +"";
                        
		try {
			
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				sanpham s=new sanpham();
                                s.setId(rs.getInt("ID"));
                                s.setMasp(rs.getString("Masp"));
                                s.setTensp(rs.getString("Tensp"));
                                s.setLoai(rs.getString("Loai"));
                                s.setSoluong(rs.getInt("Soluong"));
                                s.setGia(rs.getFloat("Gia"));
                                list.add(s);
                                 
			 }
		} catch (SQLException e) {
			// TODO: handle exception
                        e.printStackTrace();
		}
		return list;
	
	}
        public void DeleteSP(int id){
            String sql="DELETE FROM sanpham WHERE ID=?";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, id);
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        public void AddSP(sanpham s){
            String sql = "INSERT INTO sanpham(Masp, Tensp, Loai, Soluong, Gia)"
					+ "VALUES (?, ?, ?, ?, ?)";
               try {
                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setString(1, s.getMasp());
                ps.setString(2, s.getTensp());
                ps.setString(3, s.getLoai());
                ps.setInt(4, s.getSoluong());
                ps.setFloat(5, s.getGia());
                ps.executeUpdate();
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        public ArrayList<sanpham> findbyName(String Name){
            ArrayList<sanpham> list = new ArrayList<>();
            String sql="SELECT * FROM sanpham WHERE Tensp like ?";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1,"%"+Name+"%");
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
		
                sanpham s=new sanpham();
                s.setId(rs.getInt("ID"));
                s.setMasp(rs.getString("Masp"));
                s.setTensp(rs.getString("Tensp"));
                s.setLoai(rs.getString("Loai"));
                s.setSoluong(rs.getInt("Soluong"));
                s.setGia(rs.getFloat("Gia"));
                list.add(s);
			 }
            } catch (Exception e) {
            }
        return list;
        }
        
        public ArrayList<sanpham> findbyMasp(String Masp){
            ArrayList<sanpham> list = new ArrayList<>();
            String sql="SELECT * FROM sanpham WHERE Masp like ?";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1,"%"+Masp+"%");
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
		
                sanpham s=new sanpham();
                s.setId(rs.getInt("ID"));
                s.setMasp(rs.getString("Masp"));
                s.setTensp(rs.getString("Tensp"));
                s.setLoai(rs.getString("Loai"));
                s.setSoluong(rs.getInt("Soluong"));
                s.setGia(rs.getFloat("Gia"));
                list.add(s);
			 }
            } catch (Exception e) {
            }
        return list;
        }
        public static void main(String[] args) {
		new DAOsp();
	}
}
