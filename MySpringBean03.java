package mySpring.ex03;

public class MySpringBean03 {
	private String name;
	
	public MySpringBean03() {
		
	}

	public MySpringBean03(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MySpringBean03 [name=" + name + "]";
	}
	
	
}
