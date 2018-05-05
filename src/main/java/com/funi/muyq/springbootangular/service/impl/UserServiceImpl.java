package com.funi.muyq.springbootangular.service.impl;

import com.funi.muyq.springbootangular.entity.User;
import com.funi.muyq.springbootangular.mapper.UserMapper;
import com.funi.muyq.springbootangular.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Package: [com.funi.muyq.springbootangular.serviceUserServiceImpl]
 * @Description: []
 * @Author: [yuanqiang.mou@funi365.com]
 * @CreateDate: [2018/5/3 14:23]
 * @UpdateUser: []
 * @UpdateDate: []
 * @UpdateRemark: []
 * @Version: [v1.0]
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public PageInfo<User> selectAllUsers() {
        PageHelper.startPage(1, 10);
        List<User> list = userMapper.selectAllUsers();
        PageInfo<User> page = new PageInfo<>(list);
        return page;
    }
}
