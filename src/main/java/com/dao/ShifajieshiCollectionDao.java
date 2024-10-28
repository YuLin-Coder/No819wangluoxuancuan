package com.dao;

import com.entity.ShifajieshiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShifajieshiCollectionView;

/**
 * 司法解释收藏 Dao 接口
 *
 * @author 
 * @since 2021-04-12
 */
public interface ShifajieshiCollectionDao extends BaseMapper<ShifajieshiCollectionEntity> {

   List<ShifajieshiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
