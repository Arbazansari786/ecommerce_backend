package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.ProductDto;
import com.lti.entity.Product;
import com.lti.service.IProductService;

//import lombok.Getter;

@RestController
@RequestMapping("/prod")
public class ProductController {
	
	@Autowired
	IProductService service;
	
	@GetMapping("products")
	public ResponseEntity<List<ProductDto>> getAllProducts(){
		List<ProductDto> allProds = service.getAllProducts();
		return new ResponseEntity<>(allProds,HttpStatus.OK);
	}
	
	

}
