package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entidades.Department;
import model.entidades.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
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
		
		System.out.println("===TEST 4: seller Insertion ===");
		Seller newSeller = new Seller (null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		
		System.out.println("inserido! Novo Id = " + newSeller.getId());
		
		System.out.println("===TEST 5: seller Insertion ===");
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		sellerDao.update(seller);
		System.out.println("Update Completed");
		
		System.out.println("===TEST 6: Seller Delete ===");
		System.out.println("Entre com um Id para ser deletado");
		int id = sc.nextInt();
		
		sellerDao.deleteById(id);
		System.out.println("Funcionario com ID " + id +" apagado com sucesso");
		
		sc.close();
		
	}
	
}
