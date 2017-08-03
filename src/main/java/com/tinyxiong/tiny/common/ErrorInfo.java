package com.tinyxiong.tiny.common;

import lombok.Data;

@Data
public class ErrorInfo {

    /** 这个是显示给用户看到的message */
    private String message;
    /** 这个是内部显示看的， 后续会关闭 */
    private String exceptionMsg;

}
