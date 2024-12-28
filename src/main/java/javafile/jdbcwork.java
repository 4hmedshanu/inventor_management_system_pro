package javafile;
import java.sql.*;
import java.io.*;
import java.net.CookieHandler;
public class jdbcwork {
//	 customer_inserted(table);
	public static void customerinserted(String cn, int number, String add, String work) {
		String st="insert into customer_td (cust_name, phone_number, cust_work, Address ) values(?,?,?,?)";
		try {
			Connection con=connectorjdbc.getcon();
			PreparedStatement p=con.prepareStatement(st);
			p.setString(1, cn);
			p.setInt(2, number);
			p.setString(3, work);
			p.setString(4, add);
			p.executeUpdate();
			con.close();
		}catch (Exception e) {
			
		}
	}
// 	employee_inserted(table);
	public static void employee_td(String cn, int number, String add, String work) {
		String q="insert into employee_td (empl_name, phone_number, Address, emplo_work) values (?,?,?,?)";
		try {
			Connection con=connectorjdbc.getcon();
			PreparedStatement p=con.prepareStatement(q);
			p.setString(1, cn);
			p.setInt(2, number);
			p.setString(3, add);
			p.setString(4, work);
			p.executeUpdate();
			con.close();
		}catch(Exception e) {
			
		}
	}
//   suppliers_inserted(table);
	public static void suppliers_td(String cn, int number, String add, String work) {
		String q="insert into suppliers_td (sup_name , sup_work  , phone_number , Address) values(?,?,?,?)";
		try { 
			Connection con=connectorjdbc.getcon();
			PreparedStatement p=con.prepareStatement(q);
			p.setString(1, cn);
			p.setString(2, work);
			p.setInt(3, number);
			p.setString(4, add);
			p.executeUpdate();
			con.close();
		}catch(Exception e) {
			
		}
	}
	
//	categories_td inserted ;
	
	public static void categories_td(String cn, String des) {
		String q="insert into categories_td (cate_name, Description) values(?,?)";
		try {
			Connection con=connectorjdbc.getcon();
			PreparedStatement pt=con.prepareStatement(q);
			pt.setString(1, cn);
			pt.setString(2, des);
			pt.executeUpdate();
			con.close();
		}catch(Exception e) {
			
		}
	}
	
// product_td inserted ;
	
	public static void creproduct_td( String pro_name, String descrip, int cat_id , int price) {
		String q="insert into product_td (pro_name , descrip,  price , categ_id) values(?,?,?,? )";
		try {
			Connection con=connectorjdbc.getcon();
			PreparedStatement pt=con.prepareStatement(q);
			pt.setString(1,pro_name);
			pt.setString(2, descrip);
			pt.setInt(3, price);
			pt.setInt(4, cat_id);
			pt.executeUpdate();
			con.close();
		}catch(Exception e) {
			
		}
	}
	
	
//	delete catg
	
	
	
	
	
	// last element in database ;
	
	
	
	
//	 last element id categories_td  database;
	
	public static int categ_last() {
		
		try {
			int tem=0;
			Connection con=connectorjdbc.getcon();
			Statement st=con.createStatement();
			String q="select * from categories_td order by cate_id";
			ResultSet re=st.executeQuery(q);
			while(re.next()) {
				int i=re.getInt("cate_id");
				tem=i;
			}
			con.close();
			return tem;
			
		}catch(Exception e) {
			return -1;
		}
	}
	

	
	

}
