package org.free.manage.framework;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Configuration
@ControllerAdvice
public class ControllerExceptionAdvice {

    @ResponseBody
    @ExceptionHandler(MessageException.class)
    public Result<Void> messageException(MessageException e){
        return Result.error(e.getCode(),e.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Result<Void> exception(Exception e){
        log.error(e.getMessage(),e);
        return Result.error(HttpStatus.INTERNAL_SERVER_ERROR.value()+"",e.getMessage());
    }

}
