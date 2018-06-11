package com.funi.muyq.springbootangular.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @Package: [com.funi.muyq.springbootangular.entityUser]
 * @Description: []
 * @Author: [yuanqiang.mou@funi365.com]
 * @CreateDate: [2018/4/510:22]
 * @UpdateUser: []
 * @UpdateDate: []
 * @UpdateRemark: []
 * @Version: [v1.0]
 */
@Data
@ApiModel
public class User {
    private String id;
    private String uid;
    private String psw;
    private String address;
    private String email;
    private String websiteUrl;
    private String username;
    private String password;

}
