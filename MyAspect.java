package spring03.aop.ex03.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

//	@Before("execution(public String *.doSomething())")
//	public void beforeSomething() {
//		System.out.println("문을 열고 집에 들어간다.");
//	}
//
//	@After("execution(String *.doSomething())")
//	public void afterSomething() {
//		System.out.println("문을 닫고 집을 나온다.");
//	}
//
//	@AfterReturning(pointcut = "execution(String *.doSomething())", returning = "msg")
//	public void afterReturning(String msg) {
//		System.out.println("return 후!");
//		System.out.println("리턴값 : " + msg);
//	}
//	
//	@AfterThrowing(pointcut="execution(String *.doSomething())", throwing = "th")
//	public void afterThrowing(Throwable th) {
//		System.out.println("예외가 발생했슈!!");
//		for(StackTraceElement e : th.getStackTrace()) {
//		}
//		
//	}
	
//	위에를 주석처리하고 실행
	@Around("execution(String *.doSomething())")
	public String around(ProceedingJoinPoint pjp){		
		try {
			System.out.println("집에 들어간다.");
			return (String)pjp.proceed();
		} catch (Throwable e) {
			System.out.println("예외가 발생했슈!");
			return "예외!!";
		}finally {
			System.out.println("집을 나온다.");
		}
		
	}
}
