package com.caps.mywebapp.servletsforjsps;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout2")
public class LogoutServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			//Invalid data
			session.invalidate();
			req.setAttribute("msg", "You are successfully logged out..!!");
		}else {
			//valid data
			req.setAttribute("msg", "sorry...try again!!!");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
	}//End of doGet()

}//End of class
