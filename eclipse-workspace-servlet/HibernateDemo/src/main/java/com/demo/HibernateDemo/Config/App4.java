package com.demo.HibernateDemo.Config;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.demo.HibernateDemo.Config.entities.Category;
import com.demo.HibernateDemo.Config.entities.Product;

public class App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtility.getSessionFactoryObject();
		 Session session=sessionFactory.openSession();
		 session.beginTransaction();
		 Category catObj=new Category("Book","Book");
		 Product prdObj=new Product("Java",800);
		 prdObj.setPrdCategory(catObj);
		 session.persist(catObj);
		 session.persist(prdObj);
		 prdObj=new Product("Mysql",1200);
		 prdObj.setPrdCategory(catObj);
		 session.persist(prdObj);
		 session.getTransaction().commit();
		 session.close();
		 Session session1=sessionFactory.openSession();
		 catObj=session1.get(Category.class, 1);
		 System.out.println(catObj);
		 List<Product> products=catObj.getProducts();
		 products.forEach(System.out::println);
		 session1.close();		
	}

}

