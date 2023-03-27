package com.SportyShoes.Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SportyShoes.Project.model.Category;
import com.SportyShoes.Project.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findAllByCategory_Id(int id);

	
}
