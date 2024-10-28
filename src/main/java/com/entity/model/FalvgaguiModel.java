package com.entity.model;

import com.entity.FalvgaguiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 法律法规
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-12
 */
public class FalvgaguiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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


    /**
     * 创建时间 show2 show1 photoShow
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
    public String getFalvgaguiName() {
        return falvgaguiName;
    }


    /**
	 * 设置：名称
	 */
    public void setFalvgaguiName(String falvgaguiName) {
        this.falvgaguiName = falvgaguiName;
    }
    /**
	 * 获取：封面
	 */
    public String getFalvgaguiPhoto() {
        return falvgaguiPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setFalvgaguiPhoto(String falvgaguiPhoto) {
        this.falvgaguiPhoto = falvgaguiPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getFalvgaguiVideo() {
        return falvgaguiVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setFalvgaguiVideo(String falvgaguiVideo) {
        this.falvgaguiVideo = falvgaguiVideo;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：详情信息
	 */
    public String getFalvgaguiContent() {
        return falvgaguiContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setFalvgaguiContent(String falvgaguiContent) {
        this.falvgaguiContent = falvgaguiContent;
    }
    /**
	 * 获取：创建时间 show2 show1 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 show1 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
