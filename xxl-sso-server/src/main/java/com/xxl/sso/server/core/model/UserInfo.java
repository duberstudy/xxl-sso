package com.xxl.sso.server.core.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xuxueli 2018-03-22 23:51:51
 */
@TableName("blade_user")
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String PATTERN_DATETIME = "yyyy-MM-dd HH:mm:ss";

    /**
     * 主键id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    /**
     * 创建人
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long createUser;

    /**
     * 创建部门
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long createDept;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = PATTERN_DATETIME)
    @JsonFormat(pattern = PATTERN_DATETIME)
    private Date createTime;

    /**
     * 更新人
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long updateUser;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = PATTERN_DATETIME)
    @JsonFormat(pattern = PATTERN_DATETIME)
    private Date updateTime;

    /**
     * 状态[1:正常]
     */
    private Integer status;

    /**
     * 状态[0:未删除,1:删除]
     */
    private Integer isDeleted;
    /**
     * 账号
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    private String name;
    /**
     * 真名
     */
    private String realName;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机
     */
    private String phone;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 角色id
     */
    private String roleId;
    /**
     * 部门id
     */
    private String deptId;
    /**
     * 租户ID
     */
    private String tenantId;


}
