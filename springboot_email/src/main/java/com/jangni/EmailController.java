package com.jangni;

import com.jangni.email.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot_study
 * @description:  邮件发送非常的慢 不能直接等待发送要做缓存 做频次发送
 * @author: Mr.Jangni
 * @create: 2018-07-07 12:06
 **/
@RestController
public class EmailController {

    @Autowired
    MailService mailService;

    @RequestMapping("sendemail")
    public String sendEmail() {
        mailService.sendSimpleMail("373466394@qq.com", "标题", "内容");
        return "ok";
    }
}
