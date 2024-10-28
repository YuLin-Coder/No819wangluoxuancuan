package com.entity.vo;

import com.entity.XingzhengfaguiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 行政法规
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("xingzhengfagui")
public class XingzhengfaguiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 名称
     */

    @TableField(value = "xingzhengfagui_name")
    private String xingzhengfaguiName;


    /**
     * 图片
     */

    @TableField(value = "xingzhengfagui_photo")
    private String xingzhengfaguiPhoto;


    /**
     * 时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 详情
     */

    @TableField(value = "xingzhengfagui_content")
    private String xingzhengfaguiContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：名称
	 */
    public String getXingzhengfaguiName() {
        return xingzhengfaguiName;
    }


    /**
	 * 获取：名称
	 */

    public void setXingzhengfaguiName(String xingzhengfaguiName) {
        this.xingzhengfaguiName = xingzhengfaguiName;
    }
    /**
	 * 设置：图片
	 */
    public String getXingzhengfaguiPhoto() {
        return xingzhengfaguiPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setXingzhengfaguiPhoto(String xingzhengfaguiPhoto) {
        this.xingzhengfaguiPhoto = xingzhengfaguiPhoto;
    }
    /**
	 * 设置：时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：详情
	 */
    public String getXingzhengfaguiContent() {
        return xingzhengfaguiContent;
    }


    /**
	 * 获取：详情
	 */

    public void setXingzhengfaguiContent(String xingzhengfaguiContent) {
        this.xingzhengfaguiContent = xingzhengfaguiContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
