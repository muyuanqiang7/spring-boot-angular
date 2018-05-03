package com.funi.muyq.springbootangular.entity;

import lombok.Data;

/**
 * @Package: [com.funi.muyq.springbootangular.entityProduct]
 * @Description: []
 * @Author: [yuanqiang.mou@funi365.com]
 * @CreateDate: [2018/4/522:46]
 * @UpdateUser: []
 * @UpdateDate: []
 * @UpdateRemark: []
 * @Version: [v1.0]
 */
@Data
public class Product {
    private String id;
    private String imageUrl;
    private String description;
    private Double price;
    private String produceAddress;
    private String produceCountry;
}
