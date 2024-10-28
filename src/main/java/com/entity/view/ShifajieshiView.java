package com.entity.view;

import com.entity.ShifajieshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 司法解释
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("shifajieshi")
public class ShifajieshiView extends ShifajieshiEntity implements Serializable {
    private static final long serialVersionUID = 1L;



	public ShifajieshiView() {

	}

	public ShifajieshiView(ShifajieshiEntity shifajieshiEntity) {
		try {
			BeanUtils.copyProperties(this, shifajieshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


















}
