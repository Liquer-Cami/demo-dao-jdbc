package application;

import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.impl.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartment();

        System.out.println("TEST 2: Department findById");
        Department dep1 = departmentDao.findById(1);

        System.out.println(dep1);

        System.out.println("TEST 3: seller findAll");
        List<Department> list1 = departmentDao.findAll();

        for(Department obj: list1) {
            System.out.println(obj);
        }

        System.out.println("TEST 4: seller Insert");
        Department department = new Department(null, "Qualidade e dev");
        departmentDao.insert(department);
        System.out.println(department.getId());

        System.out.println("TEST 5: seller Update");
        Department department2 = departmentDao.findById(1);
        department2.setName("Testes e Qualidade");
        departmentDao.update(department2);
        System.out.println("Updated completed");



    }


}
