package com.xxl.sso.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxl.sso.server.core.model.UserInfo;
import com.xxl.sso.server.core.result.ReturnT;

public interface UserService extends IService<UserInfo> {

    public ReturnT<UserInfo> findUser(String username, String password);

}
