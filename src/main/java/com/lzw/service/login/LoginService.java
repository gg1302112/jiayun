package com.lzw.service.login;

import com.lzw.bean.base.TblUserRecord;
import org.springframework.stereotype.Component;

/**
 * @author: lzw
 * @date: 21/7/28 - 07 - 28 - 11:07
 * @description: com.lzw.service.login
 * @version: 1.0
 */

@Component
public interface LoginService {

    TblUserRecord login(String username,String password);

}
