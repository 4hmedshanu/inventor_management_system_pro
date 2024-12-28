package javafile;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.io.*;


@WebServlet("/customer_td")
public class view_customer_td extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException  {
		atribute ft=new atribute();
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		try {
			Connection con=connectorjdbc.getcon();
			Statement st=con.createStatement();
			String q="select * from customer_td ";
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
			out.print("contact");
			out.print("</th>");
			
			out.print("<th>");
			out.print("Address");
			out.print("</th>");
			
			out.print("<th>");
			out.print("work");
			out.print("</th>");
			out.print("</tr>");
			while(re.next()) {
				out.print("<tr>");
				out.print("<td>");
				out.print(ft.name=re.getString("cust_name"));
				out.print("</td>");
				out.print("<td>");
				out.print( ft.categ_id=re.getInt("cust_id"));
				out.print("</td>");
				out.print("<td>");
				out.print( ft.phone_number=re.getInt("phone_number"));
				out.print("</td>");
				out.print("<td>");
				out.print( ft.Address=re.getString("Address"));
				out.print("</td>");
				out.print("<td>");
				out.print( ft.work=re.getString("cust_work"));
				out.print("</td>");
				out.print("</tr>");
			}
			out.print("</table>");
			
		}catch(Exception e) {
			out.print(e.getMessage());
		}
	}
	

}