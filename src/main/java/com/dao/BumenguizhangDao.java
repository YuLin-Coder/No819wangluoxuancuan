package com.dao;

import com.entity.BumenguizhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BumenguizhangView;

/**
 * 部门规章 Dao 接口
 *
 * @author 
 * @since 2021-04-12
 */
public interface BumenguizhangDao extends BaseMapper<BumenguizhangEntity> {

   List<BumenguizhangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
