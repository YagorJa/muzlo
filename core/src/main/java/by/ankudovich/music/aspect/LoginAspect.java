package by.ankudovich.music.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Aspect
@Slf4j
public class LoginAspect {
    @Around(value = "@annotation(by.ankudovich.music.aspect.Logg)")
    public void logAllMethodsWithAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("Страрт " + LocalDate.now() + " был запущен");
        joinPoint.proceed();
        log.info("Конец " + LocalDate.now() + " был завершен");
    }

}
