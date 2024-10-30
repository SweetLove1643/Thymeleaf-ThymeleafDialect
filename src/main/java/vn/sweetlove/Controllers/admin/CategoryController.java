package vn.sweetlove.Controllers.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vn.sweetlove.Entity.Category;
import vn.sweetlove.services.CategotyService;

@Controller
public class CategoryController {
	@Autowired
	CategotyService categotyService;
	
	
	@GetMapping("/admin/categories")
	public String all(Model model) {
		List<Category> list = new ArrayList<>();
		list = categotyService.findAll();
		model.addAttribute("list", list);
		return"admin/category-list";
	}
	
}
