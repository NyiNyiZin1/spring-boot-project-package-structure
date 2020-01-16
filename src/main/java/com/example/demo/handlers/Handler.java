package com.example.demo.handlers;


import com.example.demo.utilities.TempStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

@Component
public class Handler implements HandlerInterceptor {

    @Autowired
    TempStore tempStore;

    Logger logger = LoggerFactory.getLogger(Handler.class);
 // For Event/user action Handlers (DB, controller, system, etc..)
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod method = (HandlerMethod) handler;
        //request.getUserPrincipal();
        logger.info("Executing Method : "+method.getMethod().getName()+ " From : "+method.getBeanType().toString()+" At : "+ Calendar.getInstance().getTime());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

}
