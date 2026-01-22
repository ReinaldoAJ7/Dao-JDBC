package application;

import java.sql.Connection;
import java.util.Date;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		Department dep = new Department(1, "Books");
		Seller slr = new Seller(1, "Reinaldo Almeida de Jesus", "reinaldojesus238@gnail.com", new Date(), 23500.0, dep);
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		System.out.println(dep);
		System.out.println(slr);
		System.out.println(sellerdao);
		
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		
		System.out.println("Connection succesfully!");
		DB.closeConnection();
		System.out.println("---->>>\n\n");
		System.out.println("Desconnection succesfully!");
	}

}
