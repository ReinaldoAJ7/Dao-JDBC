package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	void insert (Seller slr);
	void update (Seller slr);
	void deleteById (Seller slr);
	void findById (Seller slr);
	void findAll (Seller slr);
	Seller findById (Integer id);
	List<Seller> findAll();
	
}
