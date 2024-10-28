package com.entity.vo;

import com.entity.ZhengchengwenjianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 政策文件
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("zhengchengwenjian")
public class ZhengchengwenjianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "zhengchengwenjian_name")
    private String zhengchengwenjianName;


    /**
     * 封面
     */

    @TableField(value = "zhengchengwenjian_photo")
    private String zhengchengwenjianPhoto;


    /**
     * 文件
     */

    @TableField(value = "zhengchengwenjian_file")
    private String zhengchengwenjianFile;


    /**
     * 详情
     */

    @TableField(value = "zhengchengwenjian_content")
    private String zhengchengwenjianContent;


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
	 * 设置：标题
	 */
    public String getZhengchengwenjianName() {
        return zhengchengwenjianName;
    }


    /**
	 * 获取：标题
	 */

    public void setZhengchengwenjianName(String zhengchengwenjianName) {
        this.zhengchengwenjianName = zhengchengwenjianName;
    }
    /**
	 * 设置：封面
	 */
    public String getZhengchengwenjianPhoto() {
        return zhengchengwenjianPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setZhengchengwenjianPhoto(String zhengchengwenjianPhoto) {
        this.zhengchengwenjianPhoto = zhengchengwenjianPhoto;
    }
    /**
	 * 设置：文件
	 */
    public String getZhengchengwenjianFile() {
        return zhengchengwenjianFile;
    }


    /**
	 * 获取：文件
	 */

    public void setZhengchengwenjianFile(String zhengchengwenjianFile) {
        this.zhengchengwenjianFile = zhengchengwenjianFile;
    }
    /**
	 * 设置：详情
	 */
    public String getZhengchengwenjianContent() {
        return zhengchengwenjianContent;
    }


    /**
	 * 获取：详情
	 */

    public void setZhengchengwenjianContent(String zhengchengwenjianContent) {
        this.zhengchengwenjianContent = zhengchengwenjianContent;
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
