package com.entity.view;

import com.entity.ShifajieshiCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 司法解释收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("shifajieshi_collection")
public class ShifajieshiCollectionView extends ShifajieshiCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 shifajieshi
			/**
			* 名称
			*/
			private String shifajieshiName;
			/**
			* 封面
			*/
			private String shifajieshiPhoto;
			/**
			* 视频
			*/
			private String shifajieshiVideo;
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
			private String shifajieshiContent;

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

	public ShifajieshiCollectionView() {

	}

	public ShifajieshiCollectionView(ShifajieshiCollectionEntity shifajieshiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, shifajieshiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

























				//级联表的get和set shifajieshi
					/**
					* 获取： 名称
					*/
					public String getShifajieshiName() {
						return shifajieshiName;
					}
					/**
					* 设置： 名称
					*/
					public void setShifajieshiName(String shifajieshiName) {
						this.shifajieshiName = shifajieshiName;
					}
					/**
					* 获取： 封面
					*/
					public String getShifajieshiPhoto() {
						return shifajieshiPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setShifajieshiPhoto(String shifajieshiPhoto) {
						this.shifajieshiPhoto = shifajieshiPhoto;
					}
					/**
					* 获取： 视频
					*/
					public String getShifajieshiVideo() {
						return shifajieshiVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setShifajieshiVideo(String shifajieshiVideo) {
						this.shifajieshiVideo = shifajieshiVideo;
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
					public String getShifajieshiContent() {
						return shifajieshiContent;
					}
					/**
					* 设置： 详情信息
					*/
					public void setShifajieshiContent(String shifajieshiContent) {
						this.shifajieshiContent = shifajieshiContent;
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
