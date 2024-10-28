package com.entity.view;

import com.entity.GuifanwenjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 规范文件
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("guifanwenjian")
public class GuifanwenjianView extends GuifanwenjianEntity implements Serializable {
    private static final long serialVersionUID = 1L;



	public GuifanwenjianView() {

	}

	public GuifanwenjianView(GuifanwenjianEntity guifanwenjianEntity) {
		try {
			BeanUtils.copyProperties(this, guifanwenjianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


















}
