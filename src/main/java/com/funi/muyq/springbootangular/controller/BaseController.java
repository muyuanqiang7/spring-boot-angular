package com.funi.muyq.springbootangular.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Package: [com.funi.muyq.springbootangular.controllerBaseController]
 * @Description: []
 * @Author: [yuanqiang.mou@funi365.com]
 * @CreateDate: [2018/5/3 11:25]
 * @UpdateUser: []
 * @UpdateDate: []
 * @UpdateRemark: []
 * @Version: [v1.0]
 */
public abstract class BaseController {
    @Resource
    HttpServletRequest request;
    @Resource
    HttpServletResponse response;
}
