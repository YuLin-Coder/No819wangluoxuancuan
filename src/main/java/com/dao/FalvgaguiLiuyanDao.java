package com.dao;

import com.entity.FalvgaguiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FalvgaguiLiuyanView;

/**
 * 法律法规留言 Dao 接口
 *
 * @author 
 * @since 2021-04-12
 */
public interface FalvgaguiLiuyanDao extends BaseMapper<FalvgaguiLiuyanEntity> {

   List<FalvgaguiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
