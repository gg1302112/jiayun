package com.lzw.controller;

import com.lzw.pojo.Emp;
import com.lzw.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: lzw
 * @date: 21/7/23 - 07 - 23 - 18:26
 * @Description: com.lzw.controller
 * @version: 1.0
 */

@Controller
public class GetEmp {

    @Autowired
    private EmpService empService;

    @ResponseBody
    @RequestMapping("getemp")
    public List<Emp> myCon(){
        return empService.findAll();
    }

}
