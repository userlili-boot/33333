package org.free.manage.controller;

import org.free.manage.framework.Result;
import reactor.core.publisher.Mono;

public class BaseController {

    protected <T> Mono<Result<T>> ok(T data){
        return Mono.just(Result.ok(data));
    }
    protected  Mono<Result<Void>> error(String code,String message){
        return Mono.just(Result.error(code,message));
    }

}
