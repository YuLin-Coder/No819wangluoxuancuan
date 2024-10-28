package com.entity.view;

import com.entity.FalvgaguiLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 法律法规留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("falvgagui_liuyan")
public class FalvgaguiLiuyanView extends FalvgaguiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 falvgagui
			/**
			* 名称
			*/
			private String falvgaguiName;
			/**
			* 封面
			*/
			private String falvgaguiPhoto;
			/**
			* 视频
			*/
			private String falvgaguiVideo;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 详情信息
			*/
			private String falvgaguiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public FalvgaguiLiuyanView() {

	}

	public FalvgaguiLiuyanView(FalvgaguiLiuyanEntity falvgaguiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, falvgaguiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set falvgagui
					/**
					* 获取： 名称
					*/
					public String getFalvgaguiName() {
						return falvgaguiName;
					}
					/**
					* 设置： 名称
					*/
					public void setFalvgaguiName(String falvgaguiName) {
						this.falvgaguiName = falvgaguiName;
					}
					/**
					* 获取： 封面
					*/
					public String getFalvgaguiPhoto() {
						return falvgaguiPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setFalvgaguiPhoto(String falvgaguiPhoto) {
						this.falvgaguiPhoto = falvgaguiPhoto;
					}
					/**
					* 获取： 视频
					*/
					public String getFalvgaguiVideo() {
						return falvgaguiVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setFalvgaguiVideo(String falvgaguiVideo) {
						this.falvgaguiVideo = falvgaguiVideo;
					}
					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}
					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}
					/**
					* 获取： 详情信息
					*/
					public String getFalvgaguiContent() {
						return falvgaguiContent;
					}
					/**
					* 设置： 详情信息
					*/
					public void setFalvgaguiContent(String falvgaguiContent) {
						this.falvgaguiContent = falvgaguiContent;
					}

























				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}






}
