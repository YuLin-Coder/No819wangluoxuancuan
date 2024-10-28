package com.dao;

import com.entity.ZhengchengwenjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhengchengwenjianView;

/**
 * 政策文件 Dao 接口
 *
 * @author 
 * @since 2021-04-12
 */
public interface ZhengchengwenjianDao extends BaseMapper<ZhengchengwenjianEntity> {

   List<ZhengchengwenjianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
