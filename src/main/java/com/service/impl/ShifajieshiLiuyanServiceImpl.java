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

import com.dao.ShifajieshiLiuyanDao;
import com.entity.ShifajieshiLiuyanEntity;
import com.service.ShifajieshiLiuyanService;
import com.entity.view.ShifajieshiLiuyanView;

/**
 * 司法解释留言 服务实现类
 * @author 
 * @since 2021-04-12
 */
@Service("shifajieshiLiuyanService")
@Transactional
public class ShifajieshiLiuyanServiceImpl extends ServiceImpl<ShifajieshiLiuyanDao, ShifajieshiLiuyanEntity> implements ShifajieshiLiuyanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ShifajieshiLiuyanView> page =new Query<ShifajieshiLiuyanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
