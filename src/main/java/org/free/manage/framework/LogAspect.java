package org.free.manage.framework;

import static java.lang.String.format;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@EnableAspectJAutoProxy
@Configuration
@Aspect
@Slf4j
public class LogAspect {


    private String appender;

    @Pointcut("@annotation(io.swagger.annotations.ApiOperation)")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void printParameters(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        Object target = joinPoint.getTarget();
        appender = format("%s.%s",target.getClass().getName(),signature.getName());
        log.info("{} 参数：{}", appender,JSONArray.toJSONString(args));
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@AfterReturning(pointcut = "pointCut()",returning = "result")
    public void printResult(JoinPoint joinPoint,Object result){
        if(result instanceof Mono){
            ((Mono)result).subscribe(r -> log.info("{} 结果:{}",appender,JSONObject.toJSONString(r)));
        }
    }
    @AfterThrowing(pointcut = "pointCut()",throwing = "e")
    public void printResult(JoinPoint joinPoint,Exception e){
        log.info("{} 结果: {}",appender,e.getMessage());
    }
}
