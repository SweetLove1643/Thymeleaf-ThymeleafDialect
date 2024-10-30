package vn.sweetlove.services;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import vn.sweetlove.Entity.Category;

public interface CategotyService {

	public <S extends Category> S save(S entity);

	public List<Category> findAll();

	public Page<Category> findAll(Pageable pageable);

	public List<Category> findAll(Sort sort);

	public void deleteById(int id);

	public void delete(Category cate);

	public void deleteAll();

	public List<Category> findByName(String name);

	public Category findById(int id);
}