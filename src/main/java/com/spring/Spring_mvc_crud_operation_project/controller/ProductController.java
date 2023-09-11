package com.spring.Spring_mvc_crud_operation_project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.Spring_mvc_crud_operation_project.dto.Product;
import com.spring.Spring_mvc_crud_operation_project.service.ProductService;

@Controller
public class ProductController 
{
	@Autowired
      private ProductService productService;
	
	@Autowired
	HttpServletRequest httpServletRequest;
	
	@RequestMapping("/")
	public ModelAndView getView()
	{
		ModelAndView andView=new ModelAndView("home.jsp");
		
		return andView;
	}
	
	@RequestMapping("/registerOpen")
	public ModelAndView openRegister()
	{
		ModelAndView andView=new ModelAndView("register.jsp");
		
		andView.addObject("products", new Product());
		
		return andView;
	}
	
	@PostMapping("/saveProduct")
	public ModelAndView saveProduct(Product product)
	{
		ModelAndView andView=new ModelAndView("/registerOpen");
		
		productService.saveProduct(product);
		
		andView.addObject("message", "success");
		
		return andView;
	}
	
	@GetMapping(value="/getAllProduct")
	public ModelAndView getAllProduct()
	{
	   ModelAndView andView=new ModelAndView("display.jsp");
	   
	   andView.addObject("allProduct",productService.getAllProduct());
	   
	   return andView;
	}
	
	@RequestMapping(value = "/deleteByProductId")
	public ModelAndView deleteProductById(int id)
	{
		productService.deleteProductById(id);
		
		ModelAndView andView=new ModelAndView("/getAllProduct");
		
		return andView;
	}
}
