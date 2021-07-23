package com.lzw.service.Impl;

import com.lzw.mapper.EmpMapper;
import com.lzw.pojo.Emp;
import com.lzw.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lzw
 * @Date: 21/7/23 - 07 - 23 - 18:31
 * @Description: com.lzw.service.Impl
 * @version: 1.0
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> findAll() {
        return empMapper.getAllEmp();
    }
}
