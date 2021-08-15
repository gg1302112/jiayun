package com.lzw.controller;

import com.alibaba.fastjson.JSONObject;
import com.lzw.bean.base.FcEstate;
import com.lzw.bean.base.TblCompany;
import com.lzw.bean.result.ResultObject;
import com.lzw.service.estate.EstateService;
import com.mysql.cj.QueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: lzw
 * @date: 21/7/31 - 07 - 31 - 15:55
 * @description: com.lzw.controller
 * @version: 1.0
 */

// 添加一行注释  看看能提交不
@RestController
public class EstateController {

    @Autowired
    private EstateService estateService;


    @RequestMapping("/estate/selectCompany")
    public JSONObject selectCompany(){
        System.out.println("selectCompany");
        List<TblCompany> companies = estateService.selectCompany();
        return JSONObject.parseObject(JSONObject.toJSONString(new ResultObject(companies)));
    }

    @RequestMapping("/estate/insertEstate")
    public JSONObject insertEstate(FcEstate fcEstate){

        Integer result = estateService.insertEstate(fcEstate);
        if (result==0){
            return JSONObject.parseObject(JSONObject.toJSONString(new ResultObject("0","已存在")));
        }else{
            return JSONObject.parseObject(JSONObject.toJSONString(new ResultObject("1","成功，没有问题")));
        }

    }
}
