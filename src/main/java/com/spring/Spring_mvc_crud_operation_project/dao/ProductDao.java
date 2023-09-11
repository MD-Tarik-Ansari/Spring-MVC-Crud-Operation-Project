package com.spring.Spring_mvc_crud_operation_project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.spring.Spring_mvc_crud_operation_project.dto.Product;
@Repository
public class ProductDao 
{
    EntityManager entityManager=Persistence.createEntityManagerFactory("ansari").createEntityManager();
    
    EntityTransaction entityTransaction=entityManager.getTransaction();
    
    public Product saveProduct(Product product)
    {
    	entityTransaction.begin();
    	entityManager.persist(product);
    	entityTransaction.commit();
    	
    	return product;
    }
    
    public Product getByProductId(int productId)
    {
    	return entityManager.find(Product.class, productId);
    }
    
    public void deleteProductById(int productId)
    {
    	Product product=getByProductId(productId);
    	if(product!=null)
    	{
    		entityTransaction.begin();
    		entityManager.remove(product);
    		entityTransaction.commit();
    	}
    }
    
    public List<Product> getAllProduct()
    {
    	return entityManager.createQuery("From Product").getResultList();
    }
}
