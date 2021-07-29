package com.lzw.mapper;

import com.lzw.bean.base.TblUserRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户档案 Mapper 接口
 * </p>
 *
 * @author lian
 * @since 2021-07-27
 */

@Mapper
public interface TblUserRecordMapper extends BaseMapper<TblUserRecord> {

    public TblUserRecord login(@Param("username") String username,@Param("password") String password);

}
