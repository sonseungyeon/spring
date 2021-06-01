package spring03.aop.ex02;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	public void beforeDoSomething() {
		System.out.println("문을 세게 열고 집에 들어간다.");
	}
	public void afterDoSomething() {
		System.out.println("문을 닫고 집을 나온다.");
	}
	
	public String afterReturn(String msg) {
		return "애프터 리턴:" + msg;
	}
	
	public String afterThrowing(Throwable th) {
		System.out.println("집이 터졌슈!!");
		
		return "예외 발생";
	}
	
	//핵심기능을 감싸서 실행함
	public String myAround(ProceedingJoinPoint jp) {
		
		try {
			System.out.println("비포");
			//핵심기능의 실행하려던 메서드
			String result= (String)jp.proceed();
			System.out.println("애프터");
			System.out.println("joinPoint proceed() 결과 : " + result);
			
		}catch(Throwable e) {
			e.printStackTrace();
			System.out.println("애프터 쓰로우");
		}
		
		return "test";
	}
}
