package com.funi.muyq.springbootangular.controller;

import com.funi.muyq.springbootangular.entity.User;
import com.funi.muyq.springbootangular.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Package: [com.funi.muyq.springbootangular.controllerUserController]
 * @Description: []
 * @Author: [yuanqiang.mou@funi365.com]
 * @CreateDate: [2018/5/3 14:31]
 * @UpdateUser: []
 * @UpdateDate: []
 * @UpdateRemark: []
 * @Version: [v1.0]
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/selectAllUsers")
    public PageInfo<User> selectAllUsers() {
        return userService.selectAllUsers();
    }
}
