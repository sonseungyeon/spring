package MySpring.ex03;

public class TaeKwonV {
//	punch attack , missail attack 둘다 사용 가능하도록 attack을 선언
	private Attack attack;
	private String name;
	
	//외부주입!
	public TaeKwonV(Attack attack, String name) {
		super();
		this.attack = attack;
		this.name = name;
	}
	
	public void fight() {
		System.out.println(name+"이");
		attack.attack();
	}
	
	public TaeKwonV() {
		super();
	}

	public Attack getAttack() {
		return attack;
	}

	public void setAttack(Attack attack) {
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
