package com.zhendong.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhendong.reggie.mapper.UserMapper;
import com.zhendong.reggie.pojo.User;
import com.zhendong.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
