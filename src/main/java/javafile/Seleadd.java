package javafile;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;


@WebServlet("/seleadd")
public class Seleadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest requ, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String value=requ.getParameter("form");
		if(value.equals("cat")) {
			RequestDispatcher re =requ.getRequestDispatcher("categori.html");
			re.forward(requ, resp);
		}
		else if(value.equals("pro")) {
			RequestDispatcher re =requ.getRequestDispatcher("product.html");
			re.forward(requ, resp);
		}
		else if(value.equals("ord")) {
			RequestDispatcher re =requ.getRequestDispatcher("order.html");
			re.forward(requ, resp);
		}
		else if(value.equals("no")) {
			out.print("invali DETAILS");
		}
		else  {
			RequestDispatcher re =requ.getRequestDispatcher("cust_emp_detail.html");
			re.forward(requ, resp);
		}
		
	}

	

}
