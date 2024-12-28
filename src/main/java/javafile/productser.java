package javafile;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;


@WebServlet("/prohtml")
public class productser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest requ, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String pro_name=requ.getParameter("us_name");
		String pro_descrip=requ.getParameter("descrip");
		String pri= requ.getParameter("price_pro");
		int price=Integer.parseInt(pri);
		
		jdbcwork jb=new jdbcwork();
		int i=jdbcwork.categ_last();
		jdbcwork.creproduct_td( pro_name, pro_descrip, i, price);
	}

}
