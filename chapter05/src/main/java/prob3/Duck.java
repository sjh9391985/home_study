package prob3;

public class Duck extends Bird {
	private String name;

	@Override
	protected void fly() {
		// TODO Auto-generated method stub
		System.out.println("오리("+getName()+")는 날지 않습니다.");
	}

	@Override
	protected void sing() {
		// TODO Auto-generated method stub
		System.out.println("오리("+getName()+")가 소리내어 웁니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "오리의 이름은 "+ name + " 입니다.";
	}
	
}
