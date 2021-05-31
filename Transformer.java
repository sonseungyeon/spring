package mySpring.ex04;

public class Transformer {
	private Attack attack;
	private String name;
	
	public Transformer(String name) {
		super();
		this.name = name;
	}
	
	public Transformer() {
		super();
	}

	public void setAttack(Attack attack) {
		this.attack = attack;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void fight() {
		System.out.println(name+"이");
		attack.attack();
	}

	
	
}
