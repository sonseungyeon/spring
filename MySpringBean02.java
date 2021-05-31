package mySpring.ex01;

import java.util.List;

public class MySpringBean02 {
	List<String> foods;

	public MySpringBean02() {
		
	}
	
	public MySpringBean02(List<String> foods) {
		super();
		this.foods = foods;
	}

	public List<String> getFoods() {
		return foods;
	}

	public void setFoods(List<String> foods) {
		this.foods = foods;
	}

	@Override
	public String toString() {
		return "MySpringBean02 [foods=" + foods + "]";
	}
	
	
}
