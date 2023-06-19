package com.zhendong.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhendong.reggie.mapper.AddressBookMapper;
import com.zhendong.reggie.pojo.AddressBook;
import com.zhendong.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
