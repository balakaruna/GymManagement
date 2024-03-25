package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DB.DBConnection;
import entity.login;
import jakarta.servlet.RequestDispatcher;

public class loginConnection {

	public static void loginEntry(login l) throws ClassNotFoundException, SQLException {
		String name="";
		Connection con =DBConnection.getConnection();
		
		PreparedStatement ps = con.prepareStatement("select uname from login where uname=? and upassword=?");
		ps.setString(1,l.getUname());
		ps.setString(2,l.getUpassword());
		ResultSet rs=ps.executeQuery();

//		if(rs.next()) {
//		name=rs.getString(1);	
//		}
		System.out.println(name);

		
		if(rs.next()) {
			System.out.println("move to next page...");
			
			
			
		}else {
			System.out.println("try agin...");

		}
		
	}
	
}
