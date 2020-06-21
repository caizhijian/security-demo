package com.czj.modules.user.service;

import com.czj.modules.user.dao.SysUserRoleMapper;
import com.czj.modules.user.domain.entity.SysUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:caizhijian
 * @Date:2020-06-21
 */
@Service
public class SysUserRoleService {
    @Autowired
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer userId) {
        return userRoleMapper.listByUserId(userId);
    }
}
