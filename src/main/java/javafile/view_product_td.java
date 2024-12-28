package javafile;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
import java.sql.*;


@WebServlet("/product")
public class view_product_td extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String q="select product_td.pro_id , pro_name ,   cate_id , price , cate_name , Description from product_td inner join  categories_td on product_td.categ_id =categories_td.cate_id;";
		try {
			Connection con=connectorjdbc.getcon();
			Statement st=con.createStatement();
			ResultSet re=st.executeQuery(q);
			out.print("<table border >");
			out.print("<tr>");
			out.print("<th>");
			out.print("product_id");
			out.print("</th>");
			
			out.print("<th>");
			out.print("product_name");
			out.print("</th>");
			
			out.print("<th>");
			out.print("categori_id");
			out.print("</th>");
			
			out.print("<th>");
			out.print("price");
			out.print("</th>");
			
			out.print("<th>");
			out.print("categori_name");
			out.print("</th>");
			
			out.print("<th>");
			out.print("Description");
			out.print("</th>");
			
			out.print("</tr>");
			while(re.next()) {
				out.print("<tr>");
				out.print("<td>");
				out.print(re.getInt("product_td.pro_id"));
				out.print("</td>");
				
				out.print("<td>");
				out.print(re.getString("product_td.pro_name"));
				out.print("</td>");
				
				out.print("<td>");
				out.print(re.getInt("categories_td.cate_id"));
				out.print("</td>");
				
				
				out.print("<td>");
				out.print(re.getInt("product_td.price"));
				out.print("</td>");
				
				
				out.print("<td>");
				out.print(re.getString("categories_td.cate_name"));
				out.print("</td>");
				
				out.print("<td>");
				out.print(re.getString("categories_td.Description"));
				out.print("</td>");
				
				out.print("<tr>");
			}
			out.print("</table>");
		}catch(Exception e) {
			
		}
		
	}

	

}
