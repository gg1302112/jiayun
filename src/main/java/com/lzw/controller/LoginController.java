package com.lzw.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lzw
 * @date: 21/7/27 - 07 - 27 - 19:37
 * @description: com.lzw.controller
 * @version: 1.0
 */

@RestController
//@CrossOrigin
public class LoginController {

    @RequestMapping("/auth/login")
    public String login(){
        System.out.println("this is login test");
        return "ok";
    }
}
