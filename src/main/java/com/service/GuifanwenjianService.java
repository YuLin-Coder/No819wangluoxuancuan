package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuifanwenjianEntity;
import java.util.Map;

/**
 * 规范文件 服务类
 * @author 
 * @since 2021-04-12
 */
public interface GuifanwenjianService extends IService<GuifanwenjianEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}