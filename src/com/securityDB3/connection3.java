package com.securityDB3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Set;

public class connection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "vine96");
		
		System.out.println(con);
	/*	Integer srno;
		InputStreamReader ii=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(ii);
		
		System.out.println("Enter Sr. No:");
		srno=Integer.parseInt(br.readLine());
	*/
		
	/*	String bookname;
		String geners;
		Integer price;
		Integer No_of_selling;
		
		InputStreamReader ii=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(ii);
		
		System.out.println("Enter Sr. No:");
		srno=Integer.parseInt(br.readLine());
		System.out.println("Enter Book Name:");
		bookname=br.readLine();
		System.out.println("Enter Geners");
		geners=br.readLine();
		System.out.println("Enter Price");
		price=Integer.parseInt(br.readLine());
		System.out.println("Enter No of selling");
		No_of_selling=Integer.parseInt( br.readLine());
	*/	
		// To load data in vehcile  
		PreparedStatement ps=con.prepareStatement("create table bar(srno int, liqur varchar2(15), price float) ");
		//	To insert data to ps 
	//	ps.setInt(1, srno);
	/*	ps.setString(2, bookname);
		ps.setString(3, geners);
		ps.setInt(4, price);
		ps.setInt(5, No_of_selling);
	*/	
		int i=ps.executeUpdate();
		System.out.println("Updated record"+i);
	
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
