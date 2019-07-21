package org.free.manage.framework;

import lombok.Getter;
import lombok.Setter;

/**
 * 自定义异常
 */
@Getter
@Setter
public class MessageException extends RuntimeException {

	private static final long serialVersionUID = -4808753494088414214L;
	
	private String code;
    private String msg;

    public MessageException(String code,String message){
        super(message);
        this.code = code;
    }
}
