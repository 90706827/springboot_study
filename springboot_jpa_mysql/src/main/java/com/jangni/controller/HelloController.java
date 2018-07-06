package com.jangni.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: springboot_study
 * @description:
 * @author: Mr.Jangni
 * @create: 2018-07-05 23:12
 **/
@Controller
public class HelloController {

    /**
     * 获取配置文件中的参数
     */
    @Value("${com.jangni.blog.name}")
    private String name;
    @Value("${com.jangni.blog.value}")
    private String value;
    @Value("${com.jangni.blog.number}")
    private int number;
    @Value("${com.jangni.blog.bignumber}")
    private long bignumber;
    @Value("${com.jangni.blog.test1}")
    private int test1;
    @Value("${com.jangni.blog.test2}")
    private int test2;

    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }


}
