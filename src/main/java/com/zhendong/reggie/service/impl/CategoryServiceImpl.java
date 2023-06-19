package com.zhendong.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhendong.reggie.common.CustomException;
import com.zhendong.reggie.mapper.CategoryMapper;
import com.zhendong.reggie.pojo.Category;
import com.zhendong.reggie.pojo.Dish;
import com.zhendong.reggie.pojo.Setmeal;
import com.zhendong.reggie.service.CategoryService;
import com.zhendong.reggie.service.DishService;
import com.zhendong.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        long DishCount = dishService.count(dishLambdaQueryWrapper);
        if (DishCount > 0){
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }

        LambdaQueryWrapper<Setmeal> SetmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        SetmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        long SetmealCount = setmealService.count(SetmealLambdaQueryWrapper);
        if (SetmealCount > 0){
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }

        super.removeById(id);
    }
}
