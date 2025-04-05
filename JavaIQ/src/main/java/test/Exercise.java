package test;

/*import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;*/

public class Exercise {

    public static void main(String[] args) {

    }
}

/*
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {

}

@Aspect
@Component
class LoggingAspect {

    @Around("@annotation(LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Start");
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        System.out.println(executionTime);
        System.out.println("End");
        return proceed;
    }
}


@RestController
class T2 {

    @LogExecutionTime
    @GetMapping("/t2")
    public String t2() throws InterruptedException {
        Thread.sleep(2000);
        return "t2 method";
    }
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyCustomAnnotation {
    String value() default "";
}


@Aspect
@Component
class MyCustomAnnotationAspect {

    @Before("@annotation(myCustomAnnotation)")
    public void  beforeMethod(JoinPoint joinPoint, MyCustomAnnotation myCustomAnnotation) {
        System.out.println("Before Method: " + joinPoint.getSignature());
        for(Object obj: joinPoint.getArgs()) {
            System.out.println(obj);
        }
        System.out.println("Annotation Value: " + myCustomAnnotation.value());

    }

    @After("@annotation(myCustomAnnotation)")
    public void afterMethod(JoinPoint joinPoint, MyCustomAnnotation myCustomAnnotation) {
        System.out.println("After Method: " + joinPoint.getSignature());
        System.out.println("Annotation Value: " + myCustomAnnotation.value());
    }
}


@RestController
class T1 {

    @GetMapping("/t1")
    @MyCustomAnnotation("Testing Annotation")
    public String t1(@RequestParam String qp, @RequestBody String body) {
        return "t1() method";
    }
}*/
