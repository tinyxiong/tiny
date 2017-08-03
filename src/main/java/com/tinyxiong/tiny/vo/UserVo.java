package com.tinyxiong.tiny.vo;

import com.tinyxiong.tiny.enumtype.EnabledType;
import lombok.Data;

@Data
public class UserVo {

    private String name;

    private String password;

    private String phone;

    private EnabledType enabled;

    private Long orgId;
}
