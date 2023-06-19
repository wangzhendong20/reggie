package com.zhendong.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhendong.reggie.pojo.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);
}
