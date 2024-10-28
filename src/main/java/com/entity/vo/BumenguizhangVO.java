package com.entity.vo;

import com.entity.BumenguizhangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 部门规章
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("bumenguizhang")
public class BumenguizhangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 名称
     */

    @TableField(value = "bumenguizhang_name")
    private String bumenguizhangName;


    /**
     * 图片
     */

    @TableField(value = "bumenguizhang_photo")
    private String bumenguizhangPhoto;


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

    @TableField(value = "bumenguizhang_content")
    private String bumenguizhangContent;


    /**
     * 创建时间 show2 show1 nameShow
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
    public String getBumenguizhangName() {
        return bumenguizhangName;
    }


    /**
	 * 获取：名称
	 */

    public void setBumenguizhangName(String bumenguizhangName) {
        this.bumenguizhangName = bumenguizhangName;
    }
    /**
	 * 设置：图片
	 */
    public String getBumenguizhangPhoto() {
        return bumenguizhangPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setBumenguizhangPhoto(String bumenguizhangPhoto) {
        this.bumenguizhangPhoto = bumenguizhangPhoto;
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
    public String getBumenguizhangContent() {
        return bumenguizhangContent;
    }


    /**
	 * 获取：详情
	 */

    public void setBumenguizhangContent(String bumenguizhangContent) {
        this.bumenguizhangContent = bumenguizhangContent;
    }
    /**
	 * 设置：创建时间 show2 show1 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 show1 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
