package com.lzw.service.estate;

import com.lzw.bean.base.FcEstate;
import com.lzw.bean.base.TblCompany;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: lzw
 * @date: 21/7/31 - 07 - 31 - 16:24
 * @description: com.lzw.service.estate
 * @version: 1.0
 */

@Component
public interface EstateService {
    public List<TblCompany> selectCompany();

    Integer insertEstate(FcEstate fcEstate);
}
