package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.lti.entity.ProductCategory;

public interface IProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
