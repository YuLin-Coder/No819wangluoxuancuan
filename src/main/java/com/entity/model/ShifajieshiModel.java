package com.entity.model;

import com.entity.ShifajieshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 司法解释
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-12
 */
public class ShifajieshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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


    /**
     * 创建时间 show1 show2 photoShow
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
    public String getShifajieshiName() {
        return shifajieshiName;
    }


    /**
	 * 设置：名称
	 */
    public void setShifajieshiName(String shifajieshiName) {
        this.shifajieshiName = shifajieshiName;
    }
    /**
	 * 获取：封面
	 */
    public String getShifajieshiPhoto() {
        return shifajieshiPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setShifajieshiPhoto(String shifajieshiPhoto) {
        this.shifajieshiPhoto = shifajieshiPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getShifajieshiVideo() {
        return shifajieshiVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setShifajieshiVideo(String shifajieshiVideo) {
        this.shifajieshiVideo = shifajieshiVideo;
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
    public String getShifajieshiContent() {
        return shifajieshiContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setShifajieshiContent(String shifajieshiContent) {
        this.shifajieshiContent = shifajieshiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
