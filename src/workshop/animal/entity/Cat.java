package workshop.animal.entity;

public class Cat extends Animal implements Pet {
	private String name;
	
	public Cat(String name) {
		super(4);
		this.name = name;
	}
	
	public Cat() {
		//생성자 끼리 호출할 때는 this();
		this(""); //따로 넘겨줄 필요가 없으므로 공백을 넘겨준다.
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
		System.out.println("고양이는 쥐랑 놀아요");
	}

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 먹어요");
	}

}
