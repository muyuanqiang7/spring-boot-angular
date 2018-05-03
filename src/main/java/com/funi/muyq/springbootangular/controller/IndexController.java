package com.funi.muyq.springbootangular.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Package: [com.funi.muyq.springbootangular.controller.indexIndexController]
 * @Description: []
 * @Author: [yuanqiang.mou@funi365.com]
 * @CreateDate: [2018/4/27 16:20]
 * @UpdateUser: []
 * @UpdateDate: []
 * @UpdateRemark: []
 * @Version: [v1.0]
 */
@Slf4j
@Controller
public class IndexController extends BaseController {

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String index() {
        log.info("request method: {}", request.getMethod());
        log.info("response status: {}", response.getStatus());
        return "index";
    }
}
