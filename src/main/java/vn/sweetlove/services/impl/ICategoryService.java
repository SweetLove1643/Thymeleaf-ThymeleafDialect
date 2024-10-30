package vn.sweetlove.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import vn.sweetlove.Entity.Category;
import vn.sweetlove.repository.Impl.ICategoryRepository;
import vn.sweetlove.services.CategotyService;

@Service
public class ICategoryService implements CategotyService {
	@Autowired
	ICategoryRepository categoryRepository;

	public ICategoryService(ICategoryRepository categoryRepository) {

		this.categoryRepository = categoryRepository;
	}

	@Override
	public <S extends Category> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Page<Category> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public void delete(Category cate) {
		categoryRepository.delete(cate);
	}

	@Override
	public void deleteAll() {
		categoryRepository.deleteAll();
	}

	@Override
	public List<Category> findByName(String name) {
		// TODO Auto-generated method stub
		return categoryRepository.findByName(name);
	}

	@Override
	public Category findById(int id) {
		Optional<Category> cate = categoryRepository.findById(id);
		return cate.orElse(null);
	}

	
	
	
	
}
