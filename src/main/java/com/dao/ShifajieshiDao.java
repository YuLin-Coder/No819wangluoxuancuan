package com.dao;

import com.entity.ShifajieshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShifajieshiView;

/**
 * 司法解释 Dao 接口
 *
 * @author 
 * @since 2021-04-12
 */
public interface ShifajieshiDao extends BaseMapper<ShifajieshiEntity> {

   List<ShifajieshiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
