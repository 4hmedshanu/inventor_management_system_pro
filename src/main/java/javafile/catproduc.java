package javafile;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;


@WebServlet("/cate")
public class catproduc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest requ, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		atribute ft=new atribute();
		ft.name=requ.getParameter("us_name");
		ft.description=requ.getParameter("descrip"); 
		ft.tem=requ.getParameter("cat_select");
		
		if(ft.tem.equals("product")) {
			RequestDispatcher re=requ.getRequestDispatcher("product.html");
			jdbcwork set=new jdbcwork();
			set.categories_td(ft.name, ft.description);
			re.forward(requ, resp);
		}
		else {
			jdbcwork set=new jdbcwork();
			set.categories_td(ft.name, ft.description);
			out.print("suceesefull completed ");
		}
	}

}
