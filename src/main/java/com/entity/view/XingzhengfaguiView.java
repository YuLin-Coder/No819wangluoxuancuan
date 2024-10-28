package com.entity.view;

import com.entity.XingzhengfaguiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 行政法规
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("xingzhengfagui")
public class XingzhengfaguiView extends XingzhengfaguiEntity implements Serializable {
    private static final long serialVersionUID = 1L;



	public XingzhengfaguiView() {

	}

	public XingzhengfaguiView(XingzhengfaguiEntity xingzhengfaguiEntity) {
		try {
			BeanUtils.copyProperties(this, xingzhengfaguiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


















}
