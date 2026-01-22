package application;

import java.sql.Connection;

import db.DB;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		Department dep = new Department();
		Seller slr = new Seller();
		
		
		System.out.println(dep);
		System.out.println(slr);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		
		System.out.println("Connection succesfully!");
		DB.closeConnection();
		System.out.println("---->>>\n\n");
		System.out.println("Desconnection succesfully!");
	}

}
