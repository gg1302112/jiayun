package com.lzw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: lzw
 * @date: 21/7/23 - 07 - 23 - 18:25
 * @Description: com.lzw.pojo
 * @version: 1.0
 */


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Double sal;
    private Double comm;
    private Integer deptno;
}
