package com.caps.mywebapp.servletsforjsps;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.caps.mywebapp.service.EmployeeService;
import com.caps.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/deleteEmployee2")
public class DeleteEmployeeServlet extends HttpServlet {
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			//valid session
			int empId=Integer.parseInt(req.getParameter("empId"));
			boolean isDeleted=service.deleteEmp(empId);
			if(isDeleted) {
				req.setAttribute("msg","given empid "+empId+"details deleted!");
			}else {
				req.setAttribute("msg", "empId"+empId+"not found..");
			}
			req.getRequestDispatcher("./deleteEmployeeFormJsp.jsp").include(req, resp);
		}else {
			//Invalid session
			req.setAttribute("msg", "please..login first");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}//End of doGet()
	}//End of doGet()

}//End of class
