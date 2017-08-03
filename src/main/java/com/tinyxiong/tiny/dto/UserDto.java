package com.tinyxiong.tiny.dto;

import com.tinyxiong.tiny.enumtype.EnabledType;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String name;

    private String password;

    private String phone;

    private EnabledType enabled;

    private Long orgId;

}
