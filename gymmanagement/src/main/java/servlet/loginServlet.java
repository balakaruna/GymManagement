package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DB.DBConnection;
import dao.loginConnection;
import entity.login;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		login l=new login();
		l.setUname(request.getParameter("name"));
		l.setUpassword(request.getParameter("password"));
		loginConnection lc=new loginConnection();
		String name="";

		try {
			//lc.loginEntry(l);
			Connection con =DBConnection.getConnection();
			
			PreparedStatement ps = con.prepareStatement("select uname from login where uname=? and upassword=?");
			ps.setString(1,l.getUname());
			ps.setString(2,l.getUpassword());
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("move to next page...");
				
				RequestDispatcher rd1=request.getRequestDispatcher("HomePage.jsp");
				rd1.forward(request, response);
				
				
			}else {
				System.out.println("try agin...");

			}



			
		}catch(Exception e) {
		e.printStackTrace();	
		}
	}

}
