package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//		System.out.println("=== TEST 1: Department insert ===");
//		Department dep = new Department(null, "Test");
//		departmentDao.insert(dep);
//		System.out.println("Inserted! New id = " + dep.getId());
//
//		System.out.println("=== TEST 2: Department update ===");
//		dep.setName("Testing");
//		departmentDao.update(dep);
//		System.out.println("Update completed!");
//
//		System.out.println("=== TEST 3: Department delete ===");
//		departmentDao.deleteById(11);
//		System.out.println("Delete completed!");

//		System.out.println("=== TEST 4: Department findById ===");
//		Department dep = departmentDao.findById(6);
//		System.out.println(dep);

		System.out.println("=== TEST 5: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

	}

}
