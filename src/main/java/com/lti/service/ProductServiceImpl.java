package com.lti.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.IProductCategoryRepository;
import com.lti.dao.IProductRepository;
import com.lti.dto.ProductDto;
import com.lti.entity.Product;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductRepository prod;

	@Autowired
	IProductCategoryRepository categ;

	@Override
	public List<ProductDto> getAllProducts() {
		// TODO Auto-generated method stub
		 List<Product> allProds = prod.findAll();
		 List<ProductDto> allProdto = allProds.stream().map(prod->ProductDto.builder().name(prod.getName())
				                                          .dateCreated(prod.getDateCreated())
				                                          .id(prod.getId())
				                                          .description(prod.getDescription())
				                                          .lastUpdated(prod.getLastUpdated())
				                                          .unitPrice(prod.getUnitPrice())
				                                          .unitsInStock(prod.getUnitsInStock())
				                                          .imageUrl(prod.getImageUrl())
				                                          .sku(prod.getSku())
				                                          .active(prod.isActive())
				                                          .build()).collect(Collectors.toList());
		return allProdto;
	}

}
