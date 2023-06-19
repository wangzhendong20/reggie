package com.zhendong.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhendong.reggie.mapper.DishFlavorMapper;
import com.zhendong.reggie.pojo.DishFlavor;
import com.zhendong.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
