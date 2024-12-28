package javafile;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
import java.sql.*;
import jakarta.servlet.http.Cookie.*;

/**
 * Servlet implementation class view_categories_td
 */
@WebServlet("/categori")
public class view_categories_td extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest requ, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String q="select * from categories_td";
		try {
			Connection con=connectorjdbc.getcon();
			Statement st=con.createStatement();
			ResultSet re=st.executeQuery(q);
			out.print("<table border >");
			out.print("<tr>");
			
			out.print("<th>");
			out.print("name");
			out.print("</th>");
			
			out.print("<th>");
			out.print("id");
			out.print("</th>");
			
			out.print("<th>");
			out.print("Description");
			out.print("</th>");
			
			
			out.print("<th>");
			out.print("action");
			out.print("</th>");
			
			out.print("<th>");
			out.print("update");
			out.print("</th>");
			
			
			
			out.print("</tr>");
			while(re.next()) {
				out.print("<tr>");
				out.print("<td>");
				out.print(re.getString("cate_name"));
				out.print("</td>");
				
				int i=re.getInt("cate_id"); 
				out.print("<td>");
				out.print(re.getInt("cate_id"));
				out.print("</td>");
				
				out.print("<td>");
				out.print(re.getString("Description"));
				out.print("</td>");
				
				out.print("<td>");
				out.print("<a href=delete_category >Delete</a>");
				out.print("</td>");
				
				
				out.print("<td>");
				out.print("<a>modify</a>");
				out.print("</td>");
				
				
				out.print("</tr>");
			}
			out.print("<tr >");
			
			out.print("<td>");
			out.print("<a href=categori.html >ADD</a>");
			out.print("</td>");
			out.print("</tr>");
			out.print("</table>");
			
		}catch(Exception e) {
			
		}
		
	}

	

}
