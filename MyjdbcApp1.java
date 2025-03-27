//package com.jdbcDemo;
//import java.sql.*;
//public class MyjdbcApp1 {
//
//	public static void main(String []args) {
//		try
//		{
//			Class.forName("oracle.jdbc.OracleDriver");
//			System.out.println("Driver loaded successfully!");
//			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//shikha:1521/orcl","hr","hr");
//			System.out.println("Connection successfully to the DB");
//			Statement st = conn.createStatement();
//			ResultSet rs = st.executeQuery("select bookname,bookprice from allbooks");
//			while(rs.next()) {
//				String name = rs.getString(1);
//				double price = rs.getDouble(2);
//				System.out.println(name+"\t"+price);
//			}
//			conn.close();
//			System.out.println("Disconnected successfully from the DB");
//		}
//		catch(ClassNotFoundException cnf) {
//			System.out.println("Cannot load the driver");
//			cnf.printStackTrace();
//		}
//		catch(SQLException ex) {
//			System.out.println("DB Error");
//			ex.printStackTrace();
//		}
//	}
//}
