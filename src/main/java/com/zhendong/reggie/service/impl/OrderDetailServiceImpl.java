package com.zhendong.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhendong.reggie.pojo.OrderDetail;
import com.zhendong.reggie.mapper.OrderDetailMapper;
import com.zhendong.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}