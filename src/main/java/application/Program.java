package application;

import model.dao.SellerDao;
import model.dao.impl.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("TEST 2: seller findByDepartment");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for(Seller obj: list){
            System.out.println(obj);
        }

        System.out.println("TEST 3: seller findAll");
        List<Seller> list1 = sellerDao.findAll();

        for(Seller obj: list1){
            System.out.println(obj);
        }

        System.out.println("TEST 4: seller Insert");
        Seller newSeller = new Seller(null, "Greg", "greg@gma.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println(newSeller.getId());

        System.out.println("TEST 5: seller Update");
        Seller seller = sellerDao.findById(1);
        seller.setName("Martha Souza");
        sellerDao.update(seller);
        System.out.println("Updated completed");

        System.out.println("TEST 6: seller Delete");
        System.out.println("Leia um id para excluir: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completo");

    }

}