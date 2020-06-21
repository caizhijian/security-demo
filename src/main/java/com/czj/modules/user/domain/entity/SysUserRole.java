package com.czj.modules.user.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:caizhijian
 * @Date:2020-06-21
 */
@Data
public class SysUserRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer roleId;

}
