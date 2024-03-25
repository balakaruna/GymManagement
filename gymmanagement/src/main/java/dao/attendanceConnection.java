package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import DB.DBConnection;
import entity.attendance;

public class attendanceConnection {

	public static void checkIn(attendance a) throws SQLException, ClassNotFoundException {
		System.out.println("loaded");
		
	    String query = "INSERT INTO attendanceTable (memberId, edate, checkIn) VALUES (?, CURRENT_DATE(), CURRENT_TIME())";

		Connection con =DBConnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
        pst.setInt(1,a.getMemberId());
        pst.execute();

	}
	
	public static void checkOut(attendance a) throws SQLException, ClassNotFoundException {
		String query="UPDATE attendanceTable SET chechkout =CURRENT_TIME() WHERE memberId = ?";
		Connection con =DBConnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);      
        pst.setInt(1,a.getMemberId());
        pst.execute();

	}

}
