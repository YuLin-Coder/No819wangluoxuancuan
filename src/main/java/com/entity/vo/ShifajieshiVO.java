package com.entity.vo;

import com.entity.ShifajieshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 司法解释
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("shifajieshi")
public class ShifajieshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 名称
     */

    @TableField(value = "shifajieshi_name")
    private String shifajieshiName;


    /**
     * 封面
     */

    @TableField(value = "shifajieshi_photo")
    private String shifajieshiPhoto;


    /**
     * 视频
     */

    @TableField(value = "shifajieshi_video")
    private String shifajieshiVideo;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 详情信息
     */

    @TableField(value = "shifajieshi_content")
    private String shifajieshiContent;


    /**
     * 创建时间 show1 show2 photoShow
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
    public String getShifajieshiName() {
        return shifajieshiName;
    }


    /**
	 * 获取：名称
	 */

    public void setShifajieshiName(String shifajieshiName) {
        this.shifajieshiName = shifajieshiName;
    }
    /**
	 * 设置：封面
	 */
    public String getShifajieshiPhoto() {
        return shifajieshiPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setShifajieshiPhoto(String shifajieshiPhoto) {
        this.shifajieshiPhoto = shifajieshiPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getShifajieshiVideo() {
        return shifajieshiVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setShifajieshiVideo(String shifajieshiVideo) {
        this.shifajieshiVideo = shifajieshiVideo;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：详情信息
	 */
    public String getShifajieshiContent() {
        return shifajieshiContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setShifajieshiContent(String shifajieshiContent) {
        this.shifajieshiContent = shifajieshiContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
