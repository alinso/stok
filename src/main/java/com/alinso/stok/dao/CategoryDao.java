package com.alinso.stok.dao;

import com.alinso.stok.entity.Category;
import org.springframework.stereotype.Repository;


@Repository
public class CategoryDao extends BaseDao {

    CategoryDao(){
        setTheClass(Category.class);
    }
}
