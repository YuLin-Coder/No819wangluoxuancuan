package com.dao;

import com.entity.FalvgaguiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FalvgaguiCollectionView;

/**
 * 法律法规收藏 Dao 接口
 *
 * @author 
 * @since 2021-04-12
 */
public interface FalvgaguiCollectionDao extends BaseMapper<FalvgaguiCollectionEntity> {

   List<FalvgaguiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
