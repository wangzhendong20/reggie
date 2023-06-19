package com.zhendong.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhendong.reggie.dto.DishDto;
import com.zhendong.reggie.pojo.Dish;

import java.util.List;

public interface DishService extends IService<Dish> {

    public void saveWithFlavor(DishDto dishDto);

    public DishDto getByIdWIthFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);

    void removeWithFlavor(List<Long> id);
}
