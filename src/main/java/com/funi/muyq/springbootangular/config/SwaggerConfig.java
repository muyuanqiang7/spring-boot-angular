package com.funi.muyq.springbootangular.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * @Package: [com.funi.muyq.springbootangular.configSwaggerConfig]
 * @Description: [swagger配置]
 * @Author: [yuanqiang.mou@funi365.com]
 * @CreateDate: [2018/4/522:48]
 * @UpdateUser: []
 * @UpdateDate: []
 * @UpdateRemark: []
 * @Version: [v1.0]
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage("com.funi.muyq.springbootangular.controller"))
                .paths(regex("/product.*"))
                .build();
    }

    /**
     * 设置swagger文档信息
     *
     * @return
     */
    @Bean
    public ApiInfo apiInfo() {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        Contact contact = new Contact("muyuanqiang7", "http://www.baidu.com", "muyuanqiang7@gmail.com");
        return apiInfoBuilder.description("this is the spring boot with swagger").license("MIT_License").licenseUrl("https://en.wikipedia.org/wiki/MIT_License")
                .title("Spring Boot Angular ApiInfo").version("0.0.1-SNAPSHOT")
                .contact(contact).build();
    }
}
