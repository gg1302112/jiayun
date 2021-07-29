package com.lzw.controller;

import com.alibaba.fastjson.JSONObject;
import com.lzw.bean.base.TblUserRecord;
import com.lzw.bean.result.Permission;
import com.lzw.bean.result.Permissions;
import com.lzw.bean.result.ResultObject;
import com.lzw.bean.result.UserInfo;
import com.lzw.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/auth/2step-code")
    public void doStep(){
        System.out.println("啥也不干");
    }


    @RequestMapping("/auth/login")
    public JSONObject login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session){
        TblUserRecord tblUserRecord = loginService.login(username,password);

        tblUserRecord.setToken(tblUserRecord.getUserName());

        session.setAttribute("userRecord",tblUserRecord);
        System.out.println(session.getId());
        ResultObject resultObject = new ResultObject(tblUserRecord);
        return JSONObject.parseObject(JSONObject.toJSONString(resultObject));
    }

    @RequestMapping("/user/info")
    public JSONObject userInfo(HttpSession session){
        TblUserRecord userRecord = (TblUserRecord) session.getAttribute("userRecord");
        System.out.println(session.getId());
        String[] rolePrivileges = userRecord.getTblRole().getRolePrivileges().split("-");
        Permissions permissions = new Permissions();
        List<Permission> permissionList = new ArrayList<>();
        for (String rolePrivilege : rolePrivileges) {
            permissionList.add(new Permission(rolePrivilege));
        }
        permissions.setPermissions(permissionList);
        UserInfo userInfo = new UserInfo(userRecord.getUserName(), permissions);
        ResultObject resultObject = new ResultObject(userInfo);
        return JSONObject.parseObject(JSONObject.toJSONString(resultObject));
    }

    @RequestMapping("/auth/logout")
    public JSONObject loginOut(HttpSession session){
        System.out.println("退出登录");
        session.invalidate();
        return JSONObject.parseObject(JSONObject.toJSONString(new ResultObject(null)));
    }
}
