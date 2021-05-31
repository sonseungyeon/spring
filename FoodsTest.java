package mySpring.ex02;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class FoodsTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("mySpring/ex02/springContext.xml");
		
		FavoritFoods ff = ctx.getBean("foods", FavoritFoods.class);
		List<String> foodList = ff.getFoods();
		for(String string:foodList) {
			System.out.println(string);
		}
		
		User user = ctx.getBean("user",User.class);
		System.out.println("이름 : " + user.getName());
		System.out.println("나이 : " + user.getAge());
		System.out.println("좋아하는 음식 : " + user.getFavoritFoods().getFoods());
	}
}
