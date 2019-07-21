package org.free.manage.framework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result <T> {

    private String code;

    private String msg;

    private T data;

    /**
     * 成功
     * @param data  数据
     * @param <T>   数据类型
     * @return  正确结果
     */
    public static<T> Result<T> ok(T data){

        return new Result<>("10000","success",data);
    }

    /**
     * 失败
     * @param code  错误编码
     * @param message   错误信息
     * @return  结果
     */
    public static Result<Void> error(String code,String message){
        return new Result<>(code,message,null);
    }
}
