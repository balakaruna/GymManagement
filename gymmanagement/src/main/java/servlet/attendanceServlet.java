package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.attendanceConnection;
import entity.attendance;

/**
 * Servlet implementation class attendanceServlet
 */
public class attendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public attendanceServlet() {
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
		attendance ad=new attendance();
		ad.setMemberId(Integer.parseInt(request.getParameter("memberId")));
        String name = request.getParameter("check");
        attendanceConnection a=new attendanceConnection();
        try {
        	if ("IN".equals(name)) {
        		a.checkIn(ad);
           } else if ("OUT".equals(name)) {
        	   a.checkOut(ad);
           }
        
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
        System.out.println(name);
		
		
	}

}
