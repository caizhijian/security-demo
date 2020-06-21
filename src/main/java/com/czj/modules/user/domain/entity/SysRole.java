package com.czj.modules.user.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:caizhijian
 * @Date:2020-06-21
 */
@Data
public class SysRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

}
