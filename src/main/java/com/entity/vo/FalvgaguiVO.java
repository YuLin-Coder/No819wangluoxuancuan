package com.entity.vo;

import com.entity.FalvgaguiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 法律法规
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("falvgagui")
public class FalvgaguiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 名称
     */

    @TableField(value = "falvgagui_name")
    private String falvgaguiName;


    /**
     * 封面
     */

    @TableField(value = "falvgagui_photo")
    private String falvgaguiPhoto;


    /**
     * 视频
     */

    @TableField(value = "falvgagui_video")
    private String falvgaguiVideo;


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

    @TableField(value = "falvgagui_content")
    private String falvgaguiContent;


    /**
     * 创建时间 show2 show1 photoShow
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
    public String getFalvgaguiName() {
        return falvgaguiName;
    }


    /**
	 * 获取：名称
	 */

    public void setFalvgaguiName(String falvgaguiName) {
        this.falvgaguiName = falvgaguiName;
    }
    /**
	 * 设置：封面
	 */
    public String getFalvgaguiPhoto() {
        return falvgaguiPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setFalvgaguiPhoto(String falvgaguiPhoto) {
        this.falvgaguiPhoto = falvgaguiPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getFalvgaguiVideo() {
        return falvgaguiVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setFalvgaguiVideo(String falvgaguiVideo) {
        this.falvgaguiVideo = falvgaguiVideo;
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
    public String getFalvgaguiContent() {
        return falvgaguiContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setFalvgaguiContent(String falvgaguiContent) {
        this.falvgaguiContent = falvgaguiContent;
    }
    /**
	 * 设置：创建时间 show2 show1 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 show1 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
