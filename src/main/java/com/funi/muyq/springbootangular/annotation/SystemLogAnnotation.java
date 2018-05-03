package com.funi.muyq.springbootangular.annotation;

import java.lang.annotation.*;

/**
 * @Package: [com.funi.muyq.springbootangular.annotationSystemLogAnnotation]
 * @Description: []
 * @Author: [yuanqiang.mou@funi365.com]
 * @CreateDate: [2018/4/20 12:33]
 * @UpdateUser: []
 * @UpdateDate: []
 * @UpdateRemark: []
 * @Version: [v1.0]
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SystemLogAnnotation {
    String value() default "";
}
