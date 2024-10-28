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

import com.dao.ZhengchengwenjianDao;
import com.entity.ZhengchengwenjianEntity;
import com.service.ZhengchengwenjianService;
import com.entity.view.ZhengchengwenjianView;

/**
 * 政策文件 服务实现类
 * @author 
 * @since 2021-04-12
 */
@Service("zhengchengwenjianService")
@Transactional
public class ZhengchengwenjianServiceImpl extends ServiceImpl<ZhengchengwenjianDao, ZhengchengwenjianEntity> implements ZhengchengwenjianService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ZhengchengwenjianView> page =new Query<ZhengchengwenjianView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
