package com.zhendong.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhendong.reggie.pojo.OrderDetail;
import com.zhendong.reggie.pojo.Orders;

import java.util.List;

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);

    public List<OrderDetail> getOrderDetailListByOrderId(Long orderId);

}
