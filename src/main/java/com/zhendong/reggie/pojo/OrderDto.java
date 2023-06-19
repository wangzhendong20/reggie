package com.zhendong.reggie.pojo;

import lombok.Data;

import java.util.List;

@Data
public class OrderDto extends Orders{
    private List<OrderDetail> orderDetails;

}
