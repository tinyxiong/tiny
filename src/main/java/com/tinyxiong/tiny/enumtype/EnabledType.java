package com.tinyxiong.tiny.enumtype;

public enum EnabledType {

    ENABLED("无效", "0"),
    DISABLED("有效", "1");

    private String name;

    private String value;

    EnabledType(String name, String value) {
        this.name = name ;
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }
}
