package com.xxl.sso.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxl.sso.server.core.model.RoleInfo;

import java.util.List;

public interface RoleService extends IService<RoleInfo> {

    public List<RoleInfo> listRolesByIds(String ids);

}
