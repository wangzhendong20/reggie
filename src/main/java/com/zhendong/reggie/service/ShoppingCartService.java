package com.zhendong.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhendong.reggie.pojo.ShoppingCart;

public interface ShoppingCartService extends IService<ShoppingCart> {
    void clean();
}
