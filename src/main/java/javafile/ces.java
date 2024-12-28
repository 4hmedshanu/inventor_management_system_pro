 package javafile;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.CookieHandler;
import java.io.*;
import java.sql.*;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.Cookie.*;


@WebServlet("/Detail")
public class ces extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest requ, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		atribute ft=new atribute();
		ft.name=requ.getParameter("name");
		ft.Address=requ.getParameter("Address");
		ft.phone_number=Integer.parseInt(requ.getParameter("number"));
		ft.work=requ.getParameter("roll");
		String selet=requ.getParameter("select");
		jdbcwork in=new jdbcwork();
		if(selet.equals("employee")) {
			in.employee_td(ft.name, ft.phone_number, ft.Address, ft.work);
			out.print("suceesfull ");
		}
		else if(selet.equals("customer")) {
			 Cookie ck= new Cookie("id", "c");
			 resp.addCookie(ck);
			 in.customerinserted(ft.name, ft.phone_number, ft.Address, ft.work);
			 RequestDispatcher dis=requ.getRequestDispatcher("order.html");
			 dis.forward(requ, resp);
			 
		}
		else if(selet.equals("suppliers")) {
			 in.suppliers_td(ft.name, ft.phone_number, ft.Address, ft.work);
			 
		}
		
		
	}

}
