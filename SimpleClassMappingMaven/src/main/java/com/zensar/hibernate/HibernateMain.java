package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

/*
 * @author: Himanshu
 * @creation date: 1/10/2019
 * @description: hibernate project demo
 */
public class HibernateMain 
{
    public static void main( String[] args )
    {
       Configuration con = new Configuration().configure();
       SessionFactory sf = con.buildSessionFactory();
       Session s = sf.openSession();
       Transaction tx = s.beginTransaction();
       
       Product product = new Product();
       product.setProductId(1008);
       product.setBrand("xiomi");
       product.setName("MiA1");
       product.setPrice(13999);
       
       s.save(product);
       System.out.println("product is saved");
       
       
       tx.commit();
       s.close();
       System.exit(0);
    }
}
