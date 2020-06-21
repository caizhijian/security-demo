package com.czj.modules.user.service;

import com.czj.modules.user.dao.SysRoleMapper;
import com.czj.modules.user.domain.entity.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:caizhijian
 * @Date:2020-06-21
 */
@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }
}
