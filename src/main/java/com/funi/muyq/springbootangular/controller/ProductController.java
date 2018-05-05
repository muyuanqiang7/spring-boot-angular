package com.funi.muyq.springbootangular.controller;

import com.funi.muyq.springbootangular.annotation.ControllerLogAnnotation;
import com.funi.muyq.springbootangular.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Package: [com.funi.muyq.springbootangular.controllerProductController]
 * @Description: []
 * @Author: [yuanqiang.mou@funi365.com]
 * @CreateDate: [2018/4/522:44]
 * @UpdateUser: []
 * @UpdateDate: []
 * @UpdateRemark: []
 * @Version: [v1.0]
 */
@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController extends BaseController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<String> saveProduct(@RequestBody Product product) {
        return new ResponseEntity<>("Product saved successfully", HttpStatus.OK);
    }

    @ControllerLogAnnotation
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<String> updateProduct(@PathVariable Integer id, @RequestBody Product product) {
        Product storedProduct = new Product();
        storedProduct.setDescription(product.getDescription());
        storedProduct.setImageUrl(product.getImageUrl());
        storedProduct.setPrice(product.getPrice());
        return new ResponseEntity<>("Product updated successfully", HttpStatus.OK);
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        return new ResponseEntity<>("Product deleted successfully", HttpStatus.OK);

    }
}
