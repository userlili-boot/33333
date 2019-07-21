package org.free.manage.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.free.manage.framework.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Api(tags = "测试类")
@RestController
public class TestController {

    @ApiOperation("测试")
    @GetMapping("test")
    public Mono<Result<Void>> test(String userName){

        return Mono.just(Result.ok(null));
    }

}
