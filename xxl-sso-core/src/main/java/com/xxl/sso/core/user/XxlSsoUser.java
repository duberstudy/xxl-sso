package com.xxl.sso.core.user;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * xxl sso user
 *
 * @author xuxueli 2018-04-02 19:59:49
 */
@Data
public class XxlSsoUser implements Serializable {
    private static final long serialVersionUID = 42L;
    private static final String PATTERN_DATETIME = "yyyy-MM-dd HH:mm:ss";

    // field
//    private String userid;
//    private String username;
    private Map<String, String> plugininfo;

    private String version;
    private int expireMinute;
    private long expireFreshTime;



    /**
     * 主键id
     */
    private Long id;

    /**
     *用户id，就是主键id
     */
    private Long userId;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 创建部门
     */
    private Long createDept;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private Long updateUser;

    /**
     * 更新时间
     */
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

    /**
     * 角色集合，以 "," 分隔
     */
    private String roleName;


    // set get

    public Long getUserId() {
        return id;
    }
}
