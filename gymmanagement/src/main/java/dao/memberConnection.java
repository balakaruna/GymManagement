package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import DB.DBConnection;
import entity.member;

public class memberConnection {

	public static void addMember(member m)  {
		try {
		String query="insert into memberTable(mname,DOB,address,phn,email,Joindate,trainerId) values(?,?,?,?,?,?,?)";
		Connection con =DBConnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1,m.getName());
		String dateString = m.getDob(); 
	    SimpleDateFormat sdf = new SimpleDateFormat(m.getDob());
	    java.util.Date utilDate=sdf.parse(dateString);
	    java.sql.Date sqlDate1 = new java.sql.Date(utilDate.getTime());
	    pst.setDate(2,sqlDate1 );
		pst.setString(3,m.getAddress());
		pst.setLong(4, m.getPhn());
	    pst.setString(5,m.getEmail());
	    java.util.Date utilDate1= new java.util.Date();
        java.sql.Date sqlDate=new java.sql.Date(utilDate1.getTime());
        pst.setDate(6, sqlDate);
	    
	    pst.setInt(7, m.getTrainerId());
	    
	    pst.execute();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
