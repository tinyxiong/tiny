package com.tinyxiong.tiny.domain;

import com.tinyxiong.tiny.enumtype.EnabledType;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String password;

    private String phone;

    @Enumerated(EnumType.ORDINAL)
    private EnabledType enabled;

    private Long orgId;

    private String createTime;

    public void disable() {
        setEnabled(EnabledType.ENABLED);
    }

    public void enable() {
        setEnabled(EnabledType.ENABLED);
    }
}
