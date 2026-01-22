package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert (Department dep);
	void update (Department dep);
	void deleteById (Department dep);
	void findById (Department dep);
	void findAll (Department dep);
	Department findById (Integer id);
	List<Department> findAll();

}
