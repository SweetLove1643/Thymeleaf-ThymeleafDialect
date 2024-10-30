package vn.sweetlove.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import vn.sweetlove.Entity.Category;


@org.springframework.stereotype.Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
	List<Category> findByName(String name);
	
	Page<Category> findByName(String name, Pageable pageable);
}
