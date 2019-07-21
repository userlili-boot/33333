package org.free.manage.framework;

import lombok.Data;

/**
 * 自定义异常
 */
@Data
public class MessageException extends RuntimeException {

    private String code;
    private String msg;

    public MessageException(String code,String message){
        super(message);
        this.code = code;
    }
}
