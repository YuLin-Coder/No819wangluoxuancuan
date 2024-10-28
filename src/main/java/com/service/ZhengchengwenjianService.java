package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhengchengwenjianEntity;
import java.util.Map;

/**
 * 政策文件 服务类
 * @author 
 * @since 2021-04-12
 */
public interface ZhengchengwenjianService extends IService<ZhengchengwenjianEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}