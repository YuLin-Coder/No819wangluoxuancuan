package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.FalvgaguiDao;
import com.entity.FalvgaguiEntity;
import com.service.FalvgaguiService;
import com.entity.view.FalvgaguiView;

/**
 * 法律法规 服务实现类
 * @author 
 * @since 2021-04-12
 */
@Service("falvgaguiService")
@Transactional
public class FalvgaguiServiceImpl extends ServiceImpl<FalvgaguiDao, FalvgaguiEntity> implements FalvgaguiService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<FalvgaguiView> page =new Query<FalvgaguiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
