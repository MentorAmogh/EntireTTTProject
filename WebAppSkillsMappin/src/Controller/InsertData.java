package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class InsertData
 */
@WebServlet("/register")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter(); 
		
		String EmpId=request.getParameter("txtId");
		String Name=request.getParameter("txtName");
		String Password=request.getParameter("txtPassword");
		String Email=request.getParameter("txtEmail");
		String Address=request.getParameter("txtAddress");
		String Phone=request.getParameter("txtPhone");
		String DateofBirth=request.getParameter("txtDob");
		String IBUname=request.getParameter("txtBUIName");
		String Status=request.getParameter("txtStatus");
		String City=request.getParameter("txtCity");
		String Role=request.getParameter("txtName");
		String Nationality=request.getParameter("txtName");
		String Gender=request.getParameter("gender");
		out.println("Employee Id"+EmpId+" "+Name+" "+Password+" "+Email+" "+Address);
		doGet(request, response);
		
	}

}
