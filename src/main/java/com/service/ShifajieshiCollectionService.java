package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShifajieshiCollectionEntity;
import java.util.Map;

/**
 * 司法解释收藏 服务类
 * @author 
 * @since 2021-04-12
 */
public interface ShifajieshiCollectionService extends IService<ShifajieshiCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}