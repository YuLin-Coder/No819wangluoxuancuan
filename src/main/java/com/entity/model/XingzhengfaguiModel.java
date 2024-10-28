package com.entity.model;

import com.entity.XingzhengfaguiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 行政法规
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-12
 */
public class XingzhengfaguiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 名称
     */
    private String xingzhengfaguiName;


    /**
     * 图片
     */
    private String xingzhengfaguiPhoto;


    /**
     * 时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 详情
     */
    private String xingzhengfaguiContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：名称
	 */
    public String getXingzhengfaguiName() {
        return xingzhengfaguiName;
    }


    /**
	 * 设置：名称
	 */
    public void setXingzhengfaguiName(String xingzhengfaguiName) {
        this.xingzhengfaguiName = xingzhengfaguiName;
    }
    /**
	 * 获取：图片
	 */
    public String getXingzhengfaguiPhoto() {
        return xingzhengfaguiPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setXingzhengfaguiPhoto(String xingzhengfaguiPhoto) {
        this.xingzhengfaguiPhoto = xingzhengfaguiPhoto;
    }
    /**
	 * 获取：时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：详情
	 */
    public String getXingzhengfaguiContent() {
        return xingzhengfaguiContent;
    }


    /**
	 * 设置：详情
	 */
    public void setXingzhengfaguiContent(String xingzhengfaguiContent) {
        this.xingzhengfaguiContent = xingzhengfaguiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
