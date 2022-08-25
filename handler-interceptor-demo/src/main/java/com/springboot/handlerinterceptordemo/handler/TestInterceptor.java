package com.springboot.handlerinterceptordemo.handler;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义HandlerInterceptor类
 */
@Component
public class TestInterceptor implements HandlerInterceptor {
    Logger log = LoggerFactory.getLogger(getClass());
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

       log.info("1.这一步是：preHandle");
        //从这里开始，如果判断是true，直接进入2.controller
       return true ;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("3.这一步是：postHandle");

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("4.这一步是：afterCompletion");
    }
}
