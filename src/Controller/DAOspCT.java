/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.SanphamCT;
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
public class DAOspCT {
    private Connection conn;
    public DAOspCT() {
		
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
    public ArrayList<SanphamCT> getListSP(){
		ArrayList<SanphamCT> list= new ArrayList<>();
		String sql="SELECT * FROM sanphamct";
                        
                        
		try {
			
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				SanphamCT s=new SanphamCT();
                                s.setId(rs.getInt("ID"));
                                s.setMasp(rs.getString("Masp"));
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
    public void AddSP(SanphamCT s){
            String sql = "INSERT INTO sanphamct(Masp,Soluong, Gia)"
					+ "VALUES (?, ?, ?)";
               try {
                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setString(1, s.getMasp());
                ps.setInt(2, s.getSoluong());
                ps.setFloat(3, s.getGia());
                ps.executeUpdate();
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    public void DeleteSP(int id){
            String sql="DELETE FROM sanphamct WHERE ID=?";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, id);
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
     public void DeleteTableSPct(){
            String sql="TRUNCATE TABLE sanphamct";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
    public static void main(String[] args) {
        new DAOspCT();
    }
}

    
