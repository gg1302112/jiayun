package com.lzw.service.impl.login;

import com.lzw.bean.TblUserRecord;
import com.lzw.mapper.TblUserRecordMapper;
import com.lzw.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: lzw
 * @date: 21/7/28 - 07 - 28 - 11:08
 * @description: com.lzw.service.impl.login
 * @version: 1.0
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private TblUserRecordMapper tblUserRecordMapper;

    @Override
    public TblUserRecord login(String username, String password) {

        return tblUserRecordMapper.login(username,password);

    }
}
