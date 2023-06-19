package com.zhendong.reggie.dto;

import com.zhendong.reggie.pojo.Setmeal;
import com.zhendong.reggie.pojo.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
