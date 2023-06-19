package com.zhendong.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhendong.reggie.dto.SetmealDto;
import com.zhendong.reggie.pojo.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {

    void saveWithDish(SetmealDto setmealDto);

    void removeWithDish(List<Long> ids);

    SetmealDto getByIdWithDish(Long id);

    void updateWithDish(SetmealDto setmealDto);
}
