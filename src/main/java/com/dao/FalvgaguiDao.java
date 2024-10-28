package com.dao;

import com.entity.FalvgaguiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FalvgaguiView;

/**
 * 法律法规 Dao 接口
 *
 * @author 
 * @since 2021-04-12
 */
public interface FalvgaguiDao extends BaseMapper<FalvgaguiEntity> {

   List<FalvgaguiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
