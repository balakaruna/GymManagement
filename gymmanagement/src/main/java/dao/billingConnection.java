package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DB.DBConnection;
import entity.billing;

public class billingConnection {

	public static void addfee(billing b) {
		System.out.println("billing loaded");
		String amountstatus="paid";
		String query="insert into billingtable(memberId,amount,amountstatus,edate)values(?,?,?,?)";
		Connection con;
		try {
			con = DBConnection.getConnection();
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1,b.getMemberId());
			pst.setInt(2, b.getAmount());
			pst.setString(3,amountstatus);
			java.util.Date utilDate= new java.util.Date();
	        java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
	        pst.setDate(4, sqlDate);
	        pst.execute();
	        	
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
