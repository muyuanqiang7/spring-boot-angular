package com.funi.muyq.springbootangular.controller;

import com.funi.muyq.springbootangular.entity.User;
import com.funi.muyq.springbootangular.service.UserService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@Api(value = "/user", description = "用户接口")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/selectAllUsers")
    @ApiOperation(value = "查询所有用户",
            notes = "查询所有用户,用户不存在则返回数据为空数组",
            response = User.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "Order not found")})
    public PageInfo<User> selectAllUsers() {
        return userService.selectAllUsers();
    }
}
