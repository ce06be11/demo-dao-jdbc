package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao department = DaoFactory.createDepartmentDao();
		
		System.out.println("===== Teste #1: Find department by Id =====");
		Department dep = department.findById(3);
		System.out.println(dep);
		
		System.out.println("===== Teste #2: Insert department =====");
		dep = new Department(null, "Teste");
		department.insert(dep);
		System.out.println(department.findById(dep.getId()));
		
		DB.closeConnection();
	}

}
