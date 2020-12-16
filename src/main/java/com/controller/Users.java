package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Users {
    @RequestMapping(value = "check_Users.do",method = RequestMethod.GET )
    public String check(HttpServletRequest request, HttpServletResponse response){


       return "二毛和二蛋";
    }

}
