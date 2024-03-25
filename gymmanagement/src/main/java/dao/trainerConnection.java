package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import DB.DBConnection;
import entity.trainer;

public class trainerConnection {
	
	public static void addTrainer(trainer t)  {
		
		try{String query="insert into trainerTable(tname,DOB,address,phn,email,Joindate) values(?,?,?,?,?,?)";
		Connection con =DBConnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1,t.getName());
		String dateString = t.getDob(); 
	    SimpleDateFormat sdf = new SimpleDateFormat(t.getDob());
	    java.util.Date utilDate = sdf.parse(dateString);

	    java.sql.Date sqlDate1 = new java.sql.Date(utilDate.getTime());

	            
	    pst.setDate(2, sqlDate1);    
		pst.setString(3,t.getAddress());
		pst.setLong(4, t.getPhn());
	    pst.setString(5,t.getEmail());
	    java.util.Date utilDate1= new java.util.Date();
        java.sql.Date sqlDate=new java.sql.Date(utilDate1.getTime());
       
	    pst.setDate(6,sqlDate);
	   // pst.executeQuery();
	    pst.execute();
	    
		
	 
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
