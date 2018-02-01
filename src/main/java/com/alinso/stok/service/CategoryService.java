package com.alinso.stok.service;

import com.alinso.stok.dao.CategoryDao;
import com.alinso.stok.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin/category")
public class CategoryService extends  BaseService {

    @Autowired
    CategoryDao categoryDao;

    @PostMapping("/")
    public void addCategory(@RequestBody String categoryName){
        Category category  = new Category();
        category.setName(categoryName);

        categoryDao.saveOrUpdate(category);
    }

    @GetMapping("/")
    public String getCategory(){
        return "kategoei sayfası";
    }
}
