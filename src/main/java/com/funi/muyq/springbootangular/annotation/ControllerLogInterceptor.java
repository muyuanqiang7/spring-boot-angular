package com.funi.muyq.springbootangular.annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Package: [com.funi.muyq.springbootangular.annotationSystemLogInterceptor]
 * @Description: []
 * @Author: [yuanqiang.mou@funi365.com]
 * @CreateDate: [2018/4/20 12:34]
 * @UpdateUser: []
 * @UpdateDate: []
 * @UpdateRemark: []
 * @Version: [v1.0]
 */
@Slf4j
@Aspect
@Configuration
public class ControllerLogInterceptor {
    @Pointcut(value = "@annotation(com.funi.muyq.springbootangular.annotation.ControllerLogAnnotation)")
    public void pointCut() {

    }

    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.nanoTime();
        RequestAttributes requestAttr = RequestContextHolder.currentRequestAttributes();
        if (!(requestAttr instanceof ServletRequestAttributes)) {
            throw new IllegalStateException("Current request is not a servlet request");
        }
        HttpServletRequest request = ((ServletRequestAttributes) requestAttr).getRequest();
        log.info(" Check for user access ");
        log.info(" Allowed execution for {}", joinPoint);
        log.info("Request Address: {}", request.getRemoteAddr());
        log.info("Request Method: {}", request.getMethod());
        Object result = joinPoint.proceed();
        long endTime = System.nanoTime();

        log.info("Request Time: {} ns", endTime - startTime);
        log.info("Current Time: {} ns", System.nanoTime());
        return result;
    }

}
