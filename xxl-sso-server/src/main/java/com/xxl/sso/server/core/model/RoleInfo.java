package com.xxl.sso.server.core.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.io.Serializable;

/**
 * @author xuxueli 2018-03-22 23:51:51
 */
@TableName("blade_role")
@Data
public class RoleInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String PATTERN_DATETIME = "yyyy-MM-dd HH:mm:ss";

    /**
     * 主键id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    /**
     * 租户ID
     */
    private String tenantId;

    @JsonSerialize(using = ToStringSerializer.class)
    private Long parentId;

    private String roleName;

    private int sort;

    private String roleAlias;

    private int isDeleted;


}
