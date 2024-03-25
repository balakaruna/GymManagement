package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.memberConnection;
import dao.trainerConnection;
import entity.member;

/**
 * Servlet implementation class memberServlet
 */
public class memberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public memberServlet() {
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
		System.out.println("loaded");

		member m=new member();
		m.setName(request.getParameter("name"));
		m.setDob(request.getParameter("dateOfBirth"));
		m.setAddress(request.getParameter("address"));
		m.setPhn(Long.parseLong(request.getParameter("contact")));
		m.setEmail(request.getParameter("email"));
		m.setTrainerId(Integer.parseInt(request.getParameter("trainerId")));
		memberConnection mc=new memberConnection();
		try {
			mc.addMember(m);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(request.getParameter("name"));

		
	}

}
