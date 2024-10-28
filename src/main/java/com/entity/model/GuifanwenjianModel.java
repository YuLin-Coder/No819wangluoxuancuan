package com.entity.model;

import com.entity.GuifanwenjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 规范文件
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-12
 */
public class GuifanwenjianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String guifanwenjianName;


    /**
     * 封面
     */
    private String guifanwenjianPhoto;


    /**
     * 文件
     */
    private String guifanwenjianFile;


    /**
     * 详情
     */
    private String guifanwenjianContent;


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
	 * 获取：标题
	 */
    public String getGuifanwenjianName() {
        return guifanwenjianName;
    }


    /**
	 * 设置：标题
	 */
    public void setGuifanwenjianName(String guifanwenjianName) {
        this.guifanwenjianName = guifanwenjianName;
    }
    /**
	 * 获取：封面
	 */
    public String getGuifanwenjianPhoto() {
        return guifanwenjianPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setGuifanwenjianPhoto(String guifanwenjianPhoto) {
        this.guifanwenjianPhoto = guifanwenjianPhoto;
    }
    /**
	 * 获取：文件
	 */
    public String getGuifanwenjianFile() {
        return guifanwenjianFile;
    }


    /**
	 * 设置：文件
	 */
    public void setGuifanwenjianFile(String guifanwenjianFile) {
        this.guifanwenjianFile = guifanwenjianFile;
    }
    /**
	 * 获取：详情
	 */
    public String getGuifanwenjianContent() {
        return guifanwenjianContent;
    }


    /**
	 * 设置：详情
	 */
    public void setGuifanwenjianContent(String guifanwenjianContent) {
        this.guifanwenjianContent = guifanwenjianContent;
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
