package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao department = DaoFactory.createDepartmentDao();
		
		System.out.println("===== Teste #1: Insert department =====");
		
		
	}

}
