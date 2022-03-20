package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: Department insert ===");
		Department dep = new Department(null, "Test");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
	}

}
