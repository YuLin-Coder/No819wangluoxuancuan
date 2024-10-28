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
 * 规范文件
 *
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("guifanwenjian")
public class GuifanwenjianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GuifanwenjianEntity() {

	}

	public GuifanwenjianEntity(T t) {
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
    @TableField(value = "guifanwenjian_name")

    private String guifanwenjianName;


    /**
     * 封面
     */
    @TableField(value = "guifanwenjian_photo")

    private String guifanwenjianPhoto;


    /**
     * 文件
     */
    @TableField(value = "guifanwenjian_file")

    private String guifanwenjianFile;


    /**
     * 详情
     */
    @TableField(value = "guifanwenjian_content")

    private String guifanwenjianContent;


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
    public String getGuifanwenjianName() {
        return guifanwenjianName;
    }


    /**
	 * 获取：标题
	 */

    public void setGuifanwenjianName(String guifanwenjianName) {
        this.guifanwenjianName = guifanwenjianName;
    }
    /**
	 * 设置：封面
	 */
    public String getGuifanwenjianPhoto() {
        return guifanwenjianPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setGuifanwenjianPhoto(String guifanwenjianPhoto) {
        this.guifanwenjianPhoto = guifanwenjianPhoto;
    }
    /**
	 * 设置：文件
	 */
    public String getGuifanwenjianFile() {
        return guifanwenjianFile;
    }


    /**
	 * 获取：文件
	 */

    public void setGuifanwenjianFile(String guifanwenjianFile) {
        this.guifanwenjianFile = guifanwenjianFile;
    }
    /**
	 * 设置：详情
	 */
    public String getGuifanwenjianContent() {
        return guifanwenjianContent;
    }


    /**
	 * 获取：详情
	 */

    public void setGuifanwenjianContent(String guifanwenjianContent) {
        this.guifanwenjianContent = guifanwenjianContent;
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
        return "Guifanwenjian{" +
            "id=" + id +
            ", guifanwenjianName=" + guifanwenjianName +
            ", guifanwenjianPhoto=" + guifanwenjianPhoto +
            ", guifanwenjianFile=" + guifanwenjianFile +
            ", guifanwenjianContent=" + guifanwenjianContent +
            ", createTime=" + createTime +
        "}";
    }
}
