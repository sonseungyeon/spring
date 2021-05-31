package mySpring.ex02;

public class User {
	private String name;
	private int age;
	private FavoritFoods favoritFoods;
	public User(String name, int age, FavoritFoods favoritFoods) {
		super();
		this.name = name;
		this.age = age;
		this.favoritFoods = favoritFoods;
	}
	public User() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public FavoritFoods getFavoritFoods() {
		return favoritFoods;
	}
	public void setFavoritFoods(FavoritFoods favoritFoods) {
		this.favoritFoods = favoritFoods;
	}
	
	
}
