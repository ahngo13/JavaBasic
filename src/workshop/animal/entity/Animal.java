package workshop.animal.entity;

/*
	추상클래스는 추상메서드를 반드시 하나 가져야 할까요?
	-> 없을 수도 있다.
	
	Animal ani = new Animal(); (x) 스스로 객체를 생성할 수 없다.
	자식클래스를 통해서 객체생성이 가능하다.
	Animal fish = new Fish(); (o)
*/

public abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	// 추상 메서드라 바디가 있으면 안됨
	public abstract void eat();
	
	public void walk() {
		System.out.println("동물은" + this.legs + "개의 다리로 걷는다!");
	}
}
