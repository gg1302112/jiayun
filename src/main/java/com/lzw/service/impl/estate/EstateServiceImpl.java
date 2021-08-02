package com.lzw.service.impl.estate;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzw.bean.base.FcEstate;
import com.lzw.bean.base.TblCompany;
import com.lzw.mapper.FcEstateMapper;
import com.lzw.mapper.TblCompanyMapper;
import com.lzw.service.estate.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: lzw
 * @date: 21/7/31 - 07 - 31 - 16:25
 * @description: com.lzw.service.impl.estate
 * @version: 1.0
 */

@Service
public class EstateServiceImpl implements EstateService {

    @Autowired
    private TblCompanyMapper tblCompanyMapper;

    @Autowired
    private FcEstateMapper fcEstateMapper;

    @Override
    public List<TblCompany> selectCompany() {
        return tblCompanyMapper.selectCompanies();
    }

    @Override
    public Integer insertEstate(FcEstate fcEstate) {

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("estate_code", fcEstate.getEstateCode());
        FcEstate fcEstate1 = fcEstateMapper.selectOne(queryWrapper);
        Integer result = 0;
        if (fcEstate1==null){
            result = fcEstateMapper.insert(fcEstate);
            return result;
        }else {
            return result;
        }
    }
}
