package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[Before] Method: " + joinPoint.getSignature().getName());
    }

    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("[AfterReturning] Method: " + joinPoint.getSignature().getName() + " completed successfully.");
    }

    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println("[AfterThrowing] Exception in method: " + joinPoint.getSignature().getName() + " - " + error);
    }

    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object returnValue = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("[Around] Execution time of " + joinPoint.getSignature().getName() + ": " + (endTime - startTime) + " ms");
        return returnValue;
    }
}
