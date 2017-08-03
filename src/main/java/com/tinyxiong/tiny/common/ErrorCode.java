package com.tinyxiong.tiny.common;

import java.util.HashMap;
import java.util.Map;

public enum ErrorCode {

    OBJECT_NOT_FOUND("001-对象不存在"),
    NO_LOGIN("002- 验证信息已经丢失"),//CLOSED_RETURN
    MONTH_END_UN_CLOSED_ERROR("003- 已处于未关账状态,不需要进行未关账操作"),
    MONTH_END_CLOSED_ERROR("004- 关账的前置条件是未关账，请检查月结状态"),
    MONTH_END_CLOSED_RETURN_ERROR("005- 反关账的前置条件是已关账或者已结账，请检查月结状态"),
    MONTH_END_CLOSED_AND_END_ERROR("006- 结账的前置条件是已关账，请检查月结状态"),
    MONEY_IN_OR_OUT_ERROR("007- 已关账或者结账,不能进行资金进出操作"),;

    /**
     * The Constant value.
     */
    private final String value;

    /**
     * The Constant STRING_TO_ENUM.
     */
    private static final Map<String, ErrorCode> STRING_TO_ENUM = new HashMap<String, ErrorCode>();

    static {
        for (ErrorCode e : values())
            STRING_TO_ENUM.put(e.getValue(), e);
    }

    ErrorCode(String value) {
        this.value = value;
    }

    /**
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * @return
     */
    public Integer getErrorCode() {
        String[] error = value.split("-");
        return Integer.valueOf(error[0]);
    }

    /**
     * @return
     */
    public String getErrorString() {
        String[] error = value.split("-");
        return error.length > 1 ? error[1] : "";
    }

    /**
     * @param errorCode
     * @return
     */
    public String getErrorString(String errorCode) {
        return STRING_TO_ENUM.get(errorCode).getErrorString();
    }
}
