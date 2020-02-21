package com.xxl.sso.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxl.sso.server.core.model.RoleInfo;
import com.xxl.sso.server.mapper.RoleInfoMapper;
import com.xxl.sso.server.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {

    private RoleInfoMapper roleInfoMapper;

    @Override
    public List<RoleInfo> listRolesByIds(String ids) {
        if (ids == null || ids.length() <= 0){
            return new ArrayList<>();
        }
        String[] idArr = ids.split(",");
        List<String> idList = Arrays.asList(idArr);
        return roleInfoMapper.selectBatchIds(idList);
    }

    @Override
    public boolean saveBatch(Collection<RoleInfo> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<RoleInfo> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<RoleInfo> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(RoleInfo entity) {
        return false;
    }

    @Override
    public RoleInfo getOne(Wrapper<RoleInfo> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<RoleInfo> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<RoleInfo> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<RoleInfo> getBaseMapper() {
        return null;
    }


}
