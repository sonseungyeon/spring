package mySpring.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class RobotTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("MySpring/ex03/springContext.xml");

		TaeKwonV tv = ctx.getBean("taeKwonV",TaeKwonV.class);
		Transformer tf = ctx.getBean("transformer",Transformer.class);
		
		tv.fight();
		tf.fight();
	}
}
