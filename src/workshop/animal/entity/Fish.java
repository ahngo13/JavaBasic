package workshop.animal.entity;

public class Fish extends Animal implements Pet {
	private String name;
	
	public Fish(String name) {
		super(0);
		this.name = name;
	}
	
	public Fish() {
		//생성자 끼리 호출
		this("");
	}
	
	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void play() {
		System.out.println("물고기는 헤엄치며 놀아요");
	}

	@Override
	public void eat() {
		System.out.println("물고기는 떡밥을 먹어요");
	}
	
	//내부 구현 방식이 다르기 때문에 오버라이딩 해준다.
	//물고기는 걷는 기능이 없음.
	@Override
	public void walk() {
		super.walk();
	}

}
