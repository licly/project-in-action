package org.charlie.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 打印日志切面
 *
 * @author Charlie-6327
 * @date 2022/12/28
 */

@Aspect
public class LogAop {

    @Pointcut("execution(* org.charlie.service.impl.*.*(..))")
    public void logPointcut() {}

    @Around("logPointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {

        // 生成TraceID
        // 保存TraceID到MDC中
        // 打印出入餐
        // 打印调用时间消耗
        joinPoint.proceed();

        return null;
    }
}
