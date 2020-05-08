package workshop.animal.entity;

public class Spider extends Animal{
	
	public Spider() {
		super(8);
	}
	
	@Override
	public void eat() {
		System.out.println("거미는 벌레를 먹는다.");
	}
	
	/*
	 * Implicit super constructor Animal() is undefined for default constructor. Must define an explicit constructor
	 * Animal에 기본 생성자가 있으면 기본생성자를 따라가는데 없으면 마음대로 생성할 수 없으므로 직접 작성해야 함.
	 * The type Spider must implement the inherited abstract method Animal.eat()
	 * 추상 메서드를 구현해줘야 한다.
	 */
}
