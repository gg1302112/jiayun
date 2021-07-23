package com.lzw.mapper;

import com.lzw.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author : lzw
 * @date: 21/7/23 - 07 - 23 - 18:32
 * @Description: com.lzw.mapper
 * @version: 1.0
 */

@Mapper
public interface EmpMapper {

    List<Emp> getAllEmp();

}
