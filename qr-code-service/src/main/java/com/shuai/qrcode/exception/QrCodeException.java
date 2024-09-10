package com.shuai.qrcode.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description:  用一句话描述该文件做什么
 *
 * @author LS
 * @date 2024-09-10 23:37:00
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class QrCodeException extends RuntimeException {

    protected Integer code;
    protected String msg;


    public QrCodeException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
