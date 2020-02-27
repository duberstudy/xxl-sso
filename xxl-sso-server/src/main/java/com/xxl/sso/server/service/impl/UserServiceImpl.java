package com.xxl.sso.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxl.sso.server.core.model.UserInfo;
import com.xxl.sso.server.core.result.ReturnT;
import com.xxl.sso.server.mapper.UserInfoMapper;
import com.xxl.sso.server.service.UserService;
import com.xxl.sso.server.util.DigestUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserInfoMapper userInfoMapper;


    private static List<UserInfo> mockUserList = new ArrayList<>();
    static {
        UserInfo userInfo = new UserInfo();
        long l = 1000;
        userInfo.setId(l);
        userInfo.setAccount("admin");
        userInfo.setName("admin");
        userInfo.setPassword("123456");
        mockUserList.add(userInfo);
        /*for (int i = 0; i <5; i++) {
            UserInfo userInfo = new UserInfo();
            long l = 1000+i;
            userInfo.setId(l);
            userInfo.setName("user" + (i>0?String.valueOf(i):""));
            userInfo.setPassword("123456");
            mockUserList.add(userInfo);
        }*/
    }

    @Override
    public ReturnT<UserInfo> findUser(String account, String password) {

        if (account==null || account.trim().length()==0) {
            return new ReturnT<UserInfo>(ReturnT.FAIL_CODE, "请输入用户名！");
        }
        if (password==null || password.trim().length()==0) {
            return new ReturnT<UserInfo>(ReturnT.FAIL_CODE, "请输入密码！");
        }

        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account",account);
        queryWrapper.eq("password", DigestUtil.encrypt(password));
        UserInfo result = getOne(queryWrapper);
        if (result != null){
            return new ReturnT<UserInfo>(result);
        }

        return new ReturnT<UserInfo>(ReturnT.FAIL_CODE, "用户名或密码错误！");
    }


    @Override
    public boolean saveBatch(Collection<UserInfo> entityList, int batchSize) {
        if (entityList == null || entityList.size() <= 0){
            return false;
        }
        entityList.forEach(item -> userInfoMapper.insert(item));
        return true;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<UserInfo> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<UserInfo> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(UserInfo entity) {
        return false;
    }

    @Override
    public UserInfo getOne(Wrapper<UserInfo> queryWrapper, boolean throwEx) {
        return userInfoMapper.selectOne(queryWrapper);
    }

    @Override
    public Map<String, Object> getMap(Wrapper<UserInfo> queryWrapper) {
        List<Map<String, Object>> maps = userInfoMapper.selectMaps(queryWrapper);
        if (maps == null || maps.size() <=0){
            return new HashMap<>();
        }
        return maps.get(0);
    }

    @Override
    public <V> V getObj(Wrapper<UserInfo> queryWrapper, Function<? super Object, V> mapper) {
        List<Object> objects = userInfoMapper.selectObjs(queryWrapper);
        if (objects == null || objects.size() <= 0){
            return null;
        }
        return (V) objects.get(0);
    }

    @Override
    public BaseMapper<UserInfo> getBaseMapper() {
        return userInfoMapper;
    }
}
