package com.funi.muyq.springbootangular.mapper;

import com.funi.muyq.springbootangular.entity.User;

import java.util.List;

/**
 * @Package: [com.funi.muyq.springbootangular.mapperUserMapper]
 * @Description: []
 * @Author: [yuanqiang.mou@funi365.com]
 * @CreateDate: [2018/5/3 14:00]
 * @UpdateUser: []
 * @UpdateDate: []
 * @UpdateRemark: []
 * @Version: [v1.0]
 */
public interface UserMapper {

    List<User> selectAllUsers();

    int saveUser(User user);
}
