package model.dao;

import java.util.List;

import model.entities.Seller;

public class SellerDao {
	public interface DepartmentDao {
		
		void insert(Seller obj);
		void update (Seller obj);
		void deleteByid(Integer id);
		Seller findById(Integer id);
		List<Seller> findAll();
}
}