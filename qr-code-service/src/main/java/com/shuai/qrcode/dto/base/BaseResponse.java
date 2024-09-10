package com.shuai.qrcode.dto.base;

import lombok.Data;

/**
 * Description:  用一句话描述该文件做什么
 *
 * @author LS
 * @date 2024-09-10 23:20:00
 */
@Data
public class BaseResponse<T> {

    private int code;
    private String message;
    private T info;

    public BaseResponse(int code, String message, T info) {
        this.code = code;
        this.message = message;
        this.info = info;
    }
}
