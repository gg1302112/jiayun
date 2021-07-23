package com.lzw.service;

import com.lzw.pojo.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : lzw
 * @date : 21/7/23 - 07 - 23 - 18:28
 * @Description: com.lzw.service
 * @version: 1.0
 */
@Service
public interface EmpService {

    List<Emp> findAll();
}
