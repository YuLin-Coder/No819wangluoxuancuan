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

import com.dao.ShifajieshiDao;
import com.entity.ShifajieshiEntity;
import com.service.ShifajieshiService;
import com.entity.view.ShifajieshiView;

/**
 * 司法解释 服务实现类
 * @author 
 * @since 2021-04-12
 */
@Service("shifajieshiService")
@Transactional
public class ShifajieshiServiceImpl extends ServiceImpl<ShifajieshiDao, ShifajieshiEntity> implements ShifajieshiService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ShifajieshiView> page =new Query<ShifajieshiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
