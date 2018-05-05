package com.funi.muyq.springbootangular.service;

import com.funi.muyq.springbootangular.entity.User;
import com.github.pagehelper.PageInfo;

/**
 * @Package: [com.funi.muyq.springbootangular.serviceUserService]
 * @Description: []
 * @Author: [yuanqiang.mou@funi365.com]
 * @CreateDate: [2018/5/3 13:50]
 * @UpdateUser: []
 * @UpdateDate: []
 * @UpdateRemark: []
 * @Version: [v1.0]
 */
public interface UserService {
    PageInfo<User> selectAllUsers();
}
