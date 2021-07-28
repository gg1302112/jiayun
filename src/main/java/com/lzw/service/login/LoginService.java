package com.lzw.service.login;

import com.lzw.bean.TblUserRecord;

/**
 * @author: lzw
 * @date: 21/7/28 - 07 - 28 - 11:07
 * @description: com.lzw.service.login
 * @version: 1.0
 */


public interface LoginService {

    TblUserRecord login(String username,String password);

}
