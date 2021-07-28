package com.lzw.controller;

import com.lzw.bean.TblUserRecord;
import com.lzw.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private LoginService loginService;

    @RequestMapping("/auth/login")
    public String login(String username,String password){
        System.out.println(username+"-----"+password);
        TblUserRecord tblUserRecord = loginService.login(username,password);
        System.out.println(tblUserRecord);
        return "ok";
    }
}
