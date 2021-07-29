package com.lzw.service.impl.base;

import com.lzw.bean.base.TblTodo;
import com.lzw.mapper.TblTodoMapper;
import com.lzw.service.base.TblTodoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 待办事项 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-07-27
 */
@Service
public class TblTodoServiceImpl extends ServiceImpl<TblTodoMapper, TblTodo> implements TblTodoService {

}
