package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 政策文件
 *
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("zhengchengwenjian")
public class ZhengchengwenjianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhengchengwenjianEntity() {

	}

	public ZhengchengwenjianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zhengchengwenjian{" +
            "id=" + id +
            ", zhengchengwenjianName=" + zhengchengwenjianName +
            ", zhengchengwenjianPhoto=" + zhengchengwenjianPhoto +
            ", zhengchengwenjianFile=" + zhengchengwenjianFile +
            ", zhengchengwenjianContent=" + zhengchengwenjianContent +
            ", createTime=" + createTime +
        "}";
    }
}
