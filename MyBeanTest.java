package mySpring.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import mySpring.ex03.MySpringBean03;

public class MyBeanTest {
	public static void main(String[] args) {
		//스프링 컨테이너 객체를 만들어줌
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("mySpring/ex01/springContext.xml");
		
		System.out.println("스프링 컨텍스트 객체 생성");
		System.out.println(ctx);
		
		//스프링 컨테이너에 들어있는 빈을 꺼내보자
		//오브젝트 객체로 가져오기 때문에 MySpringBean 자료형으로 형변환해서 넣어줘야함.
		//오브젝트로 가져오는 이유는 모든 형들을 예상하고 가져오게끔 한것.
		MySpringBean msb = (MySpringBean)ctx.getBean("mySpringBean");
		
		msb.setStr1("가렌");
		msb.setStr2("럭스");
		System.out.println(msb);
		
		MySpringBean msb2 = (MySpringBean)ctx.getBean("mySpringBean");
		System.out.println(msb2);
		
		MySpringBean02 msb02 = (MySpringBean02)ctx.getBean("mySpringBean02");
		System.out.println(msb02);
		
		MySpringBean03 msb03 = ctx.getBean("mySpringBean03", MySpringBean03.class);
		System.out.println(msb03);
	}
	
}
