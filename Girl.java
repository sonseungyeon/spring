package spring03.aop.ex03.annotation;

import org.springframework.stereotype.Component;

//핵심 기능을 갖은 클래스
@Component
public class Girl {
	public String doSomething() {
//		System.out.println("문을 열고 집에 들어간다.");
		System.out.println("집에서 티비를 본다.");//핵심
//		System.out.println("문을 닫고 집을 나온다.");
		
		//1/2 확률로 예외를 발생시키기 위함 -> 예외테스트 목적
		int num = (int)(Math.random()*2);
		if(num ==0) {
			throw new ArithmeticException();
		}
		return "i am a girl";
	}
}
