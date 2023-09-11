package com.spring.Spring_mvc_crud_operation_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Spring_mvc_crud_operation_project.dao.ProductDao;
import com.spring.Spring_mvc_crud_operation_project.dto.Product;

@Service
public class ProductService 
{
	@Autowired
    private ProductDao productDao;
	
	public Product saveProduct(Product product)
	{
		return productDao.saveProduct(product);
	}
	
	public Product getByProductId(int productId)
	{
		return productDao.getByProductId(productId);
	}
	
	public void deleteProductById(int productId)
	{
		productDao.deleteProductById(productId);
	}
	
	public List<Product> getAllProduct()
	{
		return productDao.getAllProduct();
	}
}
