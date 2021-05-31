package MySpring.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import MySpring.ex03.MissailAttack;
import MySpring.ex03.PunchAttack;
import MySpring.ex03.TaeKwonV;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("MySpring/ex02/springContext.xml");
		
		Student msb = (Student)ctx.getBean("Student");
		msb.setName("카타리나");
		System.out.println(msb);
		
	}
	

}
