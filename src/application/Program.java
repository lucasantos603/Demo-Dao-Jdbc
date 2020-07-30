package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entidades.Department;
import model.entidades.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("===TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("===TEST 2: seller findByDepartmentId ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDeparment(department);
		
		System.out.println("===TEST 3: seller findByAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}
