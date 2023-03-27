package com.SportyShoes.Project.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.SportyShoes.Project.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
