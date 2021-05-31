package mySpring.ex02;

import java.util.List;

public class FavoritFoods {
	private List<String> foods;
	
	public FavoritFoods(List<String> foods) {
		this.foods = foods;
	}

	public List<String> getFoods() {
		return foods;
	}
	
	
}
