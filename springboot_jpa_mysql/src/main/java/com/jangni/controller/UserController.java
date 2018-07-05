package com.jangni.controller;

import com.jangni.entity.UserEntity;
import com.jangni.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: springboot_study
 * @description:
 * @author: Mr.Jangni
 * @create: 2018-07-05 23:12
 **/
@Controller
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<UserEntity> users=userService.getUserEntityList();
        model.addAttribute("users", users);
        return "user/list";
    }
}
